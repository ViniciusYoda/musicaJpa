package org.example.models;



import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long album_ID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "artist_ID")
    private Artist artist;
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "record_label_ID")
    private RecordLabel recordLabel;

    private String album_name;
    private String album_type;
    private Date album_released;
    private BigDecimal album_recorded;

    public Album(Long album_ID, Artist artist, RecordLabel recordLabel, String album_name, String album_type, Date album_released, BigDecimal album_recorded) {
        this.album_ID = album_ID;
        this.artist = artist;
        this.recordLabel = recordLabel;
        this.album_name = album_name;
        this.album_type = album_type;
        this.album_released = album_released;
        this.album_recorded = album_recorded;
    }

    public Long getAlbum_ID() {
        return album_ID;
    }

    public void setAlbum_ID(Long album_ID) {
        this.album_ID = album_ID;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public RecordLabel getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(RecordLabel recordLabel) {
        this.recordLabel = recordLabel;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    public Date getAlbum_released() {
        return album_released;
    }

    public void setAlbum_released(Date album_released) {
        this.album_released = album_released;
    }

    public BigDecimal getAlbum_recorded() {
        return album_recorded;
    }

    public void setAlbum_recorded(BigDecimal album_recorded) {
        this.album_recorded = album_recorded;
    }
}
