/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penyilihan;
import java.awt.GridBagLayout;
/**
 *
 * @author X
 */
public class tux extends javax.swing.JFrame {
    GridBagLayout layout2 = new GridBagLayout();

    peralatantux tu1;
    persetujuanx tu2;
    riwayattux tu3;
    pengembaliantux tu4;
    
    public tux() {
        initComponents();
        setLocationRelativeTo(this);
        
        tu1 = new peralatantux();
        tu2 = new persetujuanx();
        tu3 = new riwayattux();
        tu4 = new pengembaliantux();
        
        paneltu.setLayout(layout2);
        paneltu.add(tu1);
        paneltu.add(tu2);
        paneltu.add(tu3);
        paneltu.add(tu4);
        
        tu1.setVisible(false);
        tu2.setVisible(false);
        tu3.setVisible(false);
        tu4.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pengembaliantu = new javax.swing.JButton();
        riwayattu = new javax.swing.JButton();
        persetujuantu = new javax.swing.JButton();
        peralatantu3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        paneltu = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1140, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pengembaliantu.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        pengembaliantu.setText("Pengembalian");
        pengembaliantu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembaliantuActionPerformed(evt);
            }
        });
        getContentPane().add(pengembaliantu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 140, 40));

        riwayattu.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        riwayattu.setText("Riwayat");
        riwayattu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayattuActionPerformed(evt);
            }
        });
        getContentPane().add(riwayattu, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 140, 40));

        persetujuantu.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        persetujuantu.setText("Persetujuan");
        persetujuantu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persetujuantuActionPerformed(evt);
            }
        });
        getContentPane().add(persetujuantu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 140, 40));

        peralatantu3.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        peralatantu3.setText("Peralatan");
        peralatantu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peralatantu3ActionPerformed(evt);
            }
        });
        getContentPane().add(peralatantu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/JUDUL.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 900, 130));

        paneltu.setBackground(new java.awt.Color(255, 204, 102));
        paneltu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paneltu.setEnabled(false);
        paneltu.setMinimumSize(new java.awt.Dimension(910, 520));
        paneltu.setName(""); // NOI18N
        paneltu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(paneltu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 910, 480));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peralatantu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peralatantu3ActionPerformed
        tu1.setVisible(true);
        tu2.setVisible(false);
        tu3.setVisible(false);
        tu4.setVisible(false);  

        // TODO add your handling code here:
    }//GEN-LAST:event_peralatantu3ActionPerformed

    private void persetujuantuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persetujuantuActionPerformed
        tu1.setVisible(false);
        tu2.setVisible(true);
        tu3.setVisible(false);
        tu4.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_persetujuantuActionPerformed

    private void riwayattuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayattuActionPerformed
        tu1.setVisible(false);
        tu2.setVisible(false);
        tu3.setVisible(true);
        tu4.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_riwayattuActionPerformed

    private void pengembaliantuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembaliantuActionPerformed
        tu1.setVisible(false);
        tu2.setVisible(false);
        tu3.setVisible(false);
        tu4.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_pengembaliantuActionPerformed

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
            java.util.logging.Logger.getLogger(tux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tux().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Panel paneltu;
    private javax.swing.JButton pengembaliantu;
    private javax.swing.JButton peralatantu3;
    private javax.swing.JButton persetujuantu;
    private javax.swing.JButton riwayattu;
    // End of variables declaration//GEN-END:variables
}