package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try {
            EntityManagerFactory entityManagerFactory =
                    Persistence.
                            createEntityManagerFactory(
                                    "Musical");

            EntityManager entityManager =
                    entityManagerFactory.
                            createEntityManager();

            entityManager.close();
            entityManagerFactory.close();

            //var DatabaseConfig = new DatabaseConfig();
            //DatabaseConfig.Conectar("Clientes-PU");


            //DatabaseConfig.Fechar();
        }
        catch(Exception e)
        {
            throw e;
        }
    }
}
