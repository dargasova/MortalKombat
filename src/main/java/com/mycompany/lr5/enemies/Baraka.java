package com.mycompany.lr5.enemies;

import com.mycompany.lr5.fighters.Fighter;

import javax.swing.*;


public class Baraka extends Fighter {


    public Baraka(int level, int health, int damage, int attack) {
        super(level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/baraka.gif"));
    }

    @Override
    public String getName() {
        return "Baraka";
    }


}
