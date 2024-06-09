/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uis;

import java.awt.Cursor;

/**
 *
 * @author gamitha
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        // Set SVGs
        sVGFieldDetails.setSvgImage("./svgcomponents/DashboardFieldDetails.svg", 156, 153);
        sVGFieldsOverviewBg.setSvgImage("./svgcomponents/DashboardFieldOverviewBg.svg", 156, 89);
        sVGFinancesBg.setSvgImage("./svgcomponents/DashboardFinancesBg.svg", 198, 89);
        sVGSalesGraph.setSvgImage("./svgcomponents/SalesGraph.svg", 604, 294);
        sVGTaskCompletedBg.setSvgImage("./svgcomponents/DashboardTaskCompletedBg.svg", 416, 89);
        
        
        // Set hand cursors
        Cursor hand = new Cursor(Cursor.HAND_CURSOR);
        sVGFieldDetails.setCursor(hand);
        sVGFieldsOverviewBg.setCursor(hand);
        sVGFinancesBg.setCursor(hand);
        sVGSalesGraph.setCursor(hand);
        sVGTaskCompletedBg.setCursor(hand);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOverview = new javax.swing.JLabel();
        lblPercentage = new javax.swing.JLabel();
        lblTask = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        lblExpenses = new javax.swing.JLabel();
        sVGFieldsOverviewBg = new main.SVGImage();
        sVGTaskCompletedBg = new main.SVGImage();
        sVGFieldDetails = new main.SVGImage();
        sVGFinancesBg = new main.SVGImage();
        sVGSalesGraph = new main.SVGImage();
        salesChart = new main.Chart();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(null);
        setLayout(null);

        lblOverview.setFont(new java.awt.Font("SF Pro", 0, 26)); // NOI18N
        lblOverview.setForeground(new java.awt.Color(0, 0, 0));
        lblOverview.setText("lblOverview");
        lblOverview.setMaximumSize(new java.awt.Dimension(166, 32));
        lblOverview.setMinimumSize(new java.awt.Dimension(166, 32));
        lblOverview.setPreferredSize(new java.awt.Dimension(166, 32));
        add(lblOverview);
        lblOverview.setBounds(31, 73, 134, 32);

        lblPercentage.setFont(new java.awt.Font("SF Pro", 0, 26)); // NOI18N
        lblPercentage.setForeground(new java.awt.Color(0, 0, 0));
        lblPercentage.setText("lblPercentage");
        add(lblPercentage);
        lblPercentage.setBounds(207, 73, 200, 32);

        lblTask.setFont(new java.awt.Font("SF Pro Display", 0, 10)); // NOI18N
        lblTask.setForeground(new java.awt.Color(0, 0, 0));
        lblTask.setText("lblTask");
        lblTask.setToolTipText("");
        add(lblTask);
        lblTask.setBounds(362, 60, 230, 13);

        lblDate.setFont(new java.awt.Font("SF Pro Display", 0, 10)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("lblDate");
        lblDate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblDate.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(lblDate);
        lblDate.setBounds(495, 40, 97, 13);

        lblIncome.setFont(new java.awt.Font("SF Pro Text", 0, 26)); // NOI18N
        lblIncome.setForeground(new java.awt.Color(0, 0, 0));
        lblIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIncome.setText("lblIncome");
        lblIncome.setToolTipText("");
        lblIncome.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(lblIncome);
        lblIncome.setBounds(208, 182, 87, 32);
        lblIncome.getAccessibleContext().setAccessibleName("lblIncome");

        lblExpenses.setFont(new java.awt.Font("SF Pro Text", 0, 26)); // NOI18N
        lblExpenses.setForeground(new java.awt.Color(0, 0, 0));
        lblExpenses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExpenses.setText("lblExpenses");
        lblExpenses.setToolTipText("");
        lblExpenses.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(lblExpenses);
        lblExpenses.setBounds(295, 182, 87, 32);

        sVGFieldsOverviewBg.setForeground(new java.awt.Color(0, 0, 0));
        sVGFieldsOverviewBg.setText("sVGFieldsOverviewBg");
        add(sVGFieldsOverviewBg);
        sVGFieldsOverviewBg.setBounds(20, 20, 156, 89);

        sVGTaskCompletedBg.setForeground(new java.awt.Color(0, 0, 0));
        sVGTaskCompletedBg.setText("sVGTaskCompletedBg");
        add(sVGTaskCompletedBg);
        sVGTaskCompletedBg.setBounds(196, 20, 416, 89);

        sVGFieldDetails.setForeground(new java.awt.Color(0, 0, 0));
        sVGFieldDetails.setText("sVGFieldDetails");
        add(sVGFieldDetails);
        sVGFieldDetails.setBounds(20, 129, 156, 153);

        sVGFinancesBg.setForeground(new java.awt.Color(0, 0, 0));
        sVGFinancesBg.setText("sVGFinancesBg");
        add(sVGFinancesBg);
        sVGFinancesBg.setBounds(196, 129, 198, 89);

        sVGSalesGraph.setForeground(new java.awt.Color(0, 0, 0));
        sVGSalesGraph.setText("sVGSalesGraph");
        add(sVGSalesGraph);
        sVGSalesGraph.setBounds(20, 302, 604, 294);
        add(salesChart);
        salesChart.setBounds(27, 339, 590, 250);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblExpenses;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblOverview;
    private javax.swing.JLabel lblPercentage;
    private javax.swing.JLabel lblTask;
    private main.SVGImage sVGFieldDetails;
    private main.SVGImage sVGFieldsOverviewBg;
    private main.SVGImage sVGFinancesBg;
    private main.SVGImage sVGSalesGraph;
    private main.SVGImage sVGTaskCompletedBg;
    private main.Chart salesChart;
    // End of variables declaration//GEN-END:variables
}
