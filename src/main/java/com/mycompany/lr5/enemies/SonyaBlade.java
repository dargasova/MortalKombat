package com.mycompany.lr5.enemies;

import com.mycompany.lr5.fighters.Fighter;

import javax.swing.*;


public class SonyaBlade extends Fighter {

    public SonyaBlade(int level, int health, int damage, int attack) {
        super(level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/sonyaBlade.gif"));
    }

    @Override
    public String getName() {
        return "Sonya Blade";
    }
}
