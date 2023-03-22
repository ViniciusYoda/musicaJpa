package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recordLabel")
public class RecordLabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long record_label_ID;
    private String record_label_name;
    private String website;

    public RecordLabel(Long record_label_ID, String record_label_name, String website) {
        this.record_label_ID = record_label_ID;
        this.record_label_name = record_label_name;
        this.website = website;
    }

    public Long getRecord_label_ID() {
        return record_label_ID;
    }

    public void setRecord_label_ID(Long record_label_ID) {
        this.record_label_ID = record_label_ID;
    }

    public String getRecord_label_name() {
        return record_label_name;
    }

    public void setRecord_label_name(String record_label_name) {
        this.record_label_name = record_label_name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
