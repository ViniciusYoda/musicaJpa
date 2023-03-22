package org.example.repositories;

import jakarta.persistence.EntityManager;
import org.example.models.Artist;

public class ArtistRepository {

    private EntityManager entityManager;

    public ArtistRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Iterable<Artist> findAll() {
        var jpql = "SELECT c FROM Artist c";
        var query = entityManager.createQuery(jpql, Artist.class);
        var Artist = query.getResultList();
        return Artist;
    }

    public Artist findById(Long id){
        return entityManager.find(Artist.class, id);
    }


    public void InserirArtist(Artist artist){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(artist);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }




    public void AtualizarArtist(Artist artist){
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(artist);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }



    public void InserirOuAtualizarArtist(Artist artist) {
        try {
            entityManager.getTransaction().begin();

            var artist_existente = findById(artist.getArtist_ID());
            if (artist_existente != null)
                entityManager.merge(artist);
            else
                entityManager.persist(artist);

            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
            throw e;
        }
    }



    public void RemoverArtist(long id){
        try {
            entityManager.getTransaction().begin();
            var artist = entityManager.find(Artist.class, id);
            entityManager.remove(artist);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }


    



}
