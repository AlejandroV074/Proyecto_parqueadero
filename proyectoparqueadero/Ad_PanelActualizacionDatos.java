/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;


import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.Font;
import static com.itextpdf.kernel.pdf.PdfName.FontFamily;


import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;



/*
 *
 * @author Principal
 */
public class Ad_PanelActualizacionDatos extends javax.swing.JPanel {

    /**
     * Creates new form PanelIngresarVehiculo
     */
    private String cedula_edit;
    private ArrayList<Integer> ids = new ArrayList<>();
    
    
    public Ad_PanelActualizacionDatos() {
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

        btActualizar = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btEliminar = new java.awt.Button();
        cbParqueadero = new javax.swing.JComboBox<>();
        cbPerfil = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(246, 246, 246));

        btActualizar.setBackground(new java.awt.Color(51, 102, 255));
        btActualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btActualizar.setLabel("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 24, 80));
        jLabel1.setText("Modulo de Actualización de Datos ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 116, 155));
        jLabel2.setText("Cédula");

        jLabel4.setBackground(new java.awt.Color(255, 255, 102));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 116, 155));
        jLabel4.setText("Perfil");

        jLabel5.setBackground(new java.awt.Color(255, 255, 102));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 116, 155));
        jLabel5.setText("Correo");

        jLabel6.setBackground(new java.awt.Color(255, 255, 102));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 116, 155));
        jLabel6.setText("Teléfono");

        jLabel7.setBackground(new java.awt.Color(255, 255, 102));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 116, 155));
        jLabel7.setText("Apellidos");

        jLabel8.setBackground(new java.awt.Color(255, 255, 102));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(41, 116, 155));
        jLabel8.setText("Nombre");

        txtCedula.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtCedula.setEnabled(false);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtApellidos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 102));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 116, 155));
        jLabel9.setText("Parqueadero");

        btEliminar.setActionCommand("Eliminar");
        btEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btEliminar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btEliminar.setLabel("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        cbParqueadero.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbParqueadero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centro", "Barbosa", "Laureles" }));
        cbParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParqueaderoActionPerformed(evt);
            }
        });

        cbPerfil.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operario", "Administrador" }));
        cbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btActualizar.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed

        try {
            
            String nombre = txtNombre.getText();
            String apellidos = txtApellidos.getText();
            String telefono = txtTelefono.getText();
            String correo = txtCorreo.getText();
            String parqueadero = String.valueOf( cbParqueadero.getSelectedItem() );
            String perfil = String.valueOf( cbPerfil.getSelectedItem() );
            
            int indexSelected = cbParqueadero.getSelectedIndex();
            int id = ids.get(indexSelected);
            
            if ( nombre.equals("") || apellidos.equals("") || telefono.equals("") || correo.equals("") || parqueadero.equals("") || perfil.equals("") ) {

                JOptionPane.showMessageDialog(null, "Los campos son vacíos", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");
                
                String sql_usuarios = "UPDATE [dbo].[Usuarios] SET Nombre=?, Apellidos=?, Telefono=?, Correo=? WHERE Cedula = '" + cedula_edit + "';";

                PreparedStatement stat_usuarios = con.prepareStatement(sql_usuarios);

                stat_usuarios.setString(1, nombre);
                stat_usuarios.setString(2, apellidos);
                stat_usuarios.setString(3, telefono);
                stat_usuarios.setString(4, correo);

                stat_usuarios.executeUpdate();
                
                stat_usuarios.close();
                
                System.out.println( sql_usuarios );

                String sql_permisos = "UPDATE [dbo].[Permisos] SET Tipo_perfil=? WHERE Cedula = '" + cedula_edit + "';";

                PreparedStatement stat_permisos = con.prepareStatement(sql_permisos);

                stat_permisos.setString(1, perfil);

                stat_permisos.executeUpdate();
                
                stat_permisos.close();
                
                System.out.println( sql_permisos );
                
                String sql_asignacion = "UPDATE [dbo].[Asignacion_parqueadero] SET Id_parqueadero=? WHERE Cedula = '" + cedula_edit + "';";

                PreparedStatement stat_asignacion = con.prepareStatement(sql_asignacion);

                stat_asignacion.setInt(1, id);

                stat_asignacion.executeUpdate();
                
                stat_asignacion.close();
                
                System.out.println( sql_asignacion );
                
                Logger.getLogger(PanelIngresarParqueaderos.class.getName()).log(Level.SEVERE, null, stat_permisos);
                
                Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
                objFrame.changeToConsultUsers();
                
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelIngresarParqueaderos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PanelIngresarParqueaderos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btActualizarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el usuario?", "Confirmar eliminación de usuario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if ( input == 0 ) {
        
            try {
                // TODO add your handling code here:

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");
                Statement stat = con.createStatement();

                String sql_asignacion = "DELETE FROM [dbo].[Asignacion_parqueadero] WHERE Cedula='" + cedula_edit + "';";
                stat.executeUpdate(sql_asignacion);
                
                String sql_usuarios = "DELETE FROM [dbo].[Usuarios] WHERE Cedula='" + cedula_edit + "';";
                stat.executeUpdate(sql_usuarios);
                stat.close();

                Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
                objFrame.changeToConsultUsers();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PanelEditarParqueaderos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PanelEditarParqueaderos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void cbParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParqueaderoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbParqueaderoActionPerformed

    private void cbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPerfilActionPerformed

    public void setCedulaEdit( String cedula ) {
        cedula_edit = cedula;
    }
     
    
    @Override
    public void setVisible( boolean value ) {
        super.setVisible(value);
        cbParqueadero.removeAllItems();
        
        if (value) {
            try {
            // TODO add your handling code here:
            
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");
                Statement stat = con.createStatement();
                
                String sql_parqueaderos = "SELECT Id_parqueadero, Nombre_parqueadero FROM [dbo].[Parqueadero];";
                ResultSet rs_parqueaderos = stat.executeQuery(sql_parqueaderos);

                System.out.println(sql_parqueaderos);

                while ( rs_parqueaderos.next() ) {
                    int id_parqueadero = rs_parqueaderos.getInt("Id_parqueadero");
                    String nombre_parqueadero = rs_parqueaderos.getString("Nombre_parqueadero");

                    cbParqueadero.addItem(nombre_parqueadero);

                    ids.add(id_parqueadero);
                }
                
                String sql_usuarios = "SELECT "+
                                        "U.Cedula as 'Cedula', "+
                                        "U.Nombre as 'Nombre', "+
                                        "U.Apellidos as 'Apellidos', "+
                                        "U.Telefono as 'Telefono', "+
                                        "U.Correo as 'Correo', "+
                                        "P.Tipo_perfil as 'Tipo_perfil' "+
                                    "FROM [dbo].[Usuarios] U "+
                                    "JOIN [dbo].[Permisos] P "+
                                    "ON P.Cedula = U.Cedula " +
                                    "WHERE U.Cedula = '" + cedula_edit + "';";
                
                ResultSet rs_usuarios = stat.executeQuery(sql_usuarios);
                
                System.out.println(sql_usuarios);

                if (rs_usuarios.next()) {
                    
                    txtCedula.setText( rs_usuarios.getString("Cedula") );
                    txtNombre.setText( rs_usuarios.getString("Nombre") );
                    txtApellidos.setText( rs_usuarios.getString("Apellidos") );
                    txtTelefono.setText( rs_usuarios.getString("Telefono") );
                    txtCorreo.setText( rs_usuarios.getString("Correo") );
                    cbPerfil.setSelectedItem( rs_usuarios.getString("Tipo_perfil") );

                } else {
                    JOptionPane.showMessageDialog(null, "No existe el parqueadero a editar", "Búsqueda vacia", JOptionPane.INFORMATION_MESSAGE);
                }
                
                String sql_asignacion = "SELECT "+
                                        "A.Id_parqueadero 'Id_parqueadero' "+
                                        "FROM [dbo].[Usuarios] U "+
                                        "JOIN [dbo].[Asignacion_parqueadero] A "+
                                        "ON U.Cedula = A.Cedula " +
                                        "WHERE U.Cedula = '" + cedula_edit + "';";
                
                ResultSet rs_asignacion = stat.executeQuery(sql_asignacion);
                
                rs_asignacion.next();
                
                int index = ids.indexOf(rs_asignacion.getInt("Id_parqueadero"));
                
                cbParqueadero.setSelectedIndex(index);
                
                stat.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PanelEditarParqueaderos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PanelEditarParqueaderos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            txtCedula.setText("");
            txtApellidos.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");
            cbPerfil.setSelectedIndex(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btActualizar;
    private java.awt.Button btEliminar;
    private javax.swing.JComboBox<String> cbParqueadero;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
