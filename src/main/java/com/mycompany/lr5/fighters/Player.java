package com.mycompany.lr5.fighters;

import javax.swing.*;


public class Player extends Fighter {


    private int points;
    private int experience;
    private int win;
    private int next_experience;


    public Player(int level, int health, int damage, int attack) {
        super(level, health, damage, attack);
        this.points = 0;
        this.experience = 0;
        this.next_experience = 40;
        this.win = 0;
        picture = new ImageIcon(this.getClass().getResource("/bat.gif"));

    }


    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience += experience;
    }

    public int getNextExperience() {
        return this.next_experience;
    }

    public void setNextExperience(int experience) {
        this.next_experience = experience;
    }

    public int getWin() {
        return this.win;
    }

    public void setWin() {
        this.win++;
    }

    @Override
    public String getName() {
        return "You";
    }


}
