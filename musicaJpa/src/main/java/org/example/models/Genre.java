package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genre_ID;
    private String genre_name;

    public Genre(Long genre_ID, String genre_name) {
        this.genre_ID = genre_ID;
        this.genre_name = genre_name;
    }

    public Long getGenre_ID() {
        return genre_ID;
    }

    public void setGenre_ID(Long genre_ID) {
        this.genre_ID = genre_ID;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }
}
