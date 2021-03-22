/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SmartTVController;
import model.SmartTV;

import java.rmi.RemoteException;

/**
 *
 * @author biizuka
 */
public class SmartTVJFrame extends javax.swing.JFrame {

    static SmartTV stv;
    static SmartTVController stvController;

    /**
     * Creates new form SmartTVJFrame
     */
    public SmartTVJFrame() {
        initComponents();
        CanaljLabel.setVisible(false);
        CanaljButton.setVisible(false);
        ValorCanaljLabel.setVisible(false);
        CanaljTextField1.setVisible(false);

        VolumejButton1.setVisible(false);
        VolumejLabel.setVisible(false);
        ValorVolumejLabel1.setVisible(false);
        VolumejTextField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PowerjButton = new javax.swing.JButton();
        CanaljLabel = new javax.swing.JLabel();
        ValorCanaljLabel = new javax.swing.JLabel();
        VolumejLabel = new javax.swing.JLabel();
        ValorVolumejLabel1 = new javax.swing.JLabel();
        LigaDesligajLabel = new javax.swing.JLabel();
        ValorLigaDesligajLabel1 = new javax.swing.JLabel();
        CanaljButton = new javax.swing.JButton();
        CanaljTextField1 = new javax.swing.JTextField();
        VolumejButton1 = new javax.swing.JButton();
        VolumejTextField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PowerjButton.setBackground(java.awt.Color.white);
        PowerjButton.setText("Liga");
        PowerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    PowerjButtonActionPerformed(evt);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });

        CanaljLabel.setText("Canal");

        ValorCanaljLabel.setText("12");

        VolumejLabel.setText("Volume");

        ValorVolumejLabel1.setText("12");

        LigaDesligajLabel.setBackground(java.awt.Color.red);
        LigaDesligajLabel.setText("Smart TV");

        ValorLigaDesligajLabel1.setText("Desligado");

        CanaljButton.setBackground(java.awt.Color.white);
        CanaljButton.setText("Alterar Canal");
        CanaljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    CanaljButtonActionPerformed(evt);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });

        VolumejButton1.setBackground(java.awt.Color.white);
        VolumejButton1.setText("Alterar Volume");
        VolumejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    VolumejButton1ActionPerformed(evt);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ValorLigaDesligajLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PowerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(ValorVolumejLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ValorCanaljLabel)))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(VolumejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(VolumejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CanaljTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(CanaljButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CanaljLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VolumejLabel)
                            .addComponent(LigaDesligajLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LigaDesligajLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorLigaDesligajLabel1)
                    .addComponent(PowerjButton))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CanaljLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ValorCanaljLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CanaljTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CanaljButton)))
                .addGap(18, 18, 18)
                .addComponent(VolumejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorVolumejLabel1)
                    .addComponent(VolumejButton1)
                    .addComponent(VolumejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Ar Condicionado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void PowerjButtonActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException {//GEN-FIRST:event_PowerjButtonActionPerformed
        stvController.turnOffOn();

        if (!stv.isPowerButton()) {
            ValorLigaDesligajLabel1.setText("Desligado");
            PowerjButton.setText("Liga");

            CanaljLabel.setVisible(false);
            CanaljButton.setVisible(false);
            ValorCanaljLabel.setVisible(false);
            CanaljTextField1.setVisible(false);

            VolumejButton1.setVisible(false);
            VolumejLabel.setVisible(false);
            ValorVolumejLabel1.setVisible(false);
            VolumejTextField.setVisible(false);

        } else {
            ValorLigaDesligajLabel1.setText("Ligado");
            PowerjButton.setText("Desliga");

            CanaljLabel.setVisible(true);
            CanaljButton.setVisible(true);
            ValorCanaljLabel.setVisible(true);
            CanaljTextField1.setVisible(true);

            VolumejButton1.setVisible(true);
            VolumejLabel.setVisible(true);
            ValorVolumejLabel1.setVisible(true);
            VolumejTextField.setVisible(true);
        }

    }//GEN-LAST:event_PowerjButtonActionPerformed

    private void VolumejButton1ActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException {//GEN-FIRST:event_VolumejButton1ActionPerformed
        this.stvController.changeVolume(Integer.parseInt(this.VolumejTextField.getText()));
        ValorVolumejLabel1.setText(String.valueOf(stv.getVolume()));

    }//GEN-LAST:event_VolumejButton1ActionPerformed

    private void CanaljButtonActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException {//GEN-FIRST:event_CanaljButtonActionPerformed
        int channel = Integer.parseInt(this.CanaljTextField1.getText());
        this.stvController.changeChannel(channel);
        ValorCanaljLabel.setText(String.valueOf(stv.getChannel()));

    }//GEN-LAST:event_CanaljButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SmartTVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartTVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartTVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartTVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartTVJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanaljButton;
    private javax.swing.JLabel CanaljLabel;
    private javax.swing.JTextField CanaljTextField1;
    private javax.swing.JLabel LigaDesligajLabel;
    private javax.swing.JButton PowerjButton;
    private javax.swing.JLabel ValorCanaljLabel;
    private javax.swing.JLabel ValorLigaDesligajLabel1;
    private javax.swing.JLabel ValorVolumejLabel1;
    private javax.swing.JButton VolumejButton1;
    private javax.swing.JLabel VolumejLabel;
    private javax.swing.JTextField VolumejTextField;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public static void setFrame(SmartTV stvv, SmartTVController stvvController){
        stv = stvv;
        stvController = stvvController;
    }

}
