package org.example.repositories;

import jakarta.persistence.EntityManager;
import org.example.models.Artist;
import org.example.models.RecordLabel;

public class RecordLabelRepository {

    private EntityManager entityManager;

    public RecordLabelRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Iterable<RecordLabel> findAll() {
        var jpql = "SELECT c FROM RecordLabel c";
        var query = entityManager.createQuery(jpql, RecordLabel.class);
        var RecordLabel = query.getResultList();
        return RecordLabel;
    }

    public RecordLabel findById(Long id){
        return entityManager.find(RecordLabel.class, id);
    }

    public RecordLabel findByIdNamedQuery(Long id){
        var query = entityManager.createNamedQuery("RecordLabel.findById", RecordLabel.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void InserirRecordLabel(RecordLabel recordLabel){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(recordLabel);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    public void AtualizarRecordLabel(RecordLabel recordLabel){
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(recordLabel);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    public void InserirOuAtualizarRecordLabel(RecordLabel recordLabel) {
        try {
            entityManager.getTransaction().begin();

            var recordLabel_existente = findById(recordLabel.getRecord_label_ID());
            if (recordLabel_existente != null)
                entityManager.merge(recordLabel);
            else
                entityManager.persist(recordLabel);

            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    public void RemoverRecordLabel(long id){
        try {
            entityManager.getTransaction().begin();
            var recordLabel = entityManager.find(RecordLabel.class, id);
            entityManager.remove(recordLabel);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

}
