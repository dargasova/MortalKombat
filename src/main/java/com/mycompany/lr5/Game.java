package com.mycompany.lr5;


import com.mycompany.lr5.fight.Fight;
import com.mycompany.lr5.fight.FightController;
import com.mycompany.lr5.fight.TextUpdate;
import com.mycompany.lr5.fighters.Fighter;
import com.mycompany.lr5.fighters.Player;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class Game {

    FightController action = new FightController();
    TextUpdate change = new TextUpdate();
    Fight fight = new Fight();
    private ArrayList<Result> results = new ArrayList<>();
    private final ExcelManager excelManager;

    public Game() {
        this.excelManager = new ExcelManager(results);
    }

    public Fighter NewEnemy(JLabel L1, JLabel L2,
                            JLabel L3, JLabel L4, JProgressBar pr2) {
        action.setEnemies();
        Fighter enemy = action.ChooseEnemy(L1, L2, L3, L4);
        action.HP(enemy, pr2);
        pr2.setMaximum(enemy.getMaxHealth());
        fight.setEnemy(enemy);
        return enemy;
    }

    public Player NewHuman(JProgressBar pr1) {
        Player human = new Player(1, 80, 16, 1);
        action.HP(human, pr1);
        pr1.setMaximum(human.getMaxHealth());
        fight.setHuman(human);
        return human;
    }

    public void EndGameTop(Player human, JTextField text, JTable table) throws IOException {
        results.add(new Result(text.getText(), human.getPoints()));
        results.sort(Comparator.comparing(Result::getPoints).reversed());
        WriteToTable(table);
        excelManager.writeToExcel();
    }


    public Fight getFight() {
        return fight;
    }


    public ArrayList<Result> getResults() {
        return this.results;
    }

    public void ReadFromExcel() throws IOException {
        results.clear();
        excelManager.readFromExcel();
    }

    public void WriteToTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < results.size(); i++) {
            if (i < 10) {
                model.setValueAt(results.get(i).getName(), i, 0);
                model.setValueAt(results.get(i).getPoints(), i, 1);
            }
        }
    }


}

