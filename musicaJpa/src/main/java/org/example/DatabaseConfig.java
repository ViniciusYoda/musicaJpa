package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DatabaseConfig {

    public EntityManager entityManager;
    public EntityManagerFactory entityManagerFactory;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public void Conectar(String unitPersistenceName)
    {
        entityManagerFactory =
                Persistence.
                        createEntityManagerFactory(
                                unitPersistenceName);

        entityManager = entityManagerFactory.
                createEntityManager();
    }

    public void Fechar()
    {
        entityManager.close();
        entityManagerFactory.close();
    }
}