/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.ArrayList;

/**
 *
 * @author 1mohamedyou
 */
public class MasterMindGUI extends javax.swing.JFrame {

    /**
     * Creates new form MasterMindGUI
     */
    int attempts = 0;
    int placeAndColour;
    int colour;

    //Initializing Objects
    static ArrayList coloursPinsHave = new ArrayList();
    static ArrayList coloursArray = new ArrayList();
    static ArrayList pinsArray = new ArrayList();
    static ArrayList<String> guess = new ArrayList();

    public MasterMindGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonC1Red = new javax.swing.JRadioButton();
        jRadioButtonC1Blue = new javax.swing.JRadioButton();
        jRadioButtonC1Green = new javax.swing.JRadioButton();
        jRadioButtonC1Yellow = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonC4Red = new javax.swing.JRadioButton();
        jRadioButtonC4Blue = new javax.swing.JRadioButton();
        jRadioButtonC4Green = new javax.swing.JRadioButton();
        jRadioButtonC4Yellow = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonC2Red = new javax.swing.JRadioButton();
        jRadioButtonC2Blue = new javax.swing.JRadioButton();
        jRadioButtonC2Green = new javax.swing.JRadioButton();
        jRadioButtonC2Yellow = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonC3Red = new javax.swing.JRadioButton();
        jRadioButtonC3Blue = new javax.swing.JRadioButton();
        jRadioButtonC3Green = new javax.swing.JRadioButton();
        jRadioButtonC3Yellow = new javax.swing.JRadioButton();
        mainButton = new javax.swing.JButton();
        spotsAndColoursCorrect = new javax.swing.JLabel();
        coloursCorrect = new javax.swing.JLabel();
        allButtonsText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("MasterMind");

        jPanel1.setBackground(new java.awt.Color(255, 20, 240));

