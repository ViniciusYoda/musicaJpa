package org.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "genreTrack")
public class GenreTrack {

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "genre_ID")
    private Genre genre;
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track track;

    public GenreTrack(Genre genre, Track track) {
        this.genre = genre;
        this.track = track;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre_ID(Genre genre) {
        this.genre = genre;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
}
