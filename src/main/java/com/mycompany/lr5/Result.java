package com.mycompany.lr5;


public class Result {

    private String name;
    private int points;

    public Result(String n, int p) {
        this.name = n;
        this.points = p;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String s) {
        this.name = s;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int p) {
        this.points = p;
    }

}
