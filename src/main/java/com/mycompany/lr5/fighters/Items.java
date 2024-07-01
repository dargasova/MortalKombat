package com.mycompany.lr5.fighters;


public class Items {

    private String name;
    private int count;

    public Items(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count += count;
    }
}
