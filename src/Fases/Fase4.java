/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fases;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lab
 */
public class Fase4 extends javax.swing.JFrame {
boolean Valendo;
    /**
     * Creates new form Fase4
     */
    public Fase4() {
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

        LblParede2 = new javax.swing.JLabel();
        lblParede1 = new javax.swing.JLabel();
        LblParede3 = new javax.swing.JLabel();
        lblParede4 = new javax.swing.JLabel();
        lblParede5 = new javax.swing.JLabel();
        lblParede6 = new javax.swing.JLabel();
        LblInicio = new javax.swing.JLabel();
        lblPontoFinal = new javax.swing.JLabel();
        lblParede8 = new javax.swing.JLabel();
        lblParede9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblParede2.setBackground(new java.awt.Color(0, 0, 0));
        LblParede2.setText(".");
        LblParede2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblParede2MouseEntered(evt);
            }
        });
        LblParede2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LblParede2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(LblParede2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 221, 75, 85));

        lblParede1.setBackground(new java.awt.Color(0, 0, 0));
        lblParede1.setText(".");
        lblParede1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblParede1MouseEntered(evt);
            }
        });
        lblParede1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblParede1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblParede1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 528, 212));

        LblParede3.setBackground(new java.awt.Color(0, 0, 0));
        LblParede3.setText(".");
        LblParede3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblParede3MouseEntered(evt);
            }
        });
        LblParede3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LblParede3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(LblParede3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 205, 75, 74));

        lblParede4.setText(".");
        lblParede4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblParede4MouseEntered(evt);
            }
        });
        lblParede4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblParede4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblParede4, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 232, 95, 74));

        lblParede5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblParede5MouseEntered(evt);
            }
        });
        lblParede5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblParede5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblParede5, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 205, 90, 36));

        lblParede6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblParede6MouseEntered(evt);
            }
        });
        lblParede6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblParede6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblParede6, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 247, 90, 47));

        LblInicio.setText(".");
        LblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LblInicioMousePressed(evt);
            }
        });
        LblInicio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LblInicioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(LblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 18, 20));

        lblPontoFinal.setText(".");
        lblPontoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPontoFinalMouseEntered(evt);
            }
        });
        lblPontoFinal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblPontoFinalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblPontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 227, 21, -1));

        lblParede8.setText(".");
        lblParede8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblParede8MouseEntered(evt);
            }
        });
        lblParede8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblParede8AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblParede8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 294, 528, 100));

        lblParede9.setText(".");
        lblParede9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblParede9MouseEntered(evt);
            }
        });
        lblParede9.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblParede9AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblParede9, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 206, 90, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LblParede2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblParede2MouseEntered
        if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Perdeu");
            Valendo = false;
            new Susto().setVisible(true);
        }
    }//GEN-LAST:event_LblParede2MouseEntered

    private void LblParede2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LblParede2AncestorAdded
        ImageIcon icon = new ImageIcon("src/Imagens/Preto.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(LblParede2.getWidth(), LblParede2.getWidth(), 1));
        LblParede2.setIcon(icon);
        

    }//GEN-LAST:event_LblParede2AncestorAdded

    private void lblParede1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParede1MouseEntered
        if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Perdeu");
            Valendo = false;
            new Susto().setVisible(true);
        }
    }//GEN-LAST:event_lblParede1MouseEntered

    private void lblParede1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblParede1AncestorAdded
        ImageIcon icon = new ImageIcon("src/Imagens/Preto.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(lblParede1.getWidth(), lblParede1.getWidth(), 1));
        lblParede1.setIcon(icon);
    }//GEN-LAST:event_lblParede1AncestorAdded

    private void LblParede3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LblParede3AncestorAdded
        ImageIcon icon = new ImageIcon("src/Imagens/Preto.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(LblParede3.getWidth(), LblParede3.getWidth(), 1));
        LblParede3.setIcon(icon);        // TODO add your handling code here:
    }//GEN-LAST:event_LblParede3AncestorAdded

    private void LblParede3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblParede3MouseEntered
          if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Perdeu");
            Valendo = false;
            new Susto().setVisible(true);
        } // TODO add your handling code here:
    }//GEN-LAST:event_LblParede3MouseEntered

    private void lblParede4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblParede4AncestorAdded
        ImageIcon icon = new ImageIcon("src/Imagens/Preto.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(lblParede4.getWidth(), lblParede4.getWidth(), 1));
        lblParede4.setIcon(icon); // TODO add your handling code here:
    }//GEN-LAST:event_lblParede4AncestorAdded

    private void lblParede5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblParede5AncestorAdded
        ImageIcon icon = new ImageIcon("src/Imagens/Preto.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(lblParede5.getWidth(), lblParede5.getWidth(), 1));
        lblParede5.setIcon(icon); // TODO add your handling code here:
    }//GEN-LAST:event_lblParede5AncestorAdded

    private void lblParede6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblParede6AncestorAdded
        ImageIcon icon = new ImageIcon("src/Imagens/Preto.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(lblParede6.getWidth(), lblParede6.getWidth(), 1));
        lblParede6.setIcon(icon); // TODO add your handling code here:
    }//GEN-LAST:event_lblParede6AncestorAdded

    private void LblInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblInicioMousePressed
        Valendo = true;
        LblInicio.enable(false);
    }//GEN-LAST:event_LblInicioMousePressed

    private void LblInicioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LblInicioAncestorAdded
        ImageIcon icon = new ImageIcon("src/Imagens/PontoInicial.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(LblInicio.getWidth(), LblInicio.getWidth(), 1));
        LblInicio.setIcon(icon);
    }//GEN-LAST:event_LblInicioAncestorAdded

    private void lblPontoFinalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblPontoFinalAncestorAdded
    ImageIcon icon = new ImageIcon("src/Imagens/PontoFinal.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(lblPontoFinal.getWidth(), lblPontoFinal.getWidth(), 1));
        lblPontoFinal.setIcon(icon);        // TODO add your handling code here:
    }//GEN-LAST:event_lblPontoFinalAncestorAdded

    private void lblParede4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParede4MouseEntered
         if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Perdeu");
            Valendo = false;
            new Susto().setVisible(true);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_lblParede4MouseEntered

    private void lblParede5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParede5MouseEntered
         if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Perdeu");
            Valendo = false;
            new Susto().setVisible(true);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_lblParede5MouseEntered

    private void lblParede6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParede6MouseEntered
         if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Perdeu");
            Valendo = false;
            new Susto().setVisible(true);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_lblParede6MouseEntered

    private void lblPontoFinalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPontoFinalMouseEntered
          if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Ganhou");
            Valendo = false;
            new Fase4().setVisible(true);
            this.dispose();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_lblPontoFinalMouseEntered

    private void lblParede8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParede8MouseEntered
          if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Perdeu");
            Valendo = false;
            new Susto().setVisible(true);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_lblParede8MouseEntered

    private void lblParede9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParede9MouseEntered
       if (Valendo){
            JOptionPane.showMessageDialog(null,"Voce Perdeu");
            Valendo = false;
            new Susto().setVisible(true);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_lblParede9MouseEntered

    private void lblParede8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblParede8AncestorAdded
        ImageIcon icon = new ImageIcon("src/Imagens/Preto.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(lblParede8.getWidth(), lblParede8.getWidth(), 1));
        lblParede8.setIcon(icon); // TODO add your handling code here:
    }//GEN-LAST:event_lblParede8AncestorAdded

    private void lblParede9AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblParede9AncestorAdded
 ImageIcon icon = new ImageIcon("src/Imagens/Preto.jpg");
        //JOptionPane.showMessageDialog(null,"src/Imagens/Carta" + rand1 + ".jpg" );
        icon.setImage(icon.getImage().getScaledInstance(lblParede9.getWidth(), lblParede9.getWidth(), 1));
        lblParede9.setIcon(icon);        // TODO add your handling code here:
    }//GEN-LAST:event_lblParede9AncestorAdded

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
            java.util.logging.Logger.getLogger(Fase4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblInicio;
    private javax.swing.JLabel LblParede2;
    private javax.swing.JLabel LblParede3;
    private javax.swing.JLabel lblParede1;
    private javax.swing.JLabel lblParede4;
    private javax.swing.JLabel lblParede5;
    private javax.swing.JLabel lblParede6;
    private javax.swing.JLabel lblParede8;
    private javax.swing.JLabel lblParede9;
    private javax.swing.JLabel lblPontoFinal;
    // End of variables declaration//GEN-END:variables
}
