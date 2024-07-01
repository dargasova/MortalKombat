package com.mycompany.lr5.enemy_factory;

import com.mycompany.lr5.enemies.LiuKang;
import com.mycompany.lr5.fighters.Fighter;


public class LiuKangFactory implements EnemyFactoryInterface {

    @Override
    public Fighter create(int i) {
        Fighter enemy;
        enemy = new LiuKang(1, 70, 20, 1);
        return enemy;
    }
}
