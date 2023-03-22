package org.example.repositories;

import jakarta.persistence.EntityManager;
import org.example.models.Genre;

public class GenreRepository {

    private EntityManager entityManager;

    public GenreRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Iterable<Genre> findAll() {
        var jpql = "SELECT c FROM Genre c";
        var query = entityManager.createQuery(jpql, Genre.class);
        var Genre = query.getResultList();
        return Genre;
    }

    public Genre findById(Long id){
        return entityManager.find(Genre.class, id);
    }

    public Genre findByIdNamedQuery(Long id){
        var query = entityManager.createNamedQuery("Genre.findById", Genre.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void InserirGenre(Genre genre){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(genre);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    public void AtualizarGenre(Genre genre){
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(genre);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    public void InserirOuAtualizarGenre(Genre genre) {
        try {
            entityManager.getTransaction().begin();

            var genre_existente = findById(genre.getGenre_ID());
            if (genre_existente != null)
                entityManager.merge(genre);
            else
                entityManager.persist(genre);

            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    public void RemoverGenre(Genre genre){
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(genre);
            entityManager.merge(genre);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }
}
