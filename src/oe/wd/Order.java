package oe.wd;

import java.util.ArrayList;

public class Order {
    public String id;
    public int total;
    public ArrayList<Item> list;

    public Order(String id, int total, ArrayList<Item> list) {
        this.id = id;
        this.total = total;
        this.list = list;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<Item> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", list=" + list +
                '}';
    }

    public void setList(ArrayList<Item> list) {
        this.list = list;
    }
    public void Discount()
    {
        for ()
    }
}
