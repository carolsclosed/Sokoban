/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package APPS;

import PARTS.Player;


/**
 *
 * @author ASUS
 */
public class SKIN extends javax.swing.JDialog {

    /**
     * Creates new form SKIN
     */
    
    private menu menuRef;//referencia do pai necessária para
    // passar informação do player selecionado
    
    /**
     * construtor
     * @param parent
     * @param modal 
     */
    
    public SKIN(menu parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(800,800);
        setLocationRelativeTo(null);
        this.menuRef = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        eren = new javax.swing.JButton();
        mikasa = new javax.swing.JButton();
        levi = new javax.swing.JButton();
        sasha = new javax.swing.JButton();
        armin = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        text.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        text.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        text.setForeground(new java.awt.Color(0, 51, 255));
        text.setText("PERSONAGEM?");
        getContentPane().add(text);
        text.setBounds(130, 400, 550, 190);

        eren.setBackground(new java.awt.Color(153, 204, 255));
        eren.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        eren.setForeground(new java.awt.Color(83, 55, 47));
        eren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/erenICON.png"))); // NOI18N
        eren.setBorderPainted(false);
        eren.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erenActionPerformed(evt);
            }
        });
        getContentPane().add(eren);
        eren.setBounds(460, 610, 120, 120);

        mikasa.setBackground(new java.awt.Color(153, 204, 255));
        mikasa.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        mikasa.setForeground(new java.awt.Color(83, 55, 47));
        mikasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/mikasaICON.png"))); // NOI18N
        mikasa.setBorderPainted(false);
        mikasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mikasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mikasaActionPerformed(evt);
            }
        });
        getContentPane().add(mikasa);
        mikasa.setBounds(200, 610, 120, 120);

        levi.setBackground(new java.awt.Color(153, 204, 255));
        levi.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        levi.setForeground(new java.awt.Color(83, 55, 47));
        levi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/leviICON.png"))); // NOI18N
        levi.setBorderPainted(false);
        levi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        levi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leviActionPerformed(evt);
            }
        });
        getContentPane().add(levi);
        levi.setBounds(330, 530, 120, 120);

        sasha.setBackground(new java.awt.Color(153, 204, 255));
        sasha.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        sasha.setForeground(new java.awt.Color(83, 55, 47));
        sasha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/sashaICON.png"))); // NOI18N
        sasha.setBorderPainted(false);
        sasha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sasha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sashaActionPerformed(evt);
            }
        });
        getContentPane().add(sasha);
        sasha.setBounds(70, 530, 120, 120);

        armin.setBackground(new java.awt.Color(153, 204, 255));
        armin.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        armin.setForeground(new java.awt.Color(83, 55, 47));
        armin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/arminICON.png"))); // NOI18N
        armin.setBorderPainted(false);
        armin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        armin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arminActionPerformed(evt);
            }
        });
        getContentPane().add(armin);
        armin.setBounds(590, 530, 120, 120);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSETS/coordsBACK.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 800, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    /**
     * função que altera o jogador ao clicar no botão de x personagem
     * @param evt 
     */
    
    private void erenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erenActionPerformed
      Player player = new Player();
      player.setEren();
      this.menuRef.setJogador(player); //enviar para o pai(menu)
      this.setVisible(false);
    }//GEN-LAST:event_erenActionPerformed
/**
     * função que altera o jogador ao clicar no botão de x personagem
     * @param evt 
     */
    private void mikasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mikasaActionPerformed
       Player player = new Player();
       player.setMikasa();
       this.menuRef.setJogador(player);//enviar para o pai(menu)

       this.setVisible(false);
    }//GEN-LAST:event_mikasaActionPerformed
/**
     * função que altera o jogador ao clicar no botão de x personagem
     * @param evt 
     */
    private void leviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leviActionPerformed
      Player player = new Player();
      player.setLevi();
      this.menuRef.setJogador(player); //enviar para o pai(menu)
      this.setVisible(false);    }//GEN-LAST:event_leviActionPerformed
/**
     * função que altera o jogador ao clicar no botão de x personagem
     * @param evt 
     */
    private void sashaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sashaActionPerformed
      Player player = new Player();
      player.setSasha();
      this.menuRef.setJogador(player); //enviar para o pai(menu)
      this.setVisible(false);    }//GEN-LAST:event_sashaActionPerformed
/**
     * função que altera o jogador ao clicar no botão de x personagem
     * @param evt 
     */
    private void arminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arminActionPerformed
      Player player = new Player();
      player.setArmin();
      this.menuRef.setJogador(player); //enviar para o pai(menu)
      this.setVisible(false);    }//GEN-LAST:event_arminActionPerformed

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
            java.util.logging.Logger.getLogger(SKIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SKIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SKIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SKIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SKIN dialog = new SKIN(new menu(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton armin;
    private javax.swing.JButton eren;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton levi;
    private javax.swing.JButton mikasa;
    private javax.swing.JButton sasha;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}