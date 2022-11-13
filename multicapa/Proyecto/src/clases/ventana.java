package clases;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ventana extends javax.swing.JFrame {

    public ventana() {
        initComponents();
        setTitle("Clientes");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(359, 342);
         setDefaultCloseOperation(HIDE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaper.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(jlabel_wallpaper.getWidth(), jlabel_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jlabel_wallpaper.setIcon(icon);
        this.repaint();
    }

    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo1.png"));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_localidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        btt_insertar = new javax.swing.JButton();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Datos de usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cedula:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txt_cliente.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, -1));

        txt_cedula.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, -1));

        txt_localidad.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Localidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, -1));

        btt_insertar.setBackground(new java.awt.Color(0, 102, 102));
        btt_insertar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btt_insertar.setText("Insertar");
        btt_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_insertarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, -1));

        jlabel_wallpaper.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_insertarActionPerformed
        Principal accion = new Principal();
        accion.insertar();
        this.dispose();
        consulta.abrir();
    }//GEN-LAST:event_btt_insertarActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlabel_wallpaper;
    public static javax.swing.JTextField txt_cedula;
    public static javax.swing.JTextField txt_cliente;
    public static javax.swing.JTextField txt_direccion;
    public static javax.swing.JTextField txt_localidad;
    // End of variables declaration//GEN-END:variables
}
