/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectoparqueadero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author SIMON
 */
public class IngresarCeldas extends javax.swing.JPanel {

    private int idParqueadero;
    private int history;
    private ArrayList<Integer> ids = new ArrayList<>();
    /**
     * Creates new form IngresarCeldas
     */
    public IngresarCeldas() {
        initComponents();
        this.history = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUbicacion = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        cbParqueadero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumCelda = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        btCrearCelda = new java.awt.Button();
        btCancelar = new java.awt.Button();

        setBackground(new java.awt.Color(246, 246, 246));

        txtUbicacion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 116, 155));
        jLabel1.setText("Parqueadero:");

        cbParqueadero.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbParqueadero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 116, 155));
        jLabel4.setText("Ubicacion: ");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 116, 155));
        jLabel5.setText("Número de la celda:");

        txtNumCelda.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCeldaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 24, 80));
        jLabel2.setText("Modulo de Creación de Celdas");

        btCrearCelda.setBackground(new java.awt.Color(51, 102, 255));
        btCrearCelda.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btCrearCelda.setForeground(new java.awt.Color(255, 255, 255));
        btCrearCelda.setLabel("Crear celda");
        btCrearCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearCeldaActionPerformed(evt);
            }
        });

        btCancelar.setActionCommand("Cancelar");
        btCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btCancelar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setLabel("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(156, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCrearCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumCelda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCrearCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setHistory(int history) {
        this.history = history;
    }
    
    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void txtNumCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCeldaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCeldaActionPerformed

    private void btCrearCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearCeldaActionPerformed
        try {
            
            String numeroCelda = txtNumCelda.getText();
            String ubicacionCelda = txtUbicacion.getText();
          

            if ( numeroCelda.equals("") || ubicacionCelda.equals("")) {

                JOptionPane.showMessageDialog(null, "Los campos son vacíos", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");

                // SIN TERMINAR C
                String sql = "INSERT INTO [dbo].[Celdas] (id_parqueadero, Numero_celda, Ubicacion_celda, Disposicion_celda) VALUES (?, ?, ?, ?)";

                PreparedStatement stat = con.prepareStatement(sql);


                stat.setInt(1, idParqueadero);
                stat.setString(2, numeroCelda);
                stat.setString(3, ubicacionCelda);
                stat.setString(4, "Disponible");

                stat.executeUpdate();

                System.out.println( sql );


                Statement statConsulta = con.createStatement();
                String sqlConsulta = "SELECT * FROM [dbo].[Parqueadero] WHERE id_parqueadero="+idParqueadero+";";
                ResultSet rs = statConsulta.executeQuery(sqlConsulta);
                rs.next();
                int Celdas_totales = rs.getInt("Celdas_totales");
                int Celdas_disponibles = rs.getInt("Total_celdas_disponibles");
                String sqlParqueadero = "UPDATE [dbo].[Parqueadero] SET Celdas_totales=?, Total_celdas_disponibles=? WHERE Id_parqueadero = " + idParqueadero + ";";

                PreparedStatement statParqueadero = con.prepareStatement(sqlParqueadero);

                statParqueadero.setInt(1, Celdas_totales+1);
                statParqueadero.setInt(2, Celdas_disponibles+1);


                statParqueadero.executeUpdate();
                stat.close();
                statParqueadero.close();
                statConsulta.close();
                if( history == 0 ) {
                    Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
                    objFrame.changeToConsultPark();
                }
                if( history == 1 ) {
                    Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
                    objFrame.changeToInsertPark();
                }

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IngresarCeldas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IngresarCeldas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCrearCeldaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        if( history == 0 ) {
            Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
            objFrame.changeToConsultPark();
        }
        if( history == 1 ) {
            Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
            objFrame.changeToInsertPark();
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    public void setId( int id ) {
        idParqueadero = id;
    }
    
    @Override
    public void setVisible( boolean value ) {
        super.setVisible(value);
        
        cbParqueadero.removeAllItems();
        
        if ( value ) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                
                Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");
                Statement stat = con.createStatement();

                String sql = "SELECT Id_parqueadero, Nombre_parqueadero FROM [dbo].[Parqueadero];";
                ResultSet rs = stat.executeQuery(sql);

                System.out.println(sql);

                while ( rs.next() ) {
                    int id_parqueadero = rs.getInt("Id_parqueadero");
                    String nombre_parqueadero = rs.getString("Nombre_parqueadero");

                    cbParqueadero.addItem(nombre_parqueadero);

                    ids.add(id_parqueadero);
                }
                int index = ids.indexOf(idParqueadero);
                
                cbParqueadero.setSelectedIndex(index);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PanelRegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PanelRegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            txtNumCelda.setText("");
            txtUbicacion.setText("");
            
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btCancelar;
    private java.awt.Button btCrearCelda;
    private javax.swing.JComboBox<String> cbParqueadero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.TextField txtNumCelda;
    private java.awt.TextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
