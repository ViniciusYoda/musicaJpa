package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.Artist;
import org.example.models.Genre;
import org.example.models.RecordLabel;
import org.example.repositories.ArtistRepository;
import org.example.repositories.GenreRepository;
import org.example.repositories.RecordLabelRepository;

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

            var artist = new Artist();
            artist.setArtist_name("Ariana");
            artist.setArtist_type("Pop");
            artist.setArtist_name("Ariana Grande");
            var artist2 = new Artist();
            artist2.setArtist_name("Selena Marie Gomez");
            artist2.setArtist_type("Pop");

            var repositorioArtist = new ArtistRepository(entityManager);
            repositorioArtist.findAll();
            repositorioArtist.findById(1l);
            repositorioArtist.InserirArtist(artist);
            repositorioArtist.AtualizarArtist(artist);
            repositorioArtist.InserirArtist(artist2);
            repositorioArtist.RemoverArtist(1);

            var genre = new Genre();
            var genre2 = new Genre();
            var genre3 = new Genre();

            genre.setGenre_name("Pop");
            genre2.setGenre_name("Rock");
            genre.setGenre_name("Rap");
            genre3.setGenre_name("Metalica");



            var repositorioGenre = new GenreRepository(entityManager);
            repositorioGenre.findAll();
            repositorioGenre.InserirGenre(genre);
            repositorioGenre.InserirGenre(genre2);
            repositorioGenre.InserirGenre(genre3);
            repositorioGenre.AtualizarGenre(genre);
            repositorioGenre.RemoverGenre(3);

            var recordLabel = new RecordLabel();
            var recordLabel2 = new RecordLabel();
            var recordLabel3 = new RecordLabel();

            recordLabel.setRecord_label_name("Hybe");
            recordLabel.setWebsite("https://hybecorp.com/eng/main");
            recordLabel2.setRecord_label_name("Gold");
            recordLabel2.setWebsite("https://hybecorp.com/eng/main");
            recordLabel3.setRecord_label_name("Silver");
            recordLabel3.setWebsite("https://hybecorp.com/eng/main");


            var repositorioRecordLabel = new RecordLabelRepository(entityManager);
            repositorioRecordLabel.findAll();
            repositorioRecordLabel.InserirRecordLabel(recordLabel);
            repositorioRecordLabel.InserirRecordLabel(recordLabel2);
            repositorioRecordLabel.InserirRecordLabel(recordLabel3);
            repositorioRecordLabel.RemoverRecordLabel(2);


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
