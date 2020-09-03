package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class IngresaPaciente extends javax.swing.JFrame {

    String genero ="";
    boolean nombre=true,apellido= true,estatura=true,peso=true,genero1=true,edad=true,telefono=true,email=true,direccion=true;
boolean cita=false;
boolean menu=false;
    public IngresaPaciente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JTextField();
        Apellido1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MASCULINO = new javax.swing.JRadioButton();
        FEMENINO = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        Telefono1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Email1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Direccion1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        fecha_na = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        Edad = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();
        fecha_registro = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        Nombre1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Nombre1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 380, 30));

        Apellido1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Apellido1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 380, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_minipng2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(65, 65));
        jButton1.setMinimumSize(new java.awt.Dimension(65, 65));
        jButton1.setPreferredSize(new java.awt.Dimension(48, 48));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_minipng.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 48, 48));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close-icon2.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(48, 48));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));

        buttonGroup1.add(MASCULINO);
        MASCULINO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MASCULINO.setText("Masculino");
        MASCULINO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASCULINOActionPerformed(evt);
            }
        });
        getContentPane().add(MASCULINO, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, -1, 30));

        buttonGroup1.add(FEMENINO);
        FEMENINO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FEMENINO.setText("Femenino");
        FEMENINO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMENINOActionPerformed(evt);
            }
        });
        getContentPane().add(FEMENINO, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Telefono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        Telefono1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Telefono1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Telefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Telefono1ActionPerformed(evt);
            }
        });
        getContentPane().add(Telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 380, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("E-mail:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, -1, -1));

        Email1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Email1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 380, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Direccion:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        Direccion1.setColumns(20);
        Direccion1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Direccion1.setRows(5);
        jScrollPane1.setViewportView(Direccion1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 380, 150));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cita150.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cita2150.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 150, 150));

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar2.png"))); // NOI18N
        Guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 150, 150));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu2.png"))); // NOI18N
        Menu.setContentAreaFilled(false);
        Menu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu_1.png"))); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 450, 150, 150));

        fecha_na.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18));
        getContentPane().add(fecha_na, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 270, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Edad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        Edad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 380, -1));

        FONDO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoRegistro.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));
        getContentPane().add(fecha_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Telefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Telefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Telefono1ActionPerformed

    private void Nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if(cita==true){
              ProgramarCita cita1 = new ProgramarCita();
              cita1.setVisible(true);
              this.dispose();
      }else {JOptionPane.showMessageDialog(null,"PRIMERO DEBE DE GUARDAR LA INFORMACION DEL PACIENTE");}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     
        
        
        // do{
        if (Nombre1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo NOMBRE esta vacio"); nombre=false;
            }else{nombre=true;}
        if(Apellido1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo APELLIDO esta vacio"); apellido=false;
            }else{apellido=true;}
        if(genero.toString().equals("")){
                JOptionPane.showMessageDialog(null,"El campo GENERO esta vacio"); genero1=false;
            }else{genero1=true;}
        if(Telefono1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"El campo TELEFONO esta vacio"); telefono=false;
            }else{telefono=true;}
        if(Email1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"El campo E-mail esta vacio"); email=false;
            }else{email=true;}
        if(Direccion1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"El campo DIRECCION esta vacio"); direccion=false;
            }else{direccion=true;}
        if(Edad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo EDAD esta vacio"); edad=false;
        }else {
            edad=true;
        }
        
        
        //}while(nombre==true&&apellido==true&&estatura==true&&peso==true&&genero1==true&&fecha==true); 
        
        
        if (nombre==true&apellido==true&genero1==true&edad==true&telefono==true&email==true&direccion==true){
        
        cita=true;
            try{
            Connection conectar=null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/consultorio","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(IngresaPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             String insertar="INSERT INTO paciente(sexo, correo, direccion, nombre,edad,telefono,fecha_na,apellido,fecha_registro) VALUES(?,?,?,?,?,?,?,?)";
       
            PreparedStatement dato=conectar.prepareStatement(insertar);
            dato.setString(1,genero);
            dato.setString(2,Email1.getText());
            dato.setString(3,Direccion1.getText());
            dato.setString(4,Nombre1.getText());
            dato.setString(5,Edad.getText());
            dato.setString(6,fecha_na.getText());
            dato.setString(7,Telefono1.getText());
            dato.setString(8,Apellido1.getText());
            dato.setString(9,fecha_registro.getText());
//dato.setString(3,Estatura1.getText());
            //dato.setString(4,Peso1.getText());
           // String fechaString=null;
            //DateFormat fecha=fecha_na.getDateFormat();
            //SimpleDateFormat dato1= new SimpleDateFormat("yyyy-MM-dd");
            //fechaString=dato1.format(fecha);
            int i=dato.executeUpdate();
            if(i>0){
            JOptionPane.showMessageDialog(null,"Los datos se an guardado corectamente.");
            //Cita cita = new Cita();
            //cita.setVisible(true);
            //this.dispose();
            }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}
            
        }catch(SQLException ex){Logger.getLogger(IngresaPaciente.class.getName()).log(Level.SEVERE,null,ex);}
        
        }
        
        
    }//GEN-LAST:event_GuardarActionPerformed
 
    private void MASCULINOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASCULINOActionPerformed
      genero = MASCULINO.getLabel();
    }//GEN-LAST:event_MASCULINOActionPerformed

    private void FEMENINOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEMENINOActionPerformed
    genero = FEMENINO.getLabel();
    }//GEN-LAST:event_FEMENINOActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        
        if (Nombre1.getText().equals("")){
             nombre=false;
            }else{nombre=true;}
        if(Apellido1.getText().equals("")){
            apellido=false;
            }else{apellido=true;}
        if(genero.toString().equals("")){
               genero1=false;
            }else{genero1=true;}
        if(Edad.getText().equals("")){
                 edad=false;
            }else{edad=true;}
        if(Telefono1.getText().equals("")){
                 telefono=false;
            }else{telefono=true;}
        if(Email1.getText().equals("")){
                 email=false;
            }else{email=true;}
        if(Direccion1.getText().equals("")){
                direccion=false;
            }else{direccion=true;}
        
        
        
        
        if (nombre==true|apellido==true|genero1==true|telefono==true|email==true|direccion==true|edad==true){
        int dialog =JOptionPane.YES_NO_OPTION;
        int resultado= JOptionPane.showConfirmDialog(null, "¿Desea ir al menu, los datos ingresados no se guardaran?");
        if(resultado==0){
            menu menu1=new menu();
            menu1.setVisible(true);
            this.dispose();
            
        }      
        }
        
        if(nombre==false&apellido==false&genero1==false&telefono==false&email==false&direccion==false){
            menu menu1=new menu();
            menu1.setVisible(true);
            this.dispose();
        }
         
    }//GEN-LAST:event_MenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   this.setState(IngresaPaciente.ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 int dialog =JOptionPane.YES_NO_OPTION;
        int resultado= JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");
        if(resultado==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void Limpiar(){
        Nombre1.setText("");
        Apellido1.setText("");
        
    }
    
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
            java.util.logging.Logger.getLogger(IngresaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido1;
    private javax.swing.JTextArea Direccion1;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Email1;
    private javax.swing.JRadioButton FEMENINO;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton Guardar;
    private javax.swing.JRadioButton MASCULINO;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JTextField Telefono1;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo fecha_na;
    private datechooser.beans.DateChooserCombo fecha_registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
