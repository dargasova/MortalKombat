/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lr5.fight;


import com.mycompany.lr5.Result;
import com.mycompany.lr5.enemies.ShaoKahn;
import com.mycompany.lr5.fighters.Fighter;
import com.mycompany.lr5.fighters.Items;
import com.mycompany.lr5.fighters.Player;

import javax.swing.*;
import java.util.ArrayList;


public class Fight {

    public int i = 1;
    private Fighter human;
    private Fighter enemy;
    private TextUpdate change = new TextUpdate();
    private int[] attack_type = {0};
    private int attackIndex = -1;
    private int stun = 0;
    private double randomValue = 0.0;


    private int locationsCount;
    private int currentLocationsCount = 0;
    private int levelCount;

    public void Move(Fighter player, Fighter enemy, JLabel playerLabel, JLabel enemyLabel) {
        if (stun == 1) {
            player.setAttack(-1);
        }
        switch (player.getAttack() + Integer.toString(enemy.getAttack())) {

            ///PlayerAttackEnemyDefense
            case "10":
                randomValue = Math.random();
                if (player instanceof ShaoKahn & randomValue < 0.15) {
                    enemy.setHealth(-(int) (player.getDamage() * 0.5));
                    enemyLabel.setText("Your block is broken");

                } else {
                    player.setHealth(-(int) (enemy.getDamage() * 0.5));
                    enemyLabel.setText(enemy.getName() + " launched a counterattack");
                }
                break;

            ///BothAttack
            case "11":
                enemy.setHealth(-player.getDamage());
                enemyLabel.setText(player.getName() + " attacked");
                break;

            ///BothDefense
            case "00":
                randomValue = Math.random();
                if (randomValue <= 0.5) {
                    stun = 1;
                }
                enemyLabel.setText("Both are on the defensive");
                break;

            ///PlayerNoAttack
            case "01":
                enemyLabel.setText(player.getName() + " didn't attacked");
                break;

            ///PlayerStunned
            case "-10":
                playerLabel.setText(player.getName() + " was stunned");
                stun = 0;
                enemyLabel.setText(enemy.getName() + " didn't attacked");
                break;

            ///EnemyAttackPlayerStunned
            case "-11":
                player.setHealth(-enemy.getDamage());
                playerLabel.setText(player.getName() + " was stunned");
                stun = 0;
                enemyLabel.setText(enemy.getName() + " attacked");
                break;

            case "20":

                ///PlayerWeaknessEnemyWeakened
            case "2-1":
                if (Math.random() < 0.75) {
                    enemy.setWeakness(enemy.getLevel());
                    playerLabel.setText(player.getName() + "used Debuff");
                    enemyLabel.setText(enemy.getName() + " are debuffed");
                }
                break;


            case "02":

                ///PlayerWeakenedEnemyWeakness
            case "-12":
                if (Math.random() < 0.75) {
                    player.setWeakness(player.getLevel());
                    enemyLabel.setText(enemy.getName() + "used Debuff");
                    playerLabel.setText(player.getName() + " are debuffed");
                }
                break;

            ///PlayerAttackEnemyWeak
            case "12":
                enemy.setHealth(-player.getDamage() * 1.15);
                playerLabel.setText(player.getName() + " attacked");
                enemyLabel.setText("Failed to debuff enemy");
                break;

            ///EnemyAttackPlayerWeak
            case "21":
                player.setHealth(-enemy.getDamage() * 1.15);
                playerLabel.setText(player.getName() + " attacked");
                playerLabel.setText("Failed to debuff enemy");
                break;


            case "30":

                ///PlayerRegenerate
            case "3-1":
                player.setHealth((player.getMaxHealth() - player.getHealth()) * 0.5);
                playerLabel.setText(player.getName() + " regenerated");
                break;

            case "03":

                ///EnemyRegenerate
            case "-13":
                enemy.setHealth((enemy.getMaxHealth() - enemy.getHealth()) * 0.5);
                enemyLabel.setText(enemy.getName() + " regenerated");
                break;

            ///PlayerAttackEnemyRegenFailed
            case "13":
                enemy.setHealth(-player.getDamage() * 2);
                playerLabel.setText(player.getName() + " attacked");
                enemyLabel.setText("Failed to regenerate");
                break;

            ///EnemyAttackPlayerRegenFailed
            case "31":
                player.setHealth(-enemy.getDamage() * 2);
                enemyLabel.setText(enemy.getName() + " attacked");
                playerLabel.setText("Failed to regenerate");
                break;

            ///PlayerWeaknessEnemyRegen
            case "23":
                enemy.setWeakness(player.getLevel());
                enemy.setHealth((enemy.getMaxHealth() - enemy.getHealth()) * 0.5);
                playerLabel.setText(player.getName() + " used Debuff");
                enemyLabel.setText(enemy.getName() + " regenerated");
                break;

            ///EnemyWeaknessPlayerRegen
            case "32":
                player.setWeakness(enemy.getLevel());
                player.setHealth((player.getMaxHealth() - player.getHealth()) * 0.5);
                enemyLabel.setText(enemy.getName() + " used Debuff");
                playerLabel.setText(player.getName() + "regenerated");
                break;
        }

    }

