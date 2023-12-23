package com.teachmeskills.lesson16.task4.service;

public class Order {

    private long id;
    private double cost;

    public Order(long id, double cost) {
        this.id = id;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", cost=" + cost +
                '}';
    }
}
