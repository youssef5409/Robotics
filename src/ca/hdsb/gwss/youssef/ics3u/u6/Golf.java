/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

/**
 *
 * @author 1mohamedyou
 */
public class Golf extends javax.swing.JFrame {

    int holeNumber = 1;
    int[] scores = new int[18];

    /**
     * Creates new form Golf
     */
    public Golf() {
        initComponents();
        startUp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jTextFieldScore = new javax.swing.JTextField();
        jLabelHoleNum = new javax.swing.JLabel();
        jButtonAddScore = new javax.swing.JButton();
        jButtonShowScore = new javax.swing.JButton();
        jLabelSub = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResults = new javax.swing.JTextArea();
        jLabelTotal = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelMax = new javax.swing.JLabel();
        jLabelAverage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Golf Score");

        jLabelTitle.setForeground(new java.awt.Color(0, 255, 0));
        jLabelTitle.setText("Golf Scores");

        jTextFieldScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldScoreMouseClicked(evt);
            }
        });
        jTextFieldScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldScoreActionPerformed(evt);
            }
        });

        jLabelHoleNum.setText("Enter the score for hole #1");

        jButtonAddScore.setText("Add Score");
        jButtonAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddScoreActionPerformed(evt);
            }
        });

        jButtonShowScore.setText("Display Scores");
        jButtonShowScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowScoreActionPerformed(evt);
            }
        });

        jLabelSub.setText("This program records up to 18 golf holes");

        jTextAreaResults.setEditable(false);
        jTextAreaResults.setColumns(20);
        jTextAreaResults.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResults);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabelTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonShowScore)
                            .addComponent(jLabelTotal)
                            .addComponent(jLabelMin)
                            .addComponent(jLabelMax)
                            .addComponent(jLabelAverage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelError, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelHoleNum)
                                .addGap(18, 29, Short.MAX_VALUE)
                                .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelSub))
                        .addGap(35, 35, 35)
                        .addComponent(jButtonAddScore)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelSub)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddScore, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelHoleNum)
                        .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelError)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonShowScore)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTotal)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMin)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMax)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAverage)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startUp() {
        jLabelSub.setText("This program records " + scores.length + " golf holes");
        jButtonShowScore.setEnabled(false);
    }
    private void jButtonAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddScoreActionPerformed
        try {
            if (Integer.parseInt(jTextFieldScore.getText()) <= 0) {
                jLabelError.setText("Sorry, you entered a score less than 1");
            } else if (holeNumber < scores.length) {
                scores[holeNumber - 1] = Integer.parseInt(jTextFieldScore.getText());
                jLabelHoleNum.setText("Enter the score for hole #" + (++holeNumber));
            } else {
                scores[holeNumber - 1] = Integer.parseInt(jTextFieldScore.getText());
                jLabelHoleNum.setText("All scores have been entered.");
                jButtonAddScore.setEnabled(false);
                jButtonShowScore.setEnabled(true);
            }
        } catch (NumberFormatException e) {
            jTextFieldScore.setText("Sorry, Invalid Value");
            System.err.println("User has attempted an invalid value. " + e);
        }
        if (!"Sorry, Invalid Value".equals(jTextFieldScore.getText())) {
            jTextFieldScore.setText("");
        }
    }//GEN-LAST:event_jButtonAddScoreActionPerformed

    private void jTextFieldScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldScoreActionPerformed

    private void jButtonShowScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowScoreActionPerformed
        for (int i = 1; i <= scores.length; i++) {
            jTextAreaResults.setText(jTextAreaResults.getText() + ("Hole #" + i + ": " + scores[i - 1] + "\n"));
        }
        jLabelTotal.setText("Total. score: " + Integer.toString(ArrayUtils.totalValue(scores)));
        jLabelAverage.setText("Avg. score: " + Double.toString(ArrayUtils.averageValue(scores)));
        jLabelMin.setText("Min. score: " + Integer.toString(ArrayUtils.minValue(scores)));
        jLabelMax.setText("Max. score: " + Integer.toString(ArrayUtils.maxValue(scores)));
        jButtonShowScore.setEnabled(false);
    }//GEN-LAST:event_jButtonShowScoreActionPerformed

    private void jTextFieldScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldScoreMouseClicked
        // TODO add your handling code here:
        jTextFieldScore.setText("");
    }//GEN-LAST:event_jTextFieldScoreMouseClicked

    public static void golf() {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Golf().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddScore;
    private javax.swing.JButton jButtonShowScore;
    private javax.swing.JLabel jLabelAverage;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelHoleNum;
    private javax.swing.JLabel jLabelMax;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelSub;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResults;
    private javax.swing.JTextField jTextFieldScore;
    // End of variables declaration//GEN-END:variables
}
