package com.teachmeskills.lesson16.task5.order;

public class Order {

    private double cost;
    private String description;

    public Order(double cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }
}
