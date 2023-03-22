package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long track_ID;
    private String track_name;
    private Double track_length;
    private Double track_size;
    private BigDecimal track_price;
    private String  track_language;
    private String track_producer;
    private String track_songwriters;
    private LocalDate track_released;

    public Track(Long track_ID, String track_name, Double track_length, Double track_size, BigDecimal track_price, String track_language, String track_producer, String track_songwriters, LocalDate track_released) {
        this.track_ID = track_ID;
        this.track_name = track_name;
        this.track_length = track_length;
        this.track_size = track_size;
        this.track_price = track_price;
        this.track_language = track_language;
        this.track_producer = track_producer;
        this.track_songwriters = track_songwriters;
        this.track_released = track_released;
    }

    public Long getTrack_ID() {
        return track_ID;
    }

    public void setTrack_ID(Long track_ID) {
        this.track_ID = track_ID;
    }

    public String getTrack_name() {
        return track_name;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public Double getTrack_length() {
        return track_length;
    }

    public void setTrack_length(Double track_length) {
        this.track_length = track_length;
    }

    public Double getTrack_size() {
        return track_size;
    }

    public void setTrack_size(Double track_size) {
        this.track_size = track_size;
    }

    public BigDecimal getTrack_price() {
        return track_price;
    }

    public void setTrack_price(BigDecimal track_price) {
        this.track_price = track_price;
    }

    public String getTrack_language() {
        return track_language;
    }

    public void setTrack_language(String track_language) {
        this.track_language = track_language;
    }

    public String getTrack_producer() {
        return track_producer;
    }

    public void setTrack_producer(String track_producer) {
        this.track_producer = track_producer;
    }

    public String getTrack_songwriters() {
        return track_songwriters;
    }

    public void setTrack_songwriters(String track_songwriters) {
        this.track_songwriters = track_songwriters;
    }

    public LocalDate getTrack_released() {
        return track_released;
    }

    public void setTrack_released(LocalDate track_released) {
        this.track_released = track_released;
    }
}