package com.mycompany.lr5.fight;

import com.mycompany.lr5.enemies.*;
import com.mycompany.lr5.enemy_factory.EnemyFactory;
import com.mycompany.lr5.fighters.Fighter;
import com.mycompany.lr5.fighters.Items;
import com.mycompany.lr5.fighters.Player;

import javax.swing.*;


public class FightController {

    private final int[][] fightPatterns = {{1, 0}, {1, 1, 0}, {0, 1, 0}, {1, 1, 1, 1}};
    EnemyFactory fabric = new EnemyFactory();
    private int experience_for_next_level = 40;
    private Fighter[] enemies = new Fighter[6];
    private Fighter enemy = null;

    public void setEnemies() {
        enemies[0] = fabric.create(0, 0);
        enemies[1] = fabric.create(1, 0);
        enemies[2] = fabric.create(2, 0);
        enemies[3] = fabric.create(3, 0);
        enemies[4] = fabric.create(4, 0);
        enemies[5] = fabric.create(4, 0);
    }

    public Fighter[] getEnemies() {
        return this.enemies;
    }

    public Fighter ChooseEnemy(JLabel enemyIconLabel, JLabel enemyNameLabel, JLabel enemyDamageLabel, JLabel enemyHealthLabel) {
        int i = (int) (Math.random() * 4);
        switch (i) {
            case 0:
                enemy = enemies[0];
                break;
            case 1:
                enemy = enemies[1];
                break;
            case 2:
                enemy = enemies[2];
                break;
            case 3:
                enemy = enemies[3];

                break;
        }
        enemyIconLabel.setIcon(enemy.getPicture());
        enemyNameLabel.setText(enemy.getName());
        enemyDamageLabel.setText(String.valueOf(enemy.getDamage()));
        enemyHealthLabel.setText(enemy.getHealth() + "/" + enemy.getMaxHealth());
        return enemy;
    }

    public Fighter ChooseBoss(JLabel label, JLabel label2, JLabel text, JLabel label3, int i, Fighter human) {

        label2.setText("Shao Kahn (босс)");
        enemy = enemies[4];
        for (int j = 0; j < human.getLevel() - enemy.getLevel() + 2; i++) {
            enemy.setLevel();
        }
        enemy.setDamage(enemy.getLevel());
        enemy.setMaxHealth(5 * enemy.getLevel());
        enemy.setHealth(enemy.getMaxHealth() - enemy.getHealth());
        label.setIcon(enemy.getPicture());
        text.setText(String.valueOf(enemy.getDamage()));
        label3.setText(enemy.getHealth() + "/" + enemy.getMaxHealth());
        return enemy;
    }

    public int[] EnemyBehavior(int k1, int k2, int k3, int k4, double i, Boolean isWizard) {
        int[] behaviorArray = null;
        if (i < k1 * 0.01) {
            behaviorArray = fightPatterns[0];
        }
        if (i >= k1 * 0.01 & i < (k1 + k2) * 0.01) {
            behaviorArray = fightPatterns[1];
        }
        if (i >= (k1 + k2) * 0.01 & i < (k1 + k2 + k3) * 0.01) {
            behaviorArray = fightPatterns[2];
        }
        if (i >= (k1 + k2 + k3) * 0.01 & i < 1) {
            behaviorArray = fightPatterns[3];
        }
        return behaviorArray;
    }

    public int[] ChooseBehavior(Fighter enemy, FightController action) {
        int[] arr = null;
        double i = Math.random();
        if (enemy instanceof Baraka) {
            arr = action.EnemyBehavior(15, 15, 60, 10, i, false);
        }
        if (enemy instanceof SubZero) {
            arr = action.EnemyBehavior(25, 25, 0, 50, i, true);
        }
        if (enemy instanceof LiuKang) {
            arr = action.EnemyBehavior(13, 13, 10, 64, i, false);
        }
        if (enemy instanceof SonyaBlade) {
            arr = action.EnemyBehavior(25, 25, 50, 0, i, false);
        }
        if (enemy instanceof ShaoKahn) {
            arr = action.EnemyBehavior(10, 45, 0, 45, i, false);
        }
        return arr;
    }

    public void HP(Fighter player, JProgressBar healthProgressBar) {

        if (player.getHealth() >= 0) {
            healthProgressBar.setValue(player.getHealth());
        } else {
            healthProgressBar.setValue(0);
        }
    }


    public Boolean AddPoints(Player human, Fighter[] enemies) {
        switch (human.getLevel()) {
            case 0:
                human.setExperience(20);
                human.setPoints(25 + human.getHealth() / 4);
                break;
            case 1:
                human.setExperience(25);
                human.setPoints(30 + human.getHealth() / 4);
                break;
            case 2:
                human.setExperience(30);
                human.setPoints(35 + human.getHealth() / 4);
                break;
            case 3:
                human.setExperience(40);
                human.setPoints(45 + human.getHealth() / 4);
                break;
            case 4:
                human.setExperience(50);
                human.setPoints(55 + human.getHealth() / 4);
                break;
        }
        boolean isLevelUp = false;

        if (experience_for_next_level <= human.getExperience()) {

            human.setLevel();
            isLevelUp = true;
            experience_for_next_level += human.getExperience();
            human.setNextExperience(experience_for_next_level);
            NewHealthHuman(human);
            for (int j = 0; j < 4; j++) {
                NewHealthEnemy(enemies[j], human);
            }

        }

        return isLevelUp;
    }

    public void AddPointsBoss(Player human, Fighter[] enemies) {
        switch (human.getLevel()) {
            case 2:
                human.setExperience(30);
                human.setPoints(45 + human.getHealth() / 2);
                break;
            case 4:
                human.setExperience(50);
                human.setPoints(65 + human.getHealth() / 2);
                break;
        }
        if (experience_for_next_level <= human.getExperience()) {
            human.setLevel();

            experience_for_next_level += human.getExperience();
            human.setNextExperience(experience_for_next_level);
            NewHealthHuman(human);
            for (int j = 0; j < 4; j++) {
                NewHealthEnemy(enemies[j], human);
            }
        }

    }

    public void AddItems(int k1, int k2, int k3, Items[] items) {
        double i = Math.random();
        if (i < k1 * 0.01) {
            items[0].setCount(1);
        }
        if (i >= k1 * 0.01 & i < (k1 + k2) * 0.01) {
            items[1].setCount(1);
        }
        if (i >= (k1 + k2) * 0.01 & i < (k1 + k2 + k3) * 0.01) {
            items[2].setCount(1);
        }
    }

    public void NewHealthHuman(Player human) {
        int hp = 0;
        int damage = 0;
        switch (human.getLevel()) {
            case 1:
                hp = 25;
                damage = 3;
                break;
            case 2:
                hp = 30;
                damage = 3;
                break;
            case 3:
                hp = 30;
                damage = 4;
                break;
            case 4:
                hp = 40;
                damage = 6;
                break;
        }
        human.setMaxHealth(hp);
        human.setDamage(damage);
    }

    public void NewHealthEnemy(Fighter enemy, Player player) {
        int hp = 0;
        int damage = 0;
        switch (player.getLevel()) {
            case 1:
                hp = 32;
                damage = 25;
                break;
            case 2:
                hp = 30;
                damage = 20;
                break;
            case 3:
                hp = 23;
                damage = 24;
                break;
            case 4:
                hp = 25;
                damage = 26;
                break;
        }
        enemy.setMaxHealth((int) enemy.getMaxHealth() * hp / 100);
        enemy.setDamage((int) enemy.getDamage() * damage / 100);
        enemy.setLevel();
    }

    public void UseItem(Fighter player, Items[] items, String name, JDialog infoDialog, JDialog errorDialog) {
        switch (name) {
            case "jRadioButton1":
                if (items[0].getCount() > 0) {
                    player.setHealth((int) (player.getMaxHealth() * 0.25));
                    items[0].setCount(-1);
                } else {
                    infoDialog.setVisible(true);
                    infoDialog.setBounds(300, 200, 400, 300);
                }
                break;
            case "jRadioButton2":
                if (items[1].getCount() > 0) {
                    player.setHealth((int) (player.getMaxHealth() * 0.5));
                    items[1].setCount(-1);
                } else {
                    infoDialog.setVisible(true);
                    infoDialog.setBounds(300, 200, 400, 300);
                }
                break;
            case "jRadioButton3":
                infoDialog.setVisible(true);
                infoDialog.setBounds(300, 200, 400, 300);
                break;
        }

        if (!infoDialog.isVisible()) {
            errorDialog.dispose();
        }
    }
}
