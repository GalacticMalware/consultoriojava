
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

public class EstudiosGenerales extends javax.swing.JFrame {
    public EstudiosGenerales() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionEstudios = new javax.swing.JTextArea();
        Guardar = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CostoEstudios = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        tipo_estudio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        FondoEstoudios = new javax.swing.JLabel();
        fecha_registro = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Descripcion de estudios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 560, -1));

        DescripcionEstudios.setColumns(20);
        DescripcionEstudios.setRows(5);
        jScrollPane1.setViewportView(DescripcionEstudios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 570, 180));

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar2.png"))); // NOI18N
        Guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 150, 150));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu2.png"))); // NOI18N
        Menu.setContentAreaFilled(false);
        Menu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu_1.png"))); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 470, 150, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Costo $:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 110, -1));

        CostoEstudios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CostoEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoEstudiosActionPerformed(evt);
            }
        });
        getContentPane().add(CostoEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 290, -1));

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

        tipo_estudio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tipo_estudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiaco" }));
        getContentPane().add(tipo_estudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, 280, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Catalogo de estudios:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        FondoEstoudios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/19159207_xxl-e1406638177750.jpg"))); // NOI18N
        getContentPane().add(FondoEstoudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(fecha_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean descripcion= true,costo=true,buscar1=false;
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        if(buscar1 ==true){
            
        if (DescripcionEstudios.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo DESCRIPCION DE ESTUDIOS esta vacio"); descripcion=false;
        }else{descripcion=true;}
        if(CostoEstudios.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo Alergia esta vacio"); costo=false;
        }else{costo=true;}

        if (descripcion==true&costo==true){

            try{
                Connection conectar=null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conectar=DriverManager.getConnection("jdbc:mysql://localhost/consultorio","root","");
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(IngresaPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }

                String insertar="INSERT INTO estudios(tipo_estudio,precio_de_estudio,descripcion) VALUES(?,?,?,?)";

                PreparedStatement dato=conectar.prepareStatement(insertar);
                dato.setString(1,tipo_estudio.getItemAt(WIDTH));
                dato.setString(2,CostoEstudios.getText());
                dato.setString(3,DescripcionEstudios.getText());
                dato.setString(4,fecha_registro.getText());

                int i=dato.executeUpdate();
                if(i>0){
                    JOptionPane.showMessageDialog(null,"Los datos se an guardado corectamente.");
                    //Cita cita = new Cita();
                    //cita.setVisible(true);
                    //this.dispose();
                }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}

            }catch(SQLException ex){Logger.getLogger(IngresaPaciente.class.getName()).log(Level.SEVERE,null,ex);}

        }
        }else{
    JOptionPane.showMessageDialog(null,"Primero busque al paciente para guardar los datos");
}
        
    }//GEN-LAST:event_GuardarActionPerformed
boolean conta=true;
    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed

        
        
        
        
        
        if (DescripcionEstudios.getText().equals("")){
            descripcion=false; 
        }else{descripcion=true;}
        if(CostoEstudios.getText().equals("")){
             costo=false; 
        }else{costo=true; }
        
       if (descripcion ==true|costo==true){
        int dialog =JOptionPane.YES_NO_OPTION;
        int resultado= JOptionPane.showConfirmDialog(null, "¿Desea ir al menu, los datos ingresados no se guardaran?");
        if(resultado==0){
            menu menu1=new menu();
            menu1.setVisible(true);
            
            
        }      
        }
        
       if(descripcion==false&costo==false){
            menu menu1=new menu();
            menu1.setVisible(true);
            this.dispose();
       }
      
        
        
        // if(menu==true){
           
            //}else{JOptionPane.showMessageDialog(null, "Los Datos no se guardaran");}
    }//GEN-LAST:event_MenuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 int dialog =JOptionPane.YES_NO_OPTION;
        int resultado= JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");
        if(resultado==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   this.setState(EstudiosGenerales.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void CostoEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostoEstudiosActionPerformed

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
            java.util.logging.Logger.getLogger(EstudiosGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudiosGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudiosGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudiosGenerales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudiosGenerales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarPaciente;
    private javax.swing.JTextField CostoEstudios;
    private javax.swing.JTextArea DescripcionEstudios;
    private javax.swing.JLabel FondoEstoudios;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fecha;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField sexo;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipo_estudio;
    // End of variables declaration//GEN-END:variables
}
