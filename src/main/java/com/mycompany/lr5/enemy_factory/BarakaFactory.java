package com.mycompany.lr5.enemy_factory;

import com.mycompany.lr5.enemies.Baraka;
import com.mycompany.lr5.fighters.Fighter;


public class BarakaFactory implements EnemyFactoryInterface {

    @Override
    public Fighter create(int i) {
        Fighter enemy;
        enemy = new Baraka(1, 100, 12, 1);
        return enemy;
    }
}
