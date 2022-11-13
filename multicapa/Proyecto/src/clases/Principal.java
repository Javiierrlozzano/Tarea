package clases;

import Conexion.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import clases.ventana;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Principal implements ActionListener {

    private ventana ventana;
    private ventana2 ventana2;
    String cliente=consulta.cliente;

    public void insertar() {
        boolean valido = true;
        if (this.ventana.txt_localidad.getText().trim().equals("")) {
            this.ventana.txt_localidad.setBackground(Color.red);
            valido = false;
        }
        if (this.ventana.txt_direccion.getText().trim().equals("")) {
            this.ventana.txt_direccion.setBackground(Color.red);
            valido = false;
        }
        if (this.ventana.txt_cedula.getText().trim().equals("")) {
            this.ventana.txt_cedula.setBackground(Color.red);
            valido = false;
        }
        if (this.ventana.txt_cliente.getText().trim().equals("")) {
            this.ventana.txt_cliente.setBackground(Color.red);
            valido = false;
        }
        if (valido == false) {
            JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
            this.ventana.txt_cliente.setBackground(Color.white);
            this.ventana.txt_localidad.setBackground(Color.white);
            this.ventana.txt_direccion.setBackground(Color.white);
            this.ventana.txt_cedula.setBackground(Color.white);
        }

        if (valido == true) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into cliente values (?,?,?,?)");
                pst.setString(1, this.ventana.txt_cliente.getText().trim());
                pst.setString(2, this.ventana.txt_cedula.getText().trim());
                pst.setString(3, this.ventana.txt_localidad.getText().trim());
                pst.setString(4, this.ventana.txt_direccion.getText().trim());
                pst.executeUpdate();

                this.ventana.txt_localidad.setText("");
                this.ventana.txt_direccion.setText("");
                this.ventana.txt_cedula.setText("");
                this.ventana.txt_cliente.setText("");
                cn.close();

                this.ventana.txt_cliente.setBackground(Color.green);
                this.ventana.txt_localidad.setBackground(Color.green);
                this.ventana.txt_direccion.setBackground(Color.green);
                this.ventana.txt_cedula.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "cliente registrado");
                this.ventana.txt_cliente.setBackground(Color.white);
                this.ventana.txt_localidad.setBackground(Color.white);
                this.ventana.txt_direccion.setBackground(Color.white);
                this.ventana.txt_cedula.setBackground(Color.white);
                
            } catch (SQLException e) {
                System.err.println("error al insertar un nuevo usuario " + e);
            }
        }
    }

    public void borrar() {
        boolean valido = true;
        if (this.ventana2.txt_cliente.getText().trim().equals("")) {
            this.ventana2.txt_cliente.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "para borrar debe colocar el nombre del cliente");
            this.ventana.txt_cliente.setBackground(Color.white);
            valido = false;
        }
        if (valido == true) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("delete from cliente where cliente =?");
                pst.setString(1, ventana2.txt_cliente.getText().trim());
                pst.executeUpdate();

                this.ventana2.txt_localidad.setText("");
                this.ventana2.txt_direccion.setText("");
                this.ventana2.txt_cedula.setText("");
                this.ventana2.txt_cliente.setText("");
                cn.close();

                JOptionPane.showMessageDialog(null, "registro eliminado");
            } catch (HeadlessException | SQLException e) {
                System.err.println("error al borrar el registro " + e);
            }
        }

    }

    public void actualizar() {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("update cliente set cliente=?, cedula=?, localidad=?, direccion=? where  cliente='"  +cliente+ "'");
                pst.setString(1, this.ventana2.txt_cliente.getText().trim());
                pst.setString(2, this.ventana2.txt_cedula.getText().trim());
                pst.setString(3, this.ventana2.txt_localidad.getText().trim());
                pst.setString(4, this.ventana2.txt_direccion.getText().trim());
                pst.executeUpdate();

                cn.close();
                this.ventana2.txt_cliente.setBackground(Color.green);
                this.ventana2.txt_localidad.setBackground(Color.green);
                this.ventana2.txt_direccion.setBackground(Color.green);
                this.ventana2.txt_cedula.setBackground(Color.green);
                JOptionPane.showMessageDialog(null, "registro actualizado");
                this.ventana2.txt_localidad.setText("");
                this.ventana2.txt_direccion.setText("");
                this.ventana2.txt_cedula.setText("");
                this.ventana2.txt_cliente.setText("");
                this.ventana2.txt_cliente.setBackground(Color.white);
                this.ventana2.txt_localidad.setBackground(Color.white);
                this.ventana2.txt_direccion.setBackground(Color.white);
                this.ventana2.txt_cedula.setBackground(Color.white);

            } catch (SQLException e) {
                System.err.println("error al actualizar el registro " + e);
            }
        

    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
