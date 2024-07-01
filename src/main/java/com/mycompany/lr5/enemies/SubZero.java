package com.mycompany.lr5.enemies;

import com.mycompany.lr5.fighters.Fighter;

import javax.swing.*;


public class SubZero extends Fighter {

    public SubZero(int level, int health, int damage, int attack) {
        super(level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/subZero.gif"));
    }

    @Override
    public String getName() {
        return "Sub-Zero";
    }

    @Override
    public Boolean isWizard() {
        return true;
    }
}