    public void Hit(Fighter human, Fighter enemy, int attackType, JLabel playerLabel,
                    JLabel enemyLabel, JDialog dialog, JLabel roundLabel, FightController fightController,
                    JProgressBar playerHealthBar, JProgressBar enemyHealthBar, JDialog winDialog,
                    JDialog loseDialog, JFrame frame, ArrayList<Result> results,
                    JLabel winLabel, JLabel loseLabel, JLabel playerHealthDisplay, JLabel opponentHealthDisplay,
                    JLabel roundDisplay, Items[] playerItems, JRadioButton resurrectionButton, JComboBox optionBox, JLabel newLevelLabel) {
        opponentHealthDisplay.setText("");
        human.setAttack(attackType);

        if (attackIndex < attack_type.length - 1) {
            attackIndex++;
        } else {
            attack_type = fightController.ChooseBehavior(enemy, fightController);
            attackIndex = 0;
        }

        if (enemy.isWizard() && Math.random() < 0.15) {
            enemy.setAttack(2); // 2 - Дебафф
        } else if (enemy.getName().equals("Shao Kahn") && Math.random() < 0.2) {
            enemy.setAttack(3); // 3 - Хил
        } else {
            enemy.setAttack(attack_type[attackIndex]);
        }
        human.removeWeakness();
        enemy.removeWeakness();
        if (i % 2 == 1) {
            Move(human, enemy, opponentHealthDisplay, roundDisplay);
        } else {
            Move(enemy, human, opponentHealthDisplay, roundDisplay);
        }
        i++;
        change.RoundTexts(human, enemy, playerLabel, enemyLabel, i, playerHealthDisplay);
        fightController.HP(human, playerHealthBar);
        fightController.HP(enemy, enemyHealthBar);
        if (human.getHealth() <= 0 & playerItems[2].getCount() > 0) {
            human.setNewHealth((int) (human.getMaxHealth() * 0.05));
            playerItems[2].setCount(-1);
            fightController.HP(human, playerHealthBar);
            enemyLabel.setText(human.getHealth() + "/" + human.getMaxHealth());
            resurrectionButton.setText(playerItems[2].getName() + ", " + playerItems[2].getCount() + " шт");
            opponentHealthDisplay.setText("Вы воскресли");
        }


        if (human.getHealth() <= 0 | enemy.getHealth() <= 0) {
            if (levelCount == 0 || human.getHealth() <= 0) {
                EndFinalRound(((Player) human), fightController, results, winDialog, loseDialog,
                        frame, winLabel, loseLabel, playerItems);

            } else {
                EndRound(human, enemy, dialog, roundLabel, fightController, playerItems, optionBox, newLevelLabel);
            }
        }
    }

