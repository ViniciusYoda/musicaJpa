package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private String email;
    private String name;
    private String password;
    private int age;
    private String card_information;
    private double ip_address;
    private String device;

    public Customer(String email, String name, String password, int age, String card_information, double ip_address, String device) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.age = age;
        this.card_information = card_information;
        this.ip_address = ip_address;
        this.device = device;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCard_information() {
        return card_information;
    }

    public void setCard_information(String card_information) {
        this.card_information = card_information;
    }

    public double getIp_address() {
        return ip_address;
    }

    public void setIp_address(double ip_address) {
        this.ip_address = ip_address;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}