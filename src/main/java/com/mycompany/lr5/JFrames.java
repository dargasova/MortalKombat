package com.mycompany.lr5;

import com.mycompany.lr5.fighters.Player;
import com.mycompany.lr5.fighters.Items;
import com.mycompany.lr5.fighters.Fighter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class JFrames extends javax.swing.JFrame {

    Game game = new Game();
    Player human = null;
    Fighter enemy = null;
    Items[] items = new Items[3];
    String nameButton = "";

    public JFrames() {
        initComponents();
        prepareDialogs();
       try {
            game.ReadFromExcel();
        } catch (IOException ex) {

        }
           jFrame1.setSize(930, 740);
           this.setLocationRelativeTo(null);
           jFrame1.setLocationRelativeTo(null);



        buttonGroup.add(smallHealButton);
        buttonGroup.add(bigHealButton);
        buttonGroup.add(rebirthButton);

        items[0]=new Items("Малое зелье лечение",0);
        items[1]=new Items("Большое зелье лечение",0);
        items[2]=new Items("Крест возрождения",0);

    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        playerPicture = new javax.swing.JLabel();
        weakButton = new javax.swing.JButton();
        attackButton = new javax.swing.JButton();
        defendButton = new javax.swing.JButton();
        playerHPProgressBar = new javax.swing.JProgressBar();
        enemyPicture = new javax.swing.JLabel();
        enemyHPProgressBar = new javax.swing.JProgressBar();
        enemyName = new javax.swing.JLabel();
        enemyDamageLabel = new javax.swing.JLabel();
        damageLabel = new javax.swing.JLabel();
        damageCountLabel = new javax.swing.JLabel();
        enemyDamageCount = new javax.swing.JLabel();
        playerLevel = new javax.swing.JLabel();
        fightLabel = new javax.swing.JLabel();
        hpPoints = new javax.swing.JLabel();
        enemyHPPoints = new javax.swing.JLabel();
        experienceLabel = new javax.swing.JLabel();
        pointsLabel = new javax.swing.JLabel();
        expCountLabel = new javax.swing.JLabel();
        pointCountLabe = new javax.swing.JLabel();
        enemyLevel = new javax.swing.JLabel();
        effectLabel = new javax.swing.JLabel();
        informationLabel = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        itemsButton = new javax.swing.JButton();
        locationLable = new javax.swing.JLabel();
        jDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        chooseOptionBox = new javax.swing.JComboBox<>();
        newLevelLabel = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        winLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        textNameButton = new javax.swing.JLabel();
        recordTableLabel = new javax.swing.JLabel();
        endGame = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        recordLabel = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        scoreTable = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        winnerLabel = new javax.swing.JLabel();
        loseLabel = new javax.swing.JLabel();
        endGameButton = new javax.swing.JButton();
        jDialog5 = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        boxItemsLabel = new javax.swing.JLabel();
        smallHealButton = new javax.swing.JRadioButton();
        bigHealButton = new javax.swing.JRadioButton();
        rebirthButton = new javax.swing.JRadioButton();
        useButton = new javax.swing.JButton();
        buttonGroup = new javax.swing.ButtonGroup();
        jDialog6 = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        notUseLabel = new javax.swing.JLabel();
        itemLabel = new javax.swing.JLabel();
        agreeButton = new javax.swing.JButton();
        inputLocationsDialog = new javax.swing.JDialog();
        inputLocNumber = new javax.swing.JTextField();
        locationsDialogTitle = new javax.swing.JLabel();
        confirmCountButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        start = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        viewTable = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playerPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bat.gif")));
        playerPicture.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(playerPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 259, 245, 250));

        weakButton.setBackground(new java.awt.Color(0, 204, 255));
        weakButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        weakButton.setText("Дебаффнуть");
        weakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weakButtonActionPerformed(evt);
            }
        });
        jPanel2.add(weakButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 110, 44));

        attackButton.setBackground(new java.awt.Color(255, 0, 0));
        attackButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        attackButton.setText("Атаковать");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(attackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 110, 44));

        defendButton.setBackground(new java.awt.Color(255, 204, 0));
        defendButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        defendButton.setText("Защититься");
        defendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defendButtonActionPerformed(evt);
            }
        });
        jPanel2.add(defendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 109, 44));

        playerHPProgressBar.setBackground(new java.awt.Color(204, 204, 204));
        playerHPProgressBar.setForeground(new java.awt.Color(51, 255, 51));
        playerHPProgressBar.setMaximum(80);
        playerHPProgressBar.setMinimum(-1);
        jPanel2.add(playerHPProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 133, 177, 32));

        enemyPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enemyPicture.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(enemyPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 219, 189, 275));

        enemyHPProgressBar.setBackground(new java.awt.Color(204, 204, 204));
        enemyHPProgressBar.setForeground(new java.awt.Color(0, 255, 0));
        enemyHPProgressBar.setMinimum(-1);
        jPanel2.add(enemyHPProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 133, 162, 32));

        enemyName.setBackground(new java.awt.Color(0, 0, 0));
        enemyName.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jPanel2.add(enemyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 162, 29));

        enemyDamageLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyDamageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enemyDamageLabel.setText("Damage");
        jPanel2.add(enemyDamageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 171, 62, -1));

        damageLabel.setBackground(new java.awt.Color(255, 255, 255));
        damageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        damageLabel.setText("Damage");
        jPanel2.add(damageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 171, 62, -1));

        damageCountLabel.setBackground(new java.awt.Color(255, 255, 255));
        damageCountLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        damageCountLabel.setForeground(new java.awt.Color(255, 0, 0));
        damageCountLabel.setText("16");
        jPanel2.add(damageCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 171, 40, -1));

        enemyDamageCount.setBackground(new java.awt.Color(255, 255, 255));
        enemyDamageCount.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enemyDamageCount.setForeground(new java.awt.Color(255, 0, 0));
        enemyDamageCount.setText("16");
        jPanel2.add(enemyDamageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 171, 40, -1));

        playerLevel.setBackground(new java.awt.Color(255, 255, 255));
        playerLevel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        playerLevel.setText("0 уровень");
        jPanel2.add(playerLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 235, -1, -1));

        fightLabel.setBackground(new java.awt.Color(255, 255, 255));
        fightLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        fightLabel.setForeground(new java.awt.Color(0, 0, 153));
        fightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fightLabel.setText("FIGHT");
        fightLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(fightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 6, 205, 64));

        hpPoints.setBackground(new java.awt.Color(255, 255, 255));
        hpPoints.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        hpPoints.setForeground(new java.awt.Color(102, 102, 102));
        hpPoints.setText("80/80");
        jPanel2.add(hpPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 141, -1, -1));

        enemyHPPoints.setBackground(new java.awt.Color(255, 255, 255));
        enemyHPPoints.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        enemyHPPoints.setForeground(new java.awt.Color(102, 102, 102));
        enemyHPPoints.setText("80/80");
        jPanel2.add(enemyHPPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 144, -1, -1));

        experienceLabel.setBackground(new java.awt.Color(255, 255, 255));
        experienceLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        experienceLabel.setForeground(new java.awt.Color(128, 92, 31));
        experienceLabel.setText("experience");
        jPanel2.add(experienceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 110, -1, -1));

        pointsLabel.setBackground(new java.awt.Color(255, 255, 255));
        pointsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pointsLabel.setForeground(new java.awt.Color(128, 92, 31));
        pointsLabel.setText("points");
        jPanel2.add(pointsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 110, -1, -1));

        expCountLabel.setBackground(new java.awt.Color(255, 255, 255));
        expCountLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        expCountLabel.setForeground(new java.awt.Color(113, 90, 16));
        expCountLabel.setText("0/40");
        jPanel2.add(expCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 144, -1, -1));

        pointCountLabe.setBackground(new java.awt.Color(255, 255, 255));
        pointCountLabe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        pointCountLabe.setForeground(new java.awt.Color(113, 90, 16));
        pointCountLabe.setText("00");
        jPanel2.add(pointCountLabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 144, -1, -1));

        enemyLevel.setBackground(new java.awt.Color(255, 255, 255));
        enemyLevel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        enemyLevel.setText("1 уровень");
        jPanel2.add(enemyLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 229, -1, -1));

        effectLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        effectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(effectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 535, 164, 43));

        informationLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        informationLabel.setForeground(new java.awt.Color(204, 0, 0));
        informationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(informationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 259, 237, 35));

        playerName.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        playerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerName.setText("Игрок");
        jPanel2.add(playerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 118, 24));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 227, 38));

        itemsButton.setBackground(new java.awt.Color(174, 183, 106));
        itemsButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        itemsButton.setText("Предметы");
        itemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsButtonActionPerformed(evt);
            }
        });
        jPanel2.add(itemsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 110, 44));

        locationLable.setText("jLabel2");
        jPanel2.add(locationLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));

        jFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 740));

        jDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(179, 226, 217));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 42)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("jLabel18");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 89, 467, 143));

        nextButton.setBackground(new java.awt.Color(114, 218, 142));
        nextButton.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        nextButton.setText("Дальше");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel3.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 341, 369, 139));

        chooseOptionBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chooseOptionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Выбрать усиление", "Увеличить урон", "Увеличить здоровье" }));
        jPanel3.add(chooseOptionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 274, -1, 41));

        newLevelLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        newLevelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newLevelLabel.setText("Вы перешли на следующий уровень");
        jPanel3.add(newLevelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 240, 369, 28));

        jDialog.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 677, 551));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        winLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        winLabel.setForeground(new java.awt.Color(255, 0, 0));
        winLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winLabel.setText("Победа на вашей стороне");

        nameField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        textNameButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        textNameButton.setForeground(new java.awt.Color(102, 102, 102));
        textNameButton.setText("Введите имя своего персонажа для добавления");

        recordTableLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        recordTableLabel.setForeground(new java.awt.Color(102, 102, 102));
        recordTableLabel.setText("результата в таблицу рекордов");

        endGame.setBackground(new java.awt.Color(153, 153, 255));
        endGame.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        endGame.setForeground(new java.awt.Color(51, 51, 51));
        endGame.setText("Закончить игру");
        endGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(endGame)
                .addGap(14, 14, 14))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(recordTableLabel))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(winLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNameButton))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(winLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recordTableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endGame, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        recordLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        recordLabel.setForeground(new java.awt.Color(51, 51, 51));
        recordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordLabel.setText("Таблица рекордов");

        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Имя", "Количество баллов"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane.setViewportView(scoreTable);

        closeButton.setBackground(new java.awt.Color(255, 255, 153));
        closeButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        closeButton.setForeground(new java.awt.Color(51, 51, 51));
        closeButton.setText("Закрыть");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(recordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(recordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));

        winnerLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        winnerLabel.setForeground(new java.awt.Color(255, 0, 0));
        winnerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winnerLabel.setText("Победа на вашей стороне");

        loseLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        loseLabel.setForeground(new java.awt.Color(102, 102, 102));
        loseLabel.setText("К сожалению, Ваш результат не попал в топ 10");

        endGameButton.setBackground(new java.awt.Color(153, 153, 255));
        endGameButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        endGameButton.setForeground(new java.awt.Color(51, 51, 51));
        endGameButton.setText("Закончить игру");
        endGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(winnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(loseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(endGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(winnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(loseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(endGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(190, 182, 135));

        boxItemsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        boxItemsLabel.setForeground(new java.awt.Color(51, 51, 51));
        boxItemsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxItemsLabel.setText("Мешок предметов");

        smallHealButton.setBackground(new java.awt.Color(190, 182, 135));
        smallHealButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        smallHealButton.setText("Малое зелье лечение, 0 шт");
        smallHealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallHealButtonActionPerformed(evt);
            }
        });

        bigHealButton.setBackground(new java.awt.Color(190, 182, 135));
        bigHealButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        bigHealButton.setText("Большое зелье лечение, 0 шт");
        bigHealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigHealButtonActionPerformed(evt);
            }
        });

        rebirthButton.setBackground(new java.awt.Color(190, 182, 135));
        rebirthButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rebirthButton.setText("Крест возрождения, 0 шт");

        useButton.setBackground(new java.awt.Color(239, 237, 14));
        useButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        useButton.setText("Использовать");
        useButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bigHealButton)
                            .addComponent(rebirthButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(smallHealButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxItemsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(useButton)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(boxItemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(smallHealButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bigHealButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rebirthButton)
                .addGap(50, 50, 50)
                .addComponent(useButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(243, 120, 120));

        notUseLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        notUseLabel.setForeground(new java.awt.Color(51, 51, 51));
        notUseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notUseLabel.setText("Вы не можете использовать ");

        itemLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        itemLabel.setForeground(new java.awt.Color(51, 51, 51));
        itemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemLabel.setText("этот предмет");

        agreeButton.setBackground(new java.awt.Color(204, 204, 204));
        agreeButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        agreeButton.setForeground(new java.awt.Color(51, 51, 51));
        agreeButton.setText("ОК");
        agreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(notUseLabel)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(itemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(agreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(notUseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(agreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        inputLocationsDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputLocNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputLocNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLocNumberActionPerformed(evt);
            }
        });
        inputLocationsDialog.getContentPane().add(inputLocNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 20));

        locationsDialogTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        locationsDialogTitle.setText("Ввведите количество локаций");
        inputLocationsDialog.getContentPane().add(locationsDialogTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 40));

        confirmCountButton.setText("Подтвердить");
        confirmCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmCountButtonActionPerformed(evt);
            }
        });
        inputLocationsDialog.getContentPane().add(confirmCountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        start.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        start.setForeground(new java.awt.Color(204, 204, 0));
        start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        start.setText("Mortal Kombat");

        newGameButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        newGameButton.setText("Начать новую игру");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        viewTable.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        viewTable.setText("Посмотреть таблицу \nрезультатов");
        viewTable.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        viewTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(viewTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewTable, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prepareDialogs() {
        inputLocationsDialog.setSize(418, 148);
        inputLocationsDialog.setLocationRelativeTo(null);
        inputLocationsDialog.setTitle("Введите количество локаций");


        chooseOptionBox.setVisible(false);
        newLevelLabel.setVisible(false);

    }



    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        inputLocationsDialog.setVisible(true);
        attackButton.setEnabled(true);
         defendButton.setEnabled(true);
         itemsButton.setEnabled(true);
         weakButton.setEnabled(true);



        /*game.action.setEnemies();
        enemy = game.action.ChooseEnemy(enemyPicture, enemyName, enemyDamageCount,enemyHPPoints);
                //a.ChooseEmemy(human, enemyPicture, enemyHPProgressBar, enemyName, enemyDamageCount,enemyHPPoints);

        //Fight f = new Fight();

        game.action.HP(human, playerHPProgressBar);
        game.action.HP(enemy, enemyHPProgressBar);
        enemyHPProgressBar.setMaximum(enemy.getMaxHealth());*/

    }//GEN-LAST:event_newGameButtonActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        game.fight.Hit(human, enemy, 1,enemyHPPoints, hpPoints, jDialog,
                jLabel18, game.action, playerHPProgressBar, enemyHPProgressBar, jDialog2,
                jDialog4, jFrame1, game.getResults(), winLabel, winnerLabel,
                effectLabel, jLabel29, informationLabel, items, rebirthButton, chooseOptionBox, newLevelLabel);

        checkAndDisableButtons() ;

    }//GEN-LAST:event_attackButtonActionPerformed

    private void defendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defendButtonActionPerformed
        game.fight.Hit(human, enemy, 0,enemyHPPoints, hpPoints, jDialog,
                jLabel18, game.action, playerHPProgressBar, enemyHPProgressBar, jDialog2,
                jDialog4, jFrame1, game.getResults(), winLabel, winnerLabel,
                effectLabel, jLabel29, informationLabel, items, rebirthButton,chooseOptionBox, newLevelLabel);

        checkAndDisableButtons() ;
    }//GEN-LAST:event_defendButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        try {
            switch(chooseOptionBox.getSelectedItem().toString()) {
                case "Увеличить урон":
                    human.setDamage(10 + human.getLevel());
                    break;
                case "Увиличить общее количество здоровья":
                    human.setMaxHealth(human.getLevel() * 10);
                    break;
                case "Выбрать усиление":
                    if (chooseOptionBox.isVisible())
                        throw new IllegalArgumentException();

            }
                chooseOptionBox.setVisible(false);
                newLevelLabel.setVisible(false);
                chooseOptionBox.setSelectedIndex(0);
                enemy = game.fight.NewRound(human, enemyPicture, playerHPProgressBar, enemyHPProgressBar,
                enemyName, enemyDamageCount,enemyHPPoints, game.action);


                game.change.NewRoundTexts(human, enemy, playerHPProgressBar, enemyHPProgressBar,
                pointCountLabe, expCountLabel, playerLevel, enemyLevel, hpPoints,enemyHPPoints, damageCountLabel,
                effectLabel, informationLabel, game.fight.i, items, smallHealButton, bigHealButton, rebirthButton);

                checkAndDisableButtons() ;
                locationLable.setText("Локация №"+game.getFight().getCurrentLocationsCount());

                jDialog.dispose();


        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(jDialog, "Необходимо выбрать усиление.", "Ошибка",  JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_nextButtonActionPerformed

    private void checkAndDisableButtons() {
        if (playerHPProgressBar.getValue() == 0 || enemyHPProgressBar.getValue() == 0) {
            attackButton.setEnabled(false);
            defendButton.setEnabled(false);
            itemsButton.setEnabled(false);
            weakButton.setEnabled(false);
        } else {
            attackButton.setEnabled(true);
            defendButton.setEnabled(true);
            itemsButton.setEnabled(true);
            weakButton.setEnabled(true);
        }
    }

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void endGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameActionPerformed
        try {
            game.EndGameTop(human, nameField, scoreTable);
        } catch (IOException ex) {
            Logger.getLogger(JFrames.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDialog2.dispose();
        nameField.setText("");
    }//GEN-LAST:event_endGameActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        jDialog3.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void viewTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTableActionPerformed
        game.WriteToTable(scoreTable);
        jDialog3.setVisible(true);
        jDialog3.setBounds(100, 100, 580, 450);
    }//GEN-LAST:event_viewTableActionPerformed

    private void endGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameButtonActionPerformed
        jDialog4.dispose();
    }//GEN-LAST:event_endGameButtonActionPerformed

    private void smallHealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallHealButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smallHealButtonActionPerformed

    private void bigHealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigHealButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bigHealButtonActionPerformed

    private void useButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useButtonActionPerformed
        if(smallHealButton.isSelected()){
            nameButton="jRadioButton1";
        }
        if(bigHealButton.isSelected()){
            nameButton="jRadioButton2";
        }
        if(rebirthButton.isSelected()){
            nameButton="jRadioButton3";
        }
        game.action.UseItem(human, items, nameButton, jDialog6, jDialog5);
        game.action.HP(human, playerHPProgressBar);
        hpPoints.setText(human.getHealth() + "/" + human.getMaxHealth());
        game.change.BagText(items, smallHealButton, bigHealButton, rebirthButton);
    }//GEN-LAST:event_useButtonActionPerformed

    private void itemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsButtonActionPerformed
        jDialog5.setVisible(true);
        jDialog5.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_itemsButtonActionPerformed

    private void agreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeButtonActionPerformed
        jDialog6.dispose();
    }//GEN-LAST:event_agreeButtonActionPerformed

    private void confirmCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmCountButtonActionPerformed
       try {

           int locationsCount = Integer.parseInt(inputLocNumber.getText());
           if (locationsCount <= 0) {
               throw new IllegalArgumentException();
           }
           inputLocationsDialog.setVisible(false);
           jFrame1.setVisible(rootPaneCheckingEnabled);
            jFrame1.setSize(1000,700);



            human = game.NewHuman(playerHPProgressBar);
            game.getFight().setLocationsCount(locationsCount);
            game.getFight().prepareLocationAndRounds();
            locationLable.setText("Локация №"+game.getFight().getCurrentLocationsCount());

            enemy = game.NewEnemy(enemyPicture, enemyName, enemyDamageCount,enemyHPPoints, enemyHPProgressBar);

            game.change.NewRoundTexts(human, enemy, playerHPProgressBar, enemyHPProgressBar,
                    pointCountLabe, expCountLabel, playerLevel, enemyLevel, hpPoints,enemyHPPoints, damageCountLabel,
                    effectLabel, informationLabel, game.fight.i, items, smallHealButton, bigHealButton, rebirthButton);





       } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(rootPane, "Количество локаций должно быть положительным числом", "Ошибка",  JOptionPane.ERROR_MESSAGE);
       } catch (IllegalArgumentException exc) {
           JOptionPane.showMessageDialog(rootPane, "Вы ввели отрицательное число. Число локаций должно быть положительным", "Ошибка",  JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_confirmCountButtonActionPerformed

    private void inputLocNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLocNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLocNumberActionPerformed

    private void weakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weakButtonActionPerformed
        game.fight.Hit(human, enemy, 2,enemyHPPoints, hpPoints, jDialog,
                jLabel18, game.action, playerHPProgressBar, enemyHPProgressBar, jDialog2,
                jDialog4, jFrame1, game.getResults(), winLabel, winnerLabel,
                effectLabel, jLabel29, informationLabel, items, rebirthButton, chooseOptionBox, newLevelLabel);

        checkAndDisableButtons() ;
    }//GEN-LAST:event_weakButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agreeButton;
    private javax.swing.JButton attackButton;
    private javax.swing.JRadioButton bigHealButton;
    private javax.swing.JLabel boxItemsLabel;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> chooseOptionBox;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton confirmCountButton;
    private javax.swing.JLabel damageCountLabel;
    private javax.swing.JLabel damageLabel;
    private javax.swing.JButton defendButton;
    private javax.swing.JLabel effectLabel;
    private javax.swing.JButton endGame;
    private javax.swing.JButton endGameButton;
    private javax.swing.JLabel enemyDamageCount;
    private javax.swing.JLabel enemyDamageLabel;
    private javax.swing.JLabel enemyHPPoints;
    private javax.swing.JProgressBar enemyHPProgressBar;
    private javax.swing.JLabel enemyLevel;
    private javax.swing.JLabel enemyName;
    private javax.swing.JLabel enemyPicture;
    private javax.swing.JLabel expCountLabel;
    private javax.swing.JLabel experienceLabel;
    private javax.swing.JLabel fightLabel;
    private javax.swing.JLabel hpPoints;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JTextField inputLocNumber;
    private javax.swing.JDialog inputLocationsDialog;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JButton itemsButton;
    private javax.swing.JDialog jDialog;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel locationLable;
    private javax.swing.JLabel locationsDialogTitle;
    private javax.swing.JLabel loseLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel newLevelLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel notUseLabel;
    private javax.swing.JProgressBar playerHPProgressBar;
    private javax.swing.JLabel playerLevel;
    private javax.swing.JLabel playerName;
    private javax.swing.JLabel playerPicture;
    private javax.swing.JLabel pointCountLabe;
    private javax.swing.JLabel pointsLabel;
    private javax.swing.JRadioButton rebirthButton;
    private javax.swing.JLabel recordLabel;
    private javax.swing.JLabel recordTableLabel;
    private javax.swing.JTable scoreTable;
    private javax.swing.JRadioButton smallHealButton;
    private javax.swing.JLabel start;
    private javax.swing.JLabel textNameButton;
    private javax.swing.JButton useButton;
    private javax.swing.JButton viewTable;
    private javax.swing.JButton weakButton;
    private javax.swing.JLabel winLabel;
    private javax.swing.JLabel winnerLabel;
    // End of variables declaration//GEN-END:variables
}