    public void EndRound(Fighter human, Fighter enemy, JDialog winDialog, JLabel winLabel,
                         FightController action, Items[] items, JComboBox optionBox, JLabel newLevelLabel) {

        winDialog.setVisible(true);
        winDialog.setBounds(300, 150, 700, 600);
        if (human.getHealth() > 0) {

            winLabel.setText("You win");
            ((Player) human).setWin();

            if (enemy instanceof ShaoKahn) {
                action.AddItems(38, 23, 8, items);
                action.AddPointsBoss(((Player) human), action.getEnemies());

            } else {
                action.AddItems(25, 15, 5, items);
                Boolean isLevelUp = action.AddPoints(((Player) human), action.getEnemies());
                if (isLevelUp) {
                    optionBox.setSelectedIndex(0);
                    optionBox.setVisible(true);
                    newLevelLabel.setVisible(true);

                }

            }
        } else {
            winLabel.setText(enemy.getName() + " win");
        }

        i = 1;
        attackIndex = -1;
        attack_type = ResetAttack();


    }

    public void EndFinalRound(Player player, FightController fightController,
                              ArrayList<Result> results, JDialog winDialog, JDialog loseDialog, JFrame frame,
                              JLabel winLabel, JLabel loseLabel, Items[] items) {
        String text = "Победа не на вашей стороне";

        if (player.getHealth() > 0) {
            player.setWin();
            fightController.AddPoints(player, fightController.getEnemies());
            text = "Победа на вашей стороне";
        }
        boolean top = false;
        if (results == null) {
            top = true;
        } else {
            int i = 0;
            for (Result result : results) {
                if (player.getPoints() < result.getPoints()) {
                    i++;
                }
            }
            if (i < 10) {
                top = true;
            }
        }


        if (top) {
            winDialog.setVisible(true);
            winDialog.setBounds(150, 150, 600, 500);
            winLabel.setText(text);
        } else {
            loseDialog.setVisible(true);
            loseDialog.setBounds(150, 150, 470, 360);
            loseLabel.setText(text);
        }
        frame.dispose();
    }


    public int[] ResetAttack() {
        return new int[]{0};
    }

    public Fighter NewRound(Fighter player, JLabel playerLabel, JProgressBar playerHealthBar,
                            JProgressBar enemyHealthBar, JLabel enemyLabel, JLabel textLabel, JLabel roundLabel, FightController fightController) {
        this.human = player;

        if (levelCount == 1) {
            enemy = fightController.ChooseBoss(playerLabel, enemyLabel, textLabel, roundLabel, player.getLevel(), player);
        } else if (levelCount > 1) {

            enemy = fightController.ChooseEnemy(playerLabel, enemyLabel, textLabel, roundLabel);

        }
        levelCount--;
        playerHealthBar.setMaximum(player.getMaxHealth());
        enemyHealthBar.setMaximum(enemy.getMaxHealth());
        player.setNewHealth(player.getMaxHealth());
        enemy.setNewHealth(enemy.getMaxHealth());
        fightController.HP(player, playerHealthBar);
        fightController.HP(enemy, enemyHealthBar);

        if (levelCount == 0) prepareLocationAndRounds();


        return enemy;
    }


    public void prepareLocationAndRounds() {
        if (currentLocationsCount < locationsCount) {

            currentLocationsCount++;
            levelCount = (int) (Math.random() * 3) + human.getLevel() + 1;


        }

    }

    public int getCurrentLocationsCount() {
        return currentLocationsCount;
    }


    public void setLocationsCount(int locationsCount) {
        this.locationsCount = locationsCount;
    }

    public void setHuman(Player human) {
        this.human = human;
    }

    public void setEnemy(Fighter enemy) {
        this.enemy = enemy;
    }
}
