package com.teachmeskills.lesson16.task5.client;

import com.teachmeskills.lesson16.task5.order.Order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Client {

    private String dateOfRegistration;
    private String name;
    private int age;

    private ArrayList<Order> orders;

    public Client(String dateOfRegistration, String name, int age, ArrayList<Order> orders) {
        this.dateOfRegistration = dateOfRegistration;
        this.name = name;
        this.age = age;
        this.orders = orders;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration=dateOfRegistration;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "dateOfRegistration='" + dateOfRegistration + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", orders=" + orders +
                '}';
    }
}
