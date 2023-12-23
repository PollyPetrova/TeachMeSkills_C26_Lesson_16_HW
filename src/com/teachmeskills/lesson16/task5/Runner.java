package com.teachmeskills.lesson16.task5;

import com.teachmeskills.lesson16.task5.client.Client;
import com.teachmeskills.lesson16.task5.consts.PassportNum;
import com.teachmeskills.lesson16.task5.order.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Создать класс для описания клиента.
 * Поместить в класс поля для описания клиента (дата регистрации, имя, возраст и другие поля по усмотрению).
 * Класс клиента должен содержеть поле-коллекцию с заказами этого клиента - это, своего рода, корзина заказов клиента.
 * Класс заказа должен создежать поля для описания заказ (цена, описание и возможны другие поля).
 * Создать нескольких клиентов.
 * Для каждого клиента создать несколько заказов и поместить их в поле-коллекцию для заказов.
 * Создать коллекцию типа Мар и заполнить ее парами "номер паспорта клиента" -> "объект класса клиент".
 * Номера паспортов можно хранить как константы в созданном для этого интерфейсе.
 * Пройти циклом по коллекции и вывести на экран:
 * 	- все пары ключ-значение, использую Map.Entry<K, V> entry : map.entrySet()
 * 	- все пары ключ-значение, использую итератор
 * 	- все ключи, используя map.keySet()
 * 	- все значения, используя map.values()
 */

public class Runner {

    public static void main(String[] args) {

        ArrayList<Order> orderOfClient1=new ArrayList<>();
        orderOfClient1.add(new Order(250, "Lego"));
        orderOfClient1.add(new Order(150, "Dress"));

        ArrayList<Order> orderOfClient2=new ArrayList<>();
        orderOfClient2.add(new Order(70, "Cap"));
        orderOfClient2.add(new Order(270, "Jacket"));
        orderOfClient2.add(new Order(4500, "Laptop"));

        ArrayList<Order> orderOfClient3=new ArrayList<>();
        orderOfClient3.add(new Order(3366, "Phone"));


        Client client1=new Client("2011-11-25", "Polina", 20, orderOfClient1);

        Client client2=new Client("2003-01-22", "Masha", 37, orderOfClient2);

        Client client3=new Client("2015-04-13", "Natasha", 25, orderOfClient3);

        Map<String, Client> map=new HashMap<>();
        map.put(PassportNum.PASSPORT_NUM_OF_CLIENT_1, client1);
        map.put(PassportNum.PASSPORT_NUM_OF_CLIENT_2, client2);
        map.put(PassportNum.PASSPORT_NUM_OF_CLIENT_3, client3);

        System.out.println("-----------------------------");

        for (Map.Entry<String, Client> entry : map.entrySet()) {
            System.out.println("passport number of client: "+entry);
        }

        System.out.println("-----------------------------");

        Iterator<Map.Entry<String, Client>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Client> entry = entries.next();
            System.out.println("passport number of client: "+entry);
        }

        System.out.println("-----------------------------");

        for (String key: map.keySet()) {
            System.out.println("passport number of client: "+key);
        }

        System.out.println("-----------------------------");

        for (Client value: map.values()) {
            System.out.println("order of client: "+value);
        }

        System.out.println("-----------------------------");

    }

}
