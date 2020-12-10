/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcart.my_package;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import java.io.*; 
import java.util.*;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;

/**
 *
 * @author nicolasserna
 */
public class SellerPortal extends javax.swing.JFrame {
    
    /**
     * Creates new form SellerPortal
     */
    static GraphicsConfiguration gc;
    public static Hashtable<String, Product> allSellerItems;

    public SellerPortal() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        sellerProductLabel2 = new javax.swing.JLabel();
        sellerProductLabel3 = new javax.swing.JLabel();
        sellerProductLabel4 = new javax.swing.JLabel();
        sellerProductLabel5 = new javax.swing.JLabel();
        sellerProductLabel6 = new javax.swing.JLabel();
        fullStorage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seller Products");

        jTextField1.setPreferredSize(new java.awt.Dimension(130, 26));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sellerProductLabel2.setText("         ");

        sellerProductLabel3.setText("  ");

        sellerProductLabel4.setText("   ");

        sellerProductLabel5.setText("  ");

        sellerProductLabel6.setText("   ");

        fullStorage.setText("    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sellerProductLabel2)
                            .addComponent(sellerProductLabel3)
                            .addComponent(sellerProductLabel4)
                            .addComponent(sellerProductLabel5)
                            .addComponent(sellerProductLabel6)
                            .addComponent(fullStorage))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(sellerProductLabel2)
                .addGap(18, 18, 18)
                .addComponent(sellerProductLabel3)
                .addGap(18, 18, 18)
                .addComponent(sellerProductLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sellerProductLabel5)
                .addGap(18, 18, 18)
                .addComponent(sellerProductLabel6)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(fullStorage))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Product productDesc = allSellerItems.get(jTextField1.getText());
        System.out.println(productDesc.productName);
        ProductDesc showProductInfo = new ProductDesc();
        showProductInfo.descNameLabel.setText(productDesc.productName);
        showProductInfo.descPriceLabel.setText(productDesc.getPrice());
        showProductInfo.descReviewsLabel.setText(productDesc.getReviews());
        showProductInfo.mainProductDesc.setText(productDesc.productDesc);
        showProductInfo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(Hashtable<String, Product> args) {
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
            java.util.logging.Logger.getLogger(SellerPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fullStorage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel sellerProductLabel2;
    public javax.swing.JLabel sellerProductLabel3;
    public javax.swing.JLabel sellerProductLabel4;
    public javax.swing.JLabel sellerProductLabel5;
    public javax.swing.JLabel sellerProductLabel6;
    // End of variables declaration//GEN-END:variables
}