package org.example.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "purchase")
public class Purchase {

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "email")
    private Customer customer;
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "track_ID")
    private Track track;
    private String payment_method;
    private Date date_;
    private float time_;

    public Purchase(Customer customer, Track track, String payment_method, Date date_, float time_) {
        this.customer = customer;
        this.track = track;
        this.payment_method = payment_method;
        this.date_ = date_;
        this.time_ = time_;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public Date getDate_() {
        return date_;
    }

    public void setDate_(Date date_) {
        this.date_ = date_;
    }

    public float getTime_() {
        return time_;
    }

    public void setTime_(float time_) {
        this.time_ = time_;
    }
}
