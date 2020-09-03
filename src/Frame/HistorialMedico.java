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

public class HistorialMedico extends javax.swing.JFrame {
    public HistorialMedico() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    boolean buscar1=false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Sangre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alergia = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Enfermedad = new javax.swing.JTextArea();
        BuscarPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Estatura = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        FONDOHISTORIAL = new javax.swing.JLabel();
        fecha_registro = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Descripcion de alergia:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Enfermedades:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Tipo de sandro:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar2.png"))); // NOI18N
        Guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 150, 150));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu2.png"))); // NOI18N
        Menu.setContentAreaFilled(false);
        Menu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu_1.png"))); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 150, 150));

        Sangre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Sangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        Sangre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SangreActionPerformed(evt);
            }
        });
        getContentPane().add(Sangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 300, -1));

        Alergia.setColumns(20);
        Alergia.setRows(5);
        jScrollPane1.setViewportView(Alergia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 300, 130));

        Enfermedad.setColumns(20);
        Enfermedad.setRows(5);
        jScrollPane2.setViewportView(Enfermedad);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 300, 120));

        BuscarPaciente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(BuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 350, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Buscar paciente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 350, 40));

        jLabel5.setBackground(new java.awt.Color(51, 0, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        nombre1.setEditable(false);
        nombre1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 350, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Apellido:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, -1));

        apellido.setEditable(false);
        apellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 350, -1));

        fecha.setEditable(false);
        fecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Sexo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        sexo.setEditable(false);
        sexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 350, -1));

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 350, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Telefono:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("E-mail:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, -1, -1));

        email.setEditable(false);
        email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 350, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Peso:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Estatura:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        Estatura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(Estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 300, -1));

        Peso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 300, -1));

        FONDOHISTORIAL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FONDOHISTORIAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoHistorial.jpg"))); // NOI18N
        getContentPane().add(FONDOHISTORIAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));
        getContentPane().add(fecha_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean enfermedad=true,alergia=true;
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
      
if(buscar1==true){
    
    
    
            if (Enfermedad.getText().equals("")){
                JOptionPane.showMessageDialog(null,"El campo ENFERMEDAD esta vacio"); enfermedad=false;
            }else{enfermedad=true;}
            if(Alergia.getText().equals("")){
                JOptionPane.showMessageDialog(null,"El campo Alergia esta vacio"); alergia=false;
            }else{alergia=true;}
            
        if (alergia==true&enfermedad==true){
            
            try{
                Connection conectar=null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conectar=DriverManager.getConnection("jdbc:mysql://localhost/consultorio","root","");
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(IngresaPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }

                String insertar="INSERT INTO historial(alergias,enfermedad,tipo_de_sangre,estatura,peso,fecha_registro) VALUES(?,?,?,?,?,?)";

                PreparedStatement dato=conectar.prepareStatement(insertar);
                dato.setString(1,Alergia.getText());
                dato.setString(2,Enfermedad.getText());
                dato.setString(3,Sangre.getItemAt(WIDTH));
                dato.setString(4,Estatura.getText());
                dato.setString(5,Peso.getText());
                dato.setString(6,fecha_registro.getText());
                
                
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

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed

       if (Enfermedad.getText().equals("")){
             enfermedad=false;
            }else{enfermedad=true;}
            if(Alergia.getText().equals("")){
            alergia=false;
            }else{alergia=true;}
            
        if (alergia==true|enfermedad==true){
        
            int dialog =JOptionPane.YES_NO_OPTION;
        int resultado= JOptionPane.showConfirmDialog(null, "¿Desea ir al menu, los datos ingresados no se guardaran?");
        if (resultado ==0){
        
         menu menu1=new menu();
            menu1.setVisible(true);
        }
        }
        
        if(alergia==false&enfermedad==false){
        menu menu1 = new menu();
            menu1.setVisible(true);
            this.dispose();
        
        }

    }//GEN-LAST:event_MenuActionPerformed

    private void SangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SangreActionPerformed

        
        
    }//GEN-LAST:event_SangreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.setState(HistorialMedico.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 int dialog =JOptionPane.YES_NO_OPTION;
        int resultado= JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");
        if(resultado==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alergia;
    private javax.swing.JTextField BuscarPaciente;
    private javax.swing.JTextArea Enfermedad;
    private javax.swing.JTextField Estatura;
    private javax.swing.JLabel FONDOHISTORIAL;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField Peso;
    private javax.swing.JComboBox<String> Sangre;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fecha;
    private datechooser.beans.DateChooserCombo fecha_registro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField sexo;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
