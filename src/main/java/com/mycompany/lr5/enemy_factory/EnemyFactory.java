package com.mycompany.lr5.enemy_factory;

import com.mycompany.lr5.fighters.Fighter;


public class EnemyFactory {

    public Fighter create(int i, int j) {
        EnemyFactoryInterface fabric = switch (i) {
            case 0 -> new BarakaFactory();
            case 1 -> new SubZeroFactory();
            case 2 -> new LiuKangFactory();
            case 3 -> new SonyaBladeFactory();
            case 4 -> new ShaoKahnFactory();
            default -> null;
        };

        return fabric.create(j);
    }
}
