package com.example.CarShare.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private int initialCounter;
    private int finalCounter;
    private double cost;
    private int correct;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


    public Ride() {
    }

    public Ride(Long id, String date, int initialCounter, int finalCounter, double cost, int correct, User user) {
        this.id = id;
        this.date = date;
        this.initialCounter = initialCounter;
        this.finalCounter = finalCounter;
        this.cost = cost;
        this.correct = correct;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getInitialCounter() {
        return initialCounter;
    }

    public void setInitialCounter(int initialCounter) {
        this.initialCounter = initialCounter;
    }

    public int getFinalCounter() {
        return finalCounter;
    }

    public void setFinalCounter(int finalCounter) {
        this.finalCounter = finalCounter;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}