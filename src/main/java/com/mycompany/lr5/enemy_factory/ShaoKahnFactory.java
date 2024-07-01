package com.mycompany.lr5.enemy_factory;

import com.mycompany.lr5.enemies.ShaoKahn;
import com.mycompany.lr5.fighters.Fighter;


public class ShaoKahnFactory implements EnemyFactoryInterface {

    @Override
    public Fighter create(int i) {
        Fighter enemy;
        if (i == 0) {
            enemy = new ShaoKahn(3, 100, 30, 1);
        } else {
            enemy = new ShaoKahn(3, 145, 44, 1);
        }
        return enemy;
    }
}
