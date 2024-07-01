package com.mycompany.lr5.enemy_factory;

import com.mycompany.lr5.enemies.SubZero;
import com.mycompany.lr5.fighters.Fighter;


public class SubZeroFactory implements EnemyFactoryInterface {

    @Override
    public Fighter create(int i) {
        Fighter enemy;
        enemy = new SubZero(1, 60, 16, 1);
        return enemy;
    }

}
