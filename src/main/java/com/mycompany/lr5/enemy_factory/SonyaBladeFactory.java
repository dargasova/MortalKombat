package com.mycompany.lr5.enemy_factory;

import com.mycompany.lr5.enemies.SonyaBlade;
import com.mycompany.lr5.fighters.Fighter;


public class SonyaBladeFactory implements EnemyFactoryInterface {

    @Override
    public Fighter create(int i) {
        Fighter enemy;
        enemy = new SonyaBlade(1, 80, 16, 1);
        return enemy;
    }

}
