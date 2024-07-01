package com.mycompany.lr5.fighters;

import javax.swing.*;


public class Fighter {

    public ImageIcon picture;
    private int level;
    private int health;
    private int max_health;
    private double damage;
    private int attack;
    private boolean weakness = false;
    private int timer = 0;

    public Fighter(int level, int health, double damage, int attack) {
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.attack = attack;
        this.max_health = health;
    }

    public void setLevel() {
        this.level++;
    }

    public void setNewHealth(int h) {
        this.health = h;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(double h) {
        if (h < 0 && weakness) {
            this.health += (int) (h * 1.25);
        } else {
            this.health += (int) h;
        }
    }

    public double getDamage() {
        if (weakness) {
            return this.damage * 0.5;
        }
        return this.damage;
    }

    public void setDamage(double d) {
        this.damage += d;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int a) {
        this.attack = a;
    }

    public int getMaxHealth() {
        return this.max_health;
    }

    public void setMaxHealth(int h) {
        this.max_health += h;
    }

    public String getName() {
        return "";
    }

    public ImageIcon getPicture() {
        return picture;
    }

    public void setWeakness(int level) {
        timer = level;
        weakness = true;
    }

    public void removeWeakness() {
        if (timer > 0) timer--;
        else {
            weakness = false;
        }

    }

    public Boolean isWizard() {
        return false;
    }

}
