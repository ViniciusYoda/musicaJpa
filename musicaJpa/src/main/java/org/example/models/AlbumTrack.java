package org.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "albumTrack")
public class AlbumTrack {

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "album_ID")
    private Album album;
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track track;

    public AlbumTrack(Album album, Track track) {
        this.album = album;
        this.track = track;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
}
