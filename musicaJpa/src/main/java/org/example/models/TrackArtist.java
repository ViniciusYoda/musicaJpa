package org.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "trackArtist")
public class TrackArtist {

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track track;
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "artist_ID")
    private Artist artist;
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "artist_ID")
    private Artist featuringArtist;

    public TrackArtist(Track track, Artist artist, Artist featuringArtist) {
        this.track = track;
        this.artist = artist;
        this.featuringArtist = featuringArtist;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getFeaturingArtist() {
        return featuringArtist;
    }

    public void setFeaturingArtist(Artist featuringArtist) {
        this.featuringArtist = featuringArtist;
    }
}
