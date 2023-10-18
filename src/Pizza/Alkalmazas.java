/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pizza;

import javax.swing.JOptionPane;

/**
 *
 * @author kiscs
 */
public class Alkalmazas extends javax.swing.JFrame {

    /**
     * Creates new form Alkalmazas
     */
    public Alkalmazas() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelAlap = new javax.swing.JPanel();
        RadioParadicsomos = new javax.swing.JRadioButton();
        RadioSajtos = new javax.swing.JRadioButton();
        RadioSonkas = new javax.swing.JRadioButton();
        PanelFeltetel = new javax.swing.JPanel();
        BoxTejfölös = new javax.swing.JCheckBox();
        BoxSajtos = new javax.swing.JCheckBox();
        BoxSonkas = new javax.swing.JCheckBox();
        LabelMeret = new javax.swing.JLabel();
        LabelMennyiseg = new javax.swing.JLabel();
        ComboMeret = new javax.swing.JComboBox<>();
        ComboDB = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        kep = new javax.swing.JLabel();
        TörlesGomb = new javax.swing.JButton();
        RendelesGomb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        PanelAlap.setBorder(javax.swing.BorderFactory.createTitledBorder("Alap"));

        buttonGroup1.add(RadioParadicsomos);
        RadioParadicsomos.setText("Paradicsomos");

        buttonGroup1.add(RadioSajtos);
        RadioSajtos.setText("Sajtos");

        buttonGroup1.add(RadioSonkas);
        RadioSonkas.setText("Sonkás");

        javax.swing.GroupLayout PanelAlapLayout = new javax.swing.GroupLayout(PanelAlap);
        PanelAlap.setLayout(PanelAlapLayout);
        PanelAlapLayout.setHorizontalGroup(
            PanelAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlapLayout.createSequentialGroup()
                .addGroup(PanelAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioParadicsomos)
                    .addComponent(RadioSajtos)
                    .addComponent(RadioSonkas))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        PanelAlapLayout.setVerticalGroup(
            PanelAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioParadicsomos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioSajtos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioSonkas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelFeltetel.setBorder(javax.swing.BorderFactory.createTitledBorder("Feltétel"));

        BoxTejfölös.setText("Tejfölös");

        BoxSajtos.setText("Sajtos");

        BoxSonkas.setText("Sonkás");

        javax.swing.GroupLayout PanelFeltetelLayout = new javax.swing.GroupLayout(PanelFeltetel);
        PanelFeltetel.setLayout(PanelFeltetelLayout);
        PanelFeltetelLayout.setHorizontalGroup(
            PanelFeltetelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFeltetelLayout.createSequentialGroup()
                .addGroup(PanelFeltetelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoxTejfölös, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxSajtos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxSonkas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        PanelFeltetelLayout.setVerticalGroup(
            PanelFeltetelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFeltetelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BoxTejfölös)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxSajtos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxSonkas)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        LabelMeret.setText("Méret:");

        LabelMennyiseg.setText("Mennyiség:");

        ComboMeret.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<---Válassz--->", "35cm", "45cm", "55cm" }));

        ComboDB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1db", "3db", "6db", "12db" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kép"));

        kep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizza/KÉP.jpg"))); // NOI18N
        kep.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kep, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TörlesGomb.setText("Törlés");
        TörlesGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TörlesGombActionPerformed(evt);
            }
        });

        RendelesGomb.setText("Rendelés");
        RendelesGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendelesGombActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TörlesGomb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RendelesGomb))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelMeret)
                            .addComponent(LabelMennyiseg))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ComboMeret, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(PanelAlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelFeltetel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelAlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(PanelFeltetel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMeret)
                    .addComponent(ComboMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelMennyiseg)
                    .addComponent(ComboDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TörlesGomb)
                    .addComponent(RendelesGomb)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RendelesGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendelesGombActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Ez egy tesztverzió", "Cím", 2);
        JOptionPane.showMessageDialog(rootPane, "köszönöm a rendelést");
    }//GEN-LAST:event_RendelesGombActionPerformed

    private void TörlesGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TörlesGombActionPerformed
    System.exit(0);
    }//GEN-LAST:event_TörlesGombActionPerformed

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
            java.util.logging.Logger.getLogger(Alkalmazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alkalmazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alkalmazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alkalmazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alkalmazas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BoxSajtos;
    private javax.swing.JCheckBox BoxSonkas;
    private javax.swing.JCheckBox BoxTejfölös;
    private javax.swing.JComboBox<String> ComboDB;
    private javax.swing.JComboBox<String> ComboMeret;
    private javax.swing.JLabel LabelMennyiseg;
    private javax.swing.JLabel LabelMeret;
    private javax.swing.JPanel PanelAlap;
    private javax.swing.JPanel PanelFeltetel;
    private javax.swing.JRadioButton RadioParadicsomos;
    private javax.swing.JRadioButton RadioSajtos;
    private javax.swing.JRadioButton RadioSonkas;
    private javax.swing.JButton RendelesGomb;
    private javax.swing.JButton TörlesGomb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kep;
    // End of variables declaration//GEN-END:variables
}
