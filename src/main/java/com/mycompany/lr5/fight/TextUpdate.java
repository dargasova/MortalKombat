package com.mycompany.lr5.fight;

import com.mycompany.lr5.fighters.Fighter;
import com.mycompany.lr5.fighters.Items;
import com.mycompany.lr5.fighters.Player;

import javax.swing.*;


public class TextUpdate {


    public void NewRoundTexts(Fighter player, Fighter enemy, JProgressBar playerHealthBar,
                              JProgressBar enemyHealthBar, JLabel playerPointsLabel, JLabel playerExperienceLabel, JLabel playerLevelLabel,
                              JLabel enemyLevelLabel, JLabel playerHealthLabel, JLabel enemyHealthLabel, JLabel playerDamageLabel, JLabel turnLabel, JLabel endGameLabel,
                              int i, Items[] items, JRadioButton itemRadioButton1, JRadioButton itemRadioButton2, JRadioButton itemRadioButton3) {
        playerPointsLabel.setText(Integer.toString(((Player) player).getPoints()));
        playerExperienceLabel.setText(((Player) player).getExperience() + "/" + ((Player) player).getNextExperience());
        playerLevelLabel.setText(player.getLevel() + " level");
        enemyLevelLabel.setText(enemy.getLevel() + " level");
        playerHealthLabel.setText(player.getMaxHealth() + "/" + player.getMaxHealth());
        enemyHealthLabel.setText(enemy.getMaxHealth() + "/" + enemy.getMaxHealth());
        playerDamageLabel.setText(Double.toString(player.getDamage()));
        if (i % 2 == 1) {
            turnLabel.setText("Your turn");
        } else {
            turnLabel.setText(enemy.getName() + "'s turn");
        }

        BagText(items, itemRadioButton1, itemRadioButton2, itemRadioButton3);
        endGameLabel.setText("");
    }

    public void RoundTexts(Fighter player, Fighter enemy, JLabel enemyHealthLabel, JLabel playerHealthLabel, int turn, JLabel turnLabel) {
        if (enemy.getHealth() >= 0) {
            enemyHealthLabel.setText(enemy.getHealth() + "/" + enemy.getMaxHealth());
        } else {
            enemyHealthLabel.setText("0/" + enemy.getMaxHealth());
        }
        if (player.getHealth() >= 0) {
            playerHealthLabel.setText(player.getHealth() + "/" + player.getMaxHealth());
        } else {
            playerHealthLabel.setText("0/" + player.getMaxHealth());
        }
        if (turn % 2 == 1) {
            turnLabel.setText("Your turn");
        } else {
            turnLabel.setText(enemy.getName() + "'s turn");
        }
    }


    public void BagText(Items[] items, JRadioButton itemRadioButton1, JRadioButton itemRadioButton2, JRadioButton itemRadioButton3) {
        itemRadioButton1.setText(items[0].getName() + ", " + items[0].getCount() + " шт");
        itemRadioButton2.setText(items[1].getName() + ", " + items[1].getCount() + " шт");
        itemRadioButton3.setText(items[2].getName() + ", " + items[2].getCount() + " шт");
    }

}
