/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad.Vistas;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class Vista1 extends javax.swing.JFrame {

    /**
     * Creates new form Vista1
     */
    public Vista1() {
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

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Vista4 = new javax.swing.JMenuItem();
        Vista5 = new javax.swing.JMenuItem();
        Vista6 = new javax.swing.JMenuItem();
        Vista7 = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Vista3 = new javax.swing.JMenuItem();
        Vista2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Informática");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tECNICO.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Práctica : Vectores con MVC");

        jMenu2.setText("Opciones");

        Vista4.setText("Crear Vector");
        Vista4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vista4ActionPerformed(evt);
            }
        });
        jMenu2.add(Vista4);

        Vista5.setText("Ingresar Datos");
        Vista5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vista5ActionPerformed(evt);
            }
        });
        jMenu2.add(Vista5);

        Vista6.setText("Mostrar Mayor");
        jMenu2.add(Vista6);

        Vista7.setText("Mostrar Listado");
        Vista7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vista7ActionPerformed(evt);
            }
        });
        jMenu2.add(Vista7);

        Salir.setText("Salir");
        jMenu2.add(Salir);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        Vista3.setText("Instructivo");
        jMenu3.add(Vista3);

        Vista2.setText("Acerca de:");
        Vista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vista2ActionPerformed(evt);
            }
        });
        jMenu3.add(Vista2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Vista4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vista4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Vista4ActionPerformed

    private void Vista5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vista5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Vista5ActionPerformed

    private void Vista7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vista7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Vista7ActionPerformed

    private void Vista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vista2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Vista2ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Salir;
    public javax.swing.JMenuItem Vista2;
    public javax.swing.JMenuItem Vista3;
    public javax.swing.JMenuItem Vista4;
    public javax.swing.JMenuItem Vista5;
    public javax.swing.JMenuItem Vista6;
    public javax.swing.JMenuItem Vista7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
