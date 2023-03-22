package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artist_ID;
    private String artist_name;
    private String artist_type;

    @Column(columnDefinition = "boolean default false")
    private boolean EstaExcluido;

    public Artist(Long artist_ID, String artist_name, String artist_type, boolean estaExcluido) {
        this.artist_ID = artist_ID;
        this.artist_name = artist_name;
        this.artist_type = artist_type;
        EstaExcluido = estaExcluido;
    }

    public Long getArtist_ID() {
        return artist_ID;
    }

    public void setArtist_ID(Long artist_ID) {
        this.artist_ID = artist_ID;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getArtist_type() {
        return artist_type;
    }

    public void setArtist_type(String artist_type) {
        this.artist_type = artist_type;
    }

    public boolean isEstaExcluido() {
        return EstaExcluido;
    }

    public void setEstaExcluido(boolean estaExcluido) {
        EstaExcluido = estaExcluido;
    }
}
