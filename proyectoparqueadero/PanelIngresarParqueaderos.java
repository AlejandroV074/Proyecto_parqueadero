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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author SIMON
 */
public class PanelIngresarParqueaderos extends javax.swing.JPanel {

    /**
     * Creates new form PanelIngresarParqueaderos
     */
    
    private int cuenta;
    
    public PanelIngresarParqueaderos() {
        initComponents();
        cuenta = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCrear = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCeldasTotales = new javax.swing.JTextField();
        txtFraccion = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreParq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btCancelar = new java.awt.Button();

        setBackground(new java.awt.Color(246, 246, 246));

        btCrear.setBackground(new java.awt.Color(51, 102, 255));
        btCrear.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btCrear.setForeground(new java.awt.Color(255, 255, 255));
        btCrear.setLabel("Crear parqueadero");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 116, 155));
        jLabel4.setText("Valor hora");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 116, 155));
        jLabel5.setText("Valor dia");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 116, 155));
        jLabel6.setText("Valor mes");

        txtCeldasTotales.setText("0");
        txtCeldasTotales.setEnabled(false);
        txtCeldasTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCeldasTotalesActionPerformed(evt);
            }
        });

        txtFraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFraccionActionPerformed(evt);
            }
        });

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 116, 155));
        jLabel1.setText("Nombre de Parqueadero");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 116, 155));
        jLabel2.setText("Celdas Totales del parqueadero");

        jLabel7.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 24, 80));
        jLabel7.setText("Modulo de Creación de Parqueadero");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 116, 155));
        jLabel3.setText("Valor fraccion");

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
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreParq)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFraccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCeldasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreParq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCeldasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)))
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        
        try {
            
            String nombreParq = txtNombreParq.getText();
            String hora = txtHora.getText();
            String mes = txtMes.getText();
            String fraccion = txtFraccion.getText();
            String dia = txtDia.getText();

            if ( nombreParq.equals("") || hora.equals("") || mes.equals("") || fraccion.equals("") || dia.equals("") ) {

                JOptionPane.showMessageDialog(null, "Los campos son vacíos", "Error", JOptionPane.ERROR_MESSAGE);

            } else {

                if ( cuenta != 0 ) {
                    txtNombreParq.setEnabled(false);
                    txtCeldasTotales.setEnabled(false);
                    txtHora.setEnabled(false);
                    txtMes.setEnabled(false);
                    txtFraccion.setEnabled(false);
                    txtDia.setEnabled(false);
                } else {
                    cuenta++;

                    int valueHora = Integer.parseInt( hora );
                    int valueMes = Integer.parseInt( mes );
                    int valueFraccion = Integer.parseInt( fraccion );
                    int valueDia = Integer.parseInt( dia );

                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");

                    // SIN TERMINAR C
                    String sql = "INSERT INTO [dbo].[Parqueadero] (Nombre_parqueadero, Total_celdas_disponibles, Celdas_totales, Total_celdas_ocupadas, Valor_fraccion, Valor_hora, Valor_dia, Valor_mes) VALUES (?, 0, 0, 0, ?, ?, ?, ?)";

                    PreparedStatement stat = con.prepareStatement(sql);

                    stat.setString(1, nombreParq);
                    stat.setInt(2, valueFraccion);
                    stat.setInt(3, valueHora);
                    stat.setInt(4, valueDia);
                    stat.setInt(5, valueMes);

                    stat.executeUpdate();
                    
                    System.out.println( sql );
                    
                    Logger.getLogger(PanelIngresarParqueaderos.class.getName()).log(Level.SEVERE, null, stat);
                    
                    stat.close();
                    
                }

                int input = JOptionPane.showConfirmDialog(null, "¿Desea agregar una celda antes de al parqueadero?", "Confirmar creación de celda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if ( input == 0 ) {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection con = DriverManager.getConnection("jdbc:sqlserver://systemengine-database.database.windows.net:1433;database=SystemEngine-database;user=systemengine-server@systemengine-database;password={63Z6OOi*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","systemengine-server","63Z6OOi*");
                    Statement stat = con.createStatement();

                    String sql = "SELECT * FROM [dbo].[Parqueadero] WHERE Nombre_parqueadero='"+nombreParq +"';";

                    ResultSet rs = stat.executeQuery(sql);
                    
                    rs.next();
                    
                    Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
                    objFrame.changeToInsertCell( rs.getInt("Id_parqueadero") );
                } else {
                    Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
                    objFrame.changeToConsultPark();

                    txtNombreParq.setText("");
                    txtCeldasTotales.setText("0");
                    txtHora.setText("");
                    txtMes.setText("");
                    txtFraccion.setText("");
                    txtDia.setText("");

                    txtNombreParq.setEnabled(true);
                    txtCeldasTotales.setEnabled(false);
                    txtHora.setEnabled(true);
                    txtMes.setEnabled(true);
                    txtFraccion.setEnabled(true);
                    txtDia.setEnabled(true);

                    cuenta = 0; 
                }

            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelIngresarParqueaderos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PanelIngresarParqueaderos.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los campos de Valor deben ser numéricos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btCrearActionPerformed

    private void txtCeldasTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCeldasTotalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCeldasTotalesActionPerformed

    private void txtFraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFraccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFraccionActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        Principal_Admin objFrame = (Principal_Admin) SwingUtilities.getAncestorOfClass(Principal_Admin.class, this);
        objFrame.changeToConsultPark();
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btCancelar;
    private java.awt.Button btCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCeldasTotales;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtFraccion;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombreParq;
    // End of variables declaration//GEN-END:variables
}