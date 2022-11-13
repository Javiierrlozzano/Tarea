package clases;

import Conexion.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ventana2 extends javax.swing.JFrame {

    String cliente = consulta.cliente;

    public ventana2() {
        initComponents();
        setTitle("Clientes");
        setSize(359, 342);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        consultar();
        
        
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

    public void consultar() {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from cliente where cliente=?");
            pst.setString(1, cliente);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_cedula.setText(rs.getString("cedula"));
                txt_cliente.setText(cliente);
                txt_direccion.setText(rs.getString("direccion"));
                txt_localidad.setText(rs.getString("localidad"));
            }
        } catch (SQLException e) {
            System.err.println("error al consultar " + e);
        }
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
        btt_borrar = new javax.swing.JButton();
        btt_actualizar = new javax.swing.JButton();
        jlabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Datos de usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cedula:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txt_cliente.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, -1));

        txt_cedula.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 260, -1));

        txt_localidad.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 260, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Localidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, -1));

        btt_borrar.setBackground(new java.awt.Color(0, 102, 102));
        btt_borrar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btt_borrar.setText("Borrar");
        btt_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        btt_actualizar.setBackground(new java.awt.Color(0, 102, 102));
        btt_actualizar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btt_actualizar.setText("Actualizar");
        btt_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jlabel_wallpaper.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_actualizarActionPerformed
        Principal accion = new Principal();
        accion.actualizar();
        this.dispose();
        consulta.abrir();
    }//GEN-LAST:event_btt_actualizarActionPerformed

    private void btt_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_borrarActionPerformed
        Principal accion = new Principal();
        accion.borrar();
        this.dispose();
        consulta.abrir();
    }//GEN-LAST:event_btt_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(ventana2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_actualizar;
    private javax.swing.JButton btt_borrar;
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
