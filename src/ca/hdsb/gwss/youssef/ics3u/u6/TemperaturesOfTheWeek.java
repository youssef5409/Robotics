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
public class TemperaturesOfTheWeek extends javax.swing.JFrame {

    int dayNumber = 0;
    //Could've made a hashmap, but due to meeting criteria I had to make 2 arrays.
    double[] temperatures = new double[7];
    String[] days = {"Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
        "Sunday"};

    /**
     * Creates new form TemperaturesOfTheWeek
     */
    public TemperaturesOfTheWeek() {
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

        jLabelTitle = new javax.swing.JLabel();
        jTextFieldScore = new javax.swing.JTextField();
        jLabelDayNum = new javax.swing.JLabel();
        jButtonAddTemperature = new javax.swing.JButton();
        jButtonShowTemps = new javax.swing.JButton();
        jLabelSub = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResults = new javax.swing.JTextArea();
        jLabelMin = new javax.swing.JLabel();
        jLabelMax = new javax.swing.JLabel();
        jLabelAverage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperatures of the Week");

        jLabelTitle.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTitle.setText("Temperatures in the Week");

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

        jLabelDayNum.setText("Enter the temperature for Monday");

        jButtonAddTemperature.setText("Add Temperature");
        jButtonAddTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTemperatureActionPerformed(evt);
            }
        });

        jButtonShowTemps.setText("Display Temperatures");
        jButtonShowTemps.setAutoscrolls(true);
        jButtonShowTemps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowTempsActionPerformed(evt);
            }
        });

        jLabelSub.setForeground(new java.awt.Color(0, 0, 255));
        jLabelSub.setText("This program records the maximum temperatures in the days of the week (Celsius)");

        jTextAreaResults.setEditable(false);
        jTextAreaResults.setColumns(20);
        jTextAreaResults.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResults);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addComponent(jLabelDayNum)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAddTemperature))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabelError))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonShowTemps)
                            .addComponent(jLabelMin)
                            .addComponent(jLabelMax)
                            .addComponent(jLabelAverage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabelSub)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelSub)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDayNum)
                    .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddTemperature))
                .addGap(12, 12, 12)
                .addComponent(jLabelError)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonShowTemps)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMin)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMax)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAverage)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTemperatureActionPerformed
        try {
            if (Integer.parseInt(jTextFieldScore.getText()) <= -273.15) {
                jLabelError.setText("You entered a temperature less than or equal to"
                        + "0 kelvin. This not possible on earth yet alone the universe.");
            } else if (dayNumber != temperatures.length - 1) {
                jLabelDayNum.setText("Enter the temperature for " + days[dayNumber]);
                temperatures[dayNumber] = Integer.parseInt(jTextFieldScore.getText());
                dayNumber++;
            } else {
                jLabelDayNum.setText("All temperatures have been entered.");
                jButtonAddTemperature.setEnabled(false);
            }
        } catch (NumberFormatException e) {
            jTextFieldScore.setText("Sorry, Invalid Value");
            System.err.println("User has attempted an invalid value.");
        }
        if (!"Sorry, Invalid Value".equals(jTextFieldScore.getText())) {
            jTextFieldScore.setText("");
        }
    }//GEN-LAST:event_jButtonAddTemperatureActionPerformed

    private void jTextFieldScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldScoreActionPerformed

    private void jButtonShowTempsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowTempsActionPerformed
        jTextAreaResults.setText("Monday: " + temperatures[0] + "\n");
        for (int i = 1; i < dayNumber; i++) {
            jTextAreaResults.setText(jTextAreaResults.getText()
                    + (days[i] + ": " + temperatures[i] + "\n"));
        }
        jLabelAverage.setText("Avg. Temp: " + Double.toString(ArrayUtils.averageValue(temperatures)));
        jLabelMin.setText("Min. Temp: " + Double.toString(ArrayUtils.minValue(temperatures)));
        jLabelMax.setText("Max. Temp: " + Double.toString(ArrayUtils.maxValue(temperatures)));
        jButtonShowTemps.setEnabled(false);
        jButtonAddTemperature.setEnabled(false);
    }//GEN-LAST:event_jButtonShowTempsActionPerformed

    private void jTextFieldScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldScoreMouseClicked
        // TODO add your handling code here:
        jTextFieldScore.setText("");
    }//GEN-LAST:event_jTextFieldScoreMouseClicked

    public static void temperaturesOfTheWeek() {
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
            java.util.logging.Logger.getLogger(TemperaturesOfTheWeek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TemperaturesOfTheWeek().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddTemperature;
    private javax.swing.JButton jButtonShowTemps;
    private javax.swing.JLabel jLabelAverage;
    private javax.swing.JLabel jLabelDayNum;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelMax;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelSub;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResults;
    private javax.swing.JTextField jTextFieldScore;
    // End of variables declaration//GEN-END:variables
}
