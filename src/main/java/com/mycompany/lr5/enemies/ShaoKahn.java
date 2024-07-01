package com.mycompany.lr5.enemies;

import com.mycompany.lr5.fighters.Fighter;

import javax.swing.*;


public class ShaoKahn extends Fighter {

    public ShaoKahn(int level, int health, int damage, int attack) {
        super(level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/shaoKahn.gif"));
    }

    @Override
    public String getName() {
        return "Shao Kahn";
    }
}
