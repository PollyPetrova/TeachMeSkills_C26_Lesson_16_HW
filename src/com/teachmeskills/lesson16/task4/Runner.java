package com.teachmeskills.lesson16.task4;

import com.teachmeskills.lesson16.task4.service.Order;

import java.util.Map;
import java.util.TreeMap;

/**
 * Создать свой класс для описания заказа.
 * Класс должен содержать поля id заказа и стоимость заказа - обязательные поля.
 * Возможны другие поля по необходимости.
 * Создать несколько заказов и поместить их в коллекцию.
 * Вывести коллекцию на экран.
 * Отсортировать заказы и вывести отсортированную коллекцию на экран.
 * Заказы сортируются по цене по возрастанию.
 * Для сортировки заказов следует создать свой компаратор (смотрите пример с занятия).
 */

public class Runner {

    public static void main(String[] args) {

        Map<Double, Order> sortedMap=new TreeMap<>();

        sortedMap.put(120.5, new Order(111222, 120.5));
        sortedMap.put(10.0, new Order(222333, 10));
        sortedMap.put(35.7, new Order(333444, 35.7));
        sortedMap.put(87.3, new Order(444555, 87.3));
        sortedMap.put(100.0, new Order(555666, 100));
        sortedMap.put(99.99, new Order(666777, 99.99));
        sortedMap.put(3.45, new Order(777888, 3.45));

        for (Order value: sortedMap.values()) {
            System.out.println(value);
        }

    }

}
