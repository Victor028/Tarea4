
package Formularios;

import EmpleadosDAL.Conexion;
import UsuarioBL.UsuarioBL;
import javax.swing.JOptionPane;

public class Agregar extends javax.swing.JFrame {

   
    public Agregar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpass2 = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Registrarse!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("REGISTRARSE");

        jLabel3.setText("Usuario:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Contraseña:");

        jLabel8.setText("Correo:");

        jLabel9.setText("Repetir Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreo)
                    .addComponent(txtpass)
                    .addComponent(txtTelefono)
                    .addComponent(txtApellido)
                    .addComponent(txtNombre)
                    .addComponent(txtUser)
                    .addComponent(txtpass2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel9)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conexion objConexion = new Conexion();
        UsuarioBL oUsuario = RecuperarDatos();
        String SentenciaInsert = String.format("insert into Usuario "
                + "values (null,'%s','%s','%s','%s','%s','%s');", oUsuario.getUser(),oUsuario.getNombre(),oUsuario.getApellido(),oUsuario.getTelefono(),oUsuario.getCorreo(),oUsuario.getPass());
        
 
        
        
        
        
         if (CombrobarClave() == 0 && comprobarCampos() == 0) {
            objConexion.ejecutarSenSql(SentenciaInsert);
            JOptionPane.showMessageDialog(null, "Datos Registrado Correctamente");
            Sistema();
            
            
            
            
        } 
        else if(comprobarCampos()==1){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
        else {
            JOptionPane.showMessageDialog(null, "Las claves no coinsiden, deben coincidir.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
     public UsuarioBL RecuperarDatos(){
            UsuarioBL oUsuario = new UsuarioBL();
            
            String pass = String.valueOf(txtpass.getPassword());
            String pass2 = String.valueOf(txtpass2.getPassword());
            
           
           oUsuario.setUser(txtUser.getText());
           oUsuario.setNombre(txtNombre.getText());
           oUsuario.setApellido(txtApellido.getText());
           oUsuario.setTelefono(txtTelefono.getText());
           oUsuario.setCorreo(txtCorreo.getText());
           oUsuario.setPass(pass);
           oUsuario.setPass2(pass2);
           
           
           
           
          return oUsuario;
        
        }
     
        
     private int comprobarCampos(){
         
         UsuarioBL oU = RecuperarDatos();
         
         String nombre, apellido, telefono, correo, pass,pass2,user;
         user = oU.getUser();
         nombre = oU.getNombre();
         apellido = oU.getApellido();
         telefono = oU.getTelefono();
         correo= oU.getCorreo();
         pass = oU.getPass();
         pass2 = oU.getPass2();
         boolean camposVacios = false;
         int respuesta = 0;
         
         int [] array1 = {user.length(),nombre.length(),apellido.length(),telefono.length(),correo.length(),pass.length(),pass2.length()};
         
         for (int i = 0; i < array1.length; i++) {
             if (array1[i] == 0) {
                 camposVacios = true; 
                 break;
             }
             else {
                 camposVacios = false;
             }
         }
         
       
         if ( camposVacios == false) {
             
             respuesta = 0;
             
         } else if(camposVacios == true){
             
             respuesta = 1;
             
         }
         
         
        return respuesta;
     }
     
     private int CombrobarClave(){
         
         UsuarioBL oU= RecuperarDatos();
         String pass,pass2;
         boolean claveIguales = true;
         int respuesta = 0;
         pass = oU.getPass();
         pass2 = oU.getPass2();
         
         if (pass.equals(pass2)) {
             respuesta = 0;
         }
         else{
             respuesta =1;
         }
         
         return respuesta;
     }
     
     
     private void Sistema() {
         Sistema sis= new Sistema();
         sis.setVisible(true);
         this.dispose();
    }
     
     
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtpass2;
    // End of variables declaration//GEN-END:variables

    

    
}
