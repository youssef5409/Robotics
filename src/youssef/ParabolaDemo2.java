/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;

/**
 *
 * @author Youss
 */
import discovering.ParabolaDemo;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.XYItemEntity;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.PolynomialFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.ShapeUtilities;

public class ParabolaDemo2 extends ApplicationFrame {

    public ParabolaDemo2(final String title) {

        super(title);
        double[] a = {0.0, 0.0, 3.0};
        Function2D p = new PolynomialFunction2D(a);
        XYDataset dataset = DatasetUtilities.sampleFunction2D(
                p, -20.0, 20.0, 20, "y = 3x² {-20…20}");
        final JFreeChart chart = ChartFactory.createXYLineChart("Parabola",
                "X", "Y", dataset, PlotOrientation.VERTICAL, true, true, false);
        final XYPlot plot = (XYPlot) chart.getPlot();
        XYLineAndShapeRenderer r = (XYLineAndShapeRenderer) plot.getRenderer();
        r.setBaseShapesVisible(true);
        r.setSeriesShape(0, ShapeUtilities.createTranslatedShape(
                new Rectangle(12, 12), -6, -6));
        final ChartPanel chartPanel = new ChartPanel(chart) {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(640, 480);
            }
        };
        chartPanel.addChartMouseListener(new ChartMouseListener() {

            @Override
            public void chartMouseClicked(ChartMouseEvent cme) {
                report(cme);
            }

            @Override
            public void chartMouseMoved(ChartMouseEvent cme) {
                //report(cme);
            }

            private void report(ChartMouseEvent cme) {
                ChartEntity ce = cme.getEntity();
                if (ce instanceof XYItemEntity) {
                    XYItemEntity e = (XYItemEntity) ce;
                    XYDataset d = e.getDataset();
                    int s = e.getSeriesIndex();
                    int i = e.getItem();
                    System.out.println("X:" + d.getX(s, i) + ", Y:" + d.getY(s, i));
                }
            }
        });
        setContentPane(chartPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                final ParabolaDemo demo = new ParabolaDemo("Parabola Demo");
                demo.pack();
                RefineryUtilities.centerFrameOnScreen(demo);
                demo.setVisible(true);
            }
        });
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

