package clases;

import Conexion.Conexion;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class consulta extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    public static String cliente;

    public consulta() {

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Listado clientes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        consultar();
        
       

        jtable_clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = jtable_clientes.rowAtPoint(e.getPoint());
                int columna = 0;
                if (fila > -1) {
                    cliente = (String) model.getValueAt(fila, columna);
                    ventana2 ventana = new ventana2();
                    ventana.setVisible(true);
                }
            }
        });

    }
           @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo1.png"));
        return icono;
    }
    public void consultar(){
         try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from cliente");
            ResultSet rs = pst.executeQuery();
            jtable_clientes = new JTable(model);
            jScrollPane1.setViewportView(jtable_clientes);

            model.addColumn("Cliente");
            model.addColumn("CIF");
            model.addColumn("Direccion");
            model.addColumn("Localidad");

            while (rs.next()) {
                Object clientes[] = new Object[4];
                for (int i = 0; i < clientes.length; i++) {
                    clientes[i] = rs.getObject(i + 1);
                }
                model.addRow(clientes);
            }
            cn.close();

        } catch (HeadlessException | SQLException e) {
            System.err.println("error al consultar " + e);
        }
    }
    public void cerrar() {
        this.dispose();
    }
    public static void abrir(){
        consulta ventana= new consulta();
        ventana.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();
        btt_ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Listado de clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtable_clientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 480, 120));

        btt_ingresar.setBackground(new java.awt.Color(0, 102, 102));
        btt_ingresar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btt_ingresar.setText("Nuevo cliente");
        btt_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_ingresarActionPerformed
        ventana ventana = new ventana();
        ventana.setVisible(true);
    }//GEN-LAST:event_btt_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_clientes;
    // End of variables declaration//GEN-END:variables
}
