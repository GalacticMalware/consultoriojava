/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProgramarCita extends javax.swing.JFrame {

public ProgramarCita() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
boolean buscar1=false;
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha_cita1 = new datechooser.beans.DateChooserCombo();
        Hora = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        GuaradarCita = new javax.swing.JButton();
        nombre1 = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        sexo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        BuscarPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fecha_registro = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Fecha de la cita:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, -1, -1));
        getContentPane().add(fecha_cita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 280, 50));

        Hora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Hora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Hora.setText(":");
        Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraActionPerformed(evt);
            }
        });
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 280, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_minipng2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(65, 65));
        jButton2.setMinimumSize(new java.awt.Dimension(65, 65));
        jButton2.setPreferredSize(new java.awt.Dimension(48, 48));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_minipng.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 48, 48));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close-icon2.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(48, 48));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu2.png"))); // NOI18N
        Menu.setContentAreaFilled(false);
        Menu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu_1.png"))); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 350, 150, 150));

        GuaradarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar2.png"))); // NOI18N
        GuaradarCita.setContentAreaFilled(false);
        GuaradarCita.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        GuaradarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuaradarCitaActionPerformed(evt);
            }
        });
        getContentPane().add(GuaradarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 150, 150));

        nombre1.setEditable(false);
        nombre1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 350, -1));

        apellido.setEditable(false);
        apellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 350, -1));

        jLabel5.setBackground(new java.awt.Color(51, 0, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Apellido:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        fecha.setEditable(false);
        fecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 250, -1));

        sexo.setEditable(false);
        sexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 350, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Sexo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Telefono:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 350, -1));

        email.setEditable(false);
        email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 350, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("E-mail:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, -1, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 350, 40));

        BuscarPaciente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(BuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 350, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Buscar paciente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CitaFondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));
        getContentPane().add(fecha_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraActionPerformed
boolean hora1=true,fecha_cita=true;
    private void GuaradarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuaradarCitaActionPerformed
    
        if(buscar1==true){ 
            
           if(Hora.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo HORA esta vacio"); hora1=false;
        }else{hora1=true;}
        if(fecha_cita1.getText().equals("")){
        JOptionPane.showMessageDialog(null,"El campo FECHA esta vacio"); fecha_cita=false;
        }else{fecha_cita=true;}
        
        
        if(hora1==true&fecha_cita==true){
try{
            Connection conectar=null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/consultorio","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ProgramarCita.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             String insertar="INSERT INTO citas(hora,fecha,fecha_registro) VALUES(?,?,?)";
       
            PreparedStatement dato=conectar.prepareStatement(insertar);
            
            dato.setString(1,fecha_cita1.getText());
            dato.setString(2,Hora.getText());
            dato.setString(3,fecha_registro.getText());
            
            
            int i=dato.executeUpdate();
            if(i>0){
            JOptionPane.showMessageDialog(null,"Los datos se an guardado corectamente.");
            
            }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}
            
        }catch(SQLException ex){Logger.getLogger(ProgramarCita.class.getName()).log(Level.SEVERE,null,ex);}
        
        }
        
        }else{
    JOptionPane.showMessageDialog(null,"Primero busque al paciente para guardar los datos");
}
        
        
        
    }//GEN-LAST:event_GuaradarCitaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   this.setState(ProgramarCita.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 int dialog =JOptionPane.YES_NO_OPTION;
        int resultado= JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");
        if(resultado==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed

        if(Hora.getText().equals("")){
           hora1=false;
        }else{hora1=true;}
        if(fecha_cita1.getText().equals("")){
       fecha_cita=false;
        }else{fecha_cita=true;}
        
        
        if(hora1==true|fecha_cita==true){
            int dialog =JOptionPane.YES_NO_OPTION;
        int resultado= JOptionPane.showConfirmDialog(null, "¿Desea ir al menu, los datos ingresados no se guardaran?");
        if(resultado==0){
            menu menu1=new menu();
            menu1.setVisible(true);
            this.dispose();
        }
            
        }
        
        if(hora1==false){
            menu menu1=new menu ();
            menu1.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_MenuActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        
        if(BuscarPaciente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingreser el nombre y/o apellido del paciente"); buscar1=false;
        }else{
            buscar1=true;
        }
        
        if(buscar1==true){
            
        
        Connection conectar=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/consultorio","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(IngresaPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nombre=this.BuscarPaciente.getText();
        try{
            Statement s=conectar.createStatement();
            ResultSet rs=s.executeQuery("SELECT nombre,apellido,genero,fecha_nacimiento,telefono,email FROM paciente WHERE nombre='"+nombre+"'");
            if(rs.next()){
                nombre1.setText(rs.getString(1));
                apellido.setText(rs.getString(2));
                sexo.setText(rs.getString(3));
                fecha.setText(rs.getString(4));
                telefono.setText(rs.getString(5));
                email.setText(rs.getString(6));
            }else{
                JOptionPane.showMessageDialog(null, "El paciente: "+nombre+"  no existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CirugiasProgramadas.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(ProgramarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarPaciente;
    private javax.swing.JButton GuaradarCita;
    private javax.swing.JTextField Hora;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fecha;
    private datechooser.beans.DateChooserCombo fecha_cita1;
    private datechooser.beans.DateChooserCombo fecha_registro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField sexo;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