        buttonGroup4.add(jRadioButtonC1Red);
        jRadioButtonC1Red.setText("Red");
        jRadioButtonC1Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC1RedActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButtonC1Blue);
        jRadioButtonC1Blue.setText("Blue");
        jRadioButtonC1Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC1BlueActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButtonC1Green);
        jRadioButtonC1Green.setText("Green");
        jRadioButtonC1Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC1GreenActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButtonC1Yellow);
        jRadioButtonC1Yellow.setText("Yellow");
        jRadioButtonC1Yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC1YellowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonC1Red)
                    .addComponent(jRadioButtonC1Blue)
                    .addComponent(jRadioButtonC1Green)
                    .addComponent(jRadioButtonC1Yellow))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jRadioButtonC1Red)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC1Blue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC1Green)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC1Yellow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 20, 240));

        buttonGroup3.add(jRadioButtonC4Red);
        jRadioButtonC4Red.setText("Red");
        jRadioButtonC4Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC4RedActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButtonC4Blue);
        jRadioButtonC4Blue.setText("Blue");
        jRadioButtonC4Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC4BlueActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButtonC4Green);
        jRadioButtonC4Green.setText("Green");
        jRadioButtonC4Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC4GreenActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButtonC4Yellow);
        jRadioButtonC4Yellow.setText("Yellow");
        jRadioButtonC4Yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC4YellowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonC4Red)
                    .addComponent(jRadioButtonC4Blue)
                    .addComponent(jRadioButtonC4Green)
                    .addComponent(jRadioButtonC4Yellow))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jRadioButtonC4Red)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC4Blue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC4Green)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC4Yellow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 20, 240));

        buttonGroup1.add(jRadioButtonC2Red);
        jRadioButtonC2Red.setText("Red");
        jRadioButtonC2Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC2RedActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonC2Blue);
        jRadioButtonC2Blue.setText("Blue");
        jRadioButtonC2Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC2BlueActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonC2Green);
        jRadioButtonC2Green.setText("Green");
        jRadioButtonC2Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC2GreenActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonC2Yellow);
        jRadioButtonC2Yellow.setText("Yellow");
        jRadioButtonC2Yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC2YellowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonC2Red)
                    .addComponent(jRadioButtonC2Blue)
                    .addComponent(jRadioButtonC2Green)
                    .addComponent(jRadioButtonC2Yellow))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jRadioButtonC2Red)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC2Blue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC2Green)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC2Yellow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 20, 240));

        buttonGroup2.add(jRadioButtonC3Red);
        jRadioButtonC3Red.setText("Red");
        jRadioButtonC3Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC3RedActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonC3Blue);
        jRadioButtonC3Blue.setText("Blue");
        jRadioButtonC3Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC3BlueActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonC3Green);
        jRadioButtonC3Green.setText("Green");
        jRadioButtonC3Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC3GreenActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonC3Yellow);
        jRadioButtonC3Yellow.setText("Yellow");
        jRadioButtonC3Yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonC3YellowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonC3Red)
                    .addComponent(jRadioButtonC3Blue)
                    .addComponent(jRadioButtonC3Green)
                    .addComponent(jRadioButtonC3Yellow))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jRadioButtonC3Red)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC3Blue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC3Green)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonC3Yellow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainButton.setText("Submit Guess");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });

        allButtonsText.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainButton)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coloursCorrect)
                            .addComponent(title)
                            .addComponent(allButtonsText)
                            .addComponent(spotsAndColoursCorrect))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addGap(30, 30, 30)
                .addComponent(spotsAndColoursCorrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coloursCorrect)
                .addGap(28, 28, 28)
                .addComponent(allButtonsText)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(mainButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonC1RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC1RedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC1RedActionPerformed

    private void jRadioButtonC1BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC1BlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC1BlueActionPerformed

    private void jRadioButtonC1GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC1GreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC1GreenActionPerformed

    private void jRadioButtonC1YellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC1YellowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC1YellowActionPerformed

    private void jRadioButtonC4RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC4RedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC4RedActionPerformed

    private void jRadioButtonC4BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC4BlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC4BlueActionPerformed

    private void jRadioButtonC4GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC4GreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC4GreenActionPerformed

    private void jRadioButtonC4YellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC4YellowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC4YellowActionPerformed

    private void jRadioButtonC2RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC2RedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC2RedActionPerformed

    private void jRadioButtonC2BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC2BlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC2BlueActionPerformed

    private void jRadioButtonC2GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC2GreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC2GreenActionPerformed

    private void jRadioButtonC2YellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC2YellowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC2YellowActionPerformed

    private void jRadioButtonC3RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC3RedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC3RedActionPerformed

    private void jRadioButtonC3BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC3BlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC3BlueActionPerformed

    private void jRadioButtonC3GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC3GreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC3GreenActionPerformed

    private void jRadioButtonC3YellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonC3YellowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonC3YellowActionPerformed

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        boolean allButtonGroup = true;

        if (mainButton.getText().equals("New Game")) {
            setUp();
            mainButton.setText("Submit Guess");
            spotsAndColoursCorrect.setText("");
            coloursCorrect.setText("");
            allButtonsText.setText("");
        }
        placeAndColour = 0;
        colour = 0;
        attempts++;
        coloursPinsHave.clear();
        guess.clear();
        for (int i = 0; i < 4; i++) {
            coloursPinsHave.add(pinsArray.get(i));
        }

        if (jRadioButtonC1Red.isSelected()) {
            guess.add("red");
        } else if (jRadioButtonC1Blue.isSelected()) {
            guess.add("blue");
        } else if (jRadioButtonC1Green.isSelected()) {
            guess.add("green");
        } else if (jRadioButtonC1Yellow.isSelected()) {
            guess.add("yellow");
        } else {
            allButtonGroup = false;
        }

        if (jRadioButtonC2Red.isSelected()) {
            guess.add("red");
        } else if (jRadioButtonC2Blue.isSelected()) {
            guess.add("blue");
        } else if (jRadioButtonC2Green.isSelected()) {
            guess.add("green");
        } else if (jRadioButtonC2Yellow.isSelected()) {
            guess.add("yellow");
        } else {
            allButtonGroup = false;
        }

        if (jRadioButtonC3Red.isSelected()) {
            guess.add("red");
        } else if (jRadioButtonC3Blue.isSelected()) {
            guess.add("blue");
        } else if (jRadioButtonC3Green.isSelected()) {
            guess.add("green");
        } else if (jRadioButtonC3Yellow.isSelected()) {
            guess.add("yellow");
        } else {
            allButtonGroup = false;
        }

        if (jRadioButtonC4Red.isSelected()) {
            guess.add("red");
        } else if (jRadioButtonC4Blue.isSelected()) {
            guess.add("blue");
        } else if (jRadioButtonC4Green.isSelected()) {
            guess.add("green");
        } else if (jRadioButtonC4Yellow.isSelected()) {
            guess.add("yellow");
        } else {
            allButtonGroup = false;
        }

        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();

        if (allButtonGroup) {
            for (int i = 0; i < 4; i++) {
                if (checkGuessAndSpot(pinsArray, guess.get(i), i)) {
                    placeAndColour++;
                }
                if (checkGuess(coloursPinsHave, guess.get(i))) {
                    colour++;
                    coloursPinsHave.remove(guess.get(i));
                }

            }
            //Shows the user how well he guessed
            spotsAndColoursCorrect.setText("You guessed " + placeAndColour + " spot(s) and colour(s) correctly");
            coloursCorrect.setText("You guessed " + colour + " colour(s) correctly");
            if (placeAndColour == 4) {
                //Shows the user the number of attempts it took him to guess
                allButtonsText.setText("Congratulations! It took you " + attempts + " attempt(s) to win!");
                mainButton.setText("New Game");
            }
        } else {
            allButtonsText.setText("Sorry, You didn't select one of the guesses");
        }
    }

    //Method for verifying guess colour
    private static boolean checkGuess(ArrayList coloursPinsHave, String guess) {
        boolean goodGuess = false;
        if (coloursPinsHave.contains(guess)) {
            goodGuess = true;
        }
        return goodGuess;
    }

    //Method for verifying guess colour and its spot
    private static boolean checkGuessAndSpot(ArrayList pinsArray, String guess, int i) {
        boolean goodGuess = false;
        if (pinsArray.get(i).equals(guess)) {
            goodGuess = true;
        }
        return goodGuess;
    }

    //Method for getting a random int, this method feels forced
    private static int randomWholeNumber() {
        int randNum = (int) (Math.random() * 4);
        return randNum;


    }//GEN-LAST:event_mainButtonActionPerformed
    private static void setUp() {
        coloursArray.add("blue");
        coloursArray.add("yellow");
        coloursArray.add("red");
        coloursArray.add("green");

        //Assinging each pin a colour
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));

        //Printing out each pin's colour, in order.
        System.out.println(pinsArray.get(0));
        System.out.println(pinsArray.get(1));
        System.out.println(pinsArray.get(2));
        System.out.println(pinsArray.get(3));

    }

    public static void playGUI() {
        setUp();
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
            java.util.logging.Logger.getLogger(MasterMindGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterMindGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterMindGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterMindGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MasterMindGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allButtonsText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel coloursCorrect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonC1Blue;
    private javax.swing.JRadioButton jRadioButtonC1Green;
    private javax.swing.JRadioButton jRadioButtonC1Red;
    private javax.swing.JRadioButton jRadioButtonC1Yellow;
    private javax.swing.JRadioButton jRadioButtonC2Blue;
    private javax.swing.JRadioButton jRadioButtonC2Green;
    private javax.swing.JRadioButton jRadioButtonC2Red;
    private javax.swing.JRadioButton jRadioButtonC2Yellow;
    private javax.swing.JRadioButton jRadioButtonC3Blue;
    private javax.swing.JRadioButton jRadioButtonC3Green;
    private javax.swing.JRadioButton jRadioButtonC3Red;
    private javax.swing.JRadioButton jRadioButtonC3Yellow;
    private javax.swing.JRadioButton jRadioButtonC4Blue;
    private javax.swing.JRadioButton jRadioButtonC4Green;
    private javax.swing.JRadioButton jRadioButtonC4Red;
    private javax.swing.JRadioButton jRadioButtonC4Yellow;
    private javax.swing.JButton mainButton;
    private javax.swing.JLabel spotsAndColoursCorrect;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
