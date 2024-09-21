package oe.wd;

import java.util.ArrayList;

public class Customer {
    public String name;
    public int age;
    public String address;
    public ArrayList orders;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList getOrders() {
        return orders;
    }

    public void setOrders(ArrayList orders) {
        this.orders = orders;
    }

    public Customer(String name, int age, String address, ArrayList orders) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                '}';
    }

}
