package com.mycompany.lr5.enemies;

import com.mycompany.lr5.fighters.Fighter;

import javax.swing.*;


public class LiuKang extends Fighter {


    public LiuKang(int level, int health, int damage, int attack) {
        super(level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/liuKang.gif"));
    }

    @Override
    public String getName() {
        return "Liu Kang";
    }
}
