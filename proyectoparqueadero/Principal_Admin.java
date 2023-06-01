/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;



/**
 *
 * @author Principal
 */
public class Principal_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    private String cedula_admin;
   
    private PanelListarUsuarios panelListarUsuarios;
    private PanelEditarParqueaderos panelEditarParqueaderos;
    private PanelConsultarParqueaderos panelConsultarParqueaderos;
    private PanelIngresarParqueaderos panelIngresarParqueaderos;
    private Ad_PanelListarVehiculos panelListarVehiculos;
    private Ad_PanelConsultarCeldas panelConsultarCeldas;
    private Ad_PanelActualizacionDatos panelEditarUsuarios;
    private Op_PanelActualizacionDatos panelActualizarDatos;
    private PanelRegistroUsuarios panelRegistroUsuarios;
    private EditarCeldas panelEditarCelda;
    private IngresarCeldas panelIngresarCelda;
    
    public Principal_Admin(String cedula) {
        cedula_admin = cedula;
        
        initComponents();
        setSize(990,495);
        panelRegistroUsuarios = new PanelRegistroUsuarios();
        panelRegistroUsuarios.setBounds(318,0,672,455);
        panelRegistroUsuarios.setVisible(false);
        add(panelRegistroUsuarios);
        panelListarUsuarios = new PanelListarUsuarios();
        panelListarUsuarios.setBounds(318,0,672,455);
        panelListarUsuarios.setVisible(false);
        add(panelListarUsuarios);
        panelConsultarCeldas = new Ad_PanelConsultarCeldas();
        panelConsultarCeldas.setBounds(318,0,672,455);
        panelConsultarCeldas.setVisible(false);
        add(panelConsultarCeldas);
        panelActualizarDatos = new Op_PanelActualizacionDatos();
        panelActualizarDatos.setBounds(318,0,672,455);
        panelActualizarDatos.setVisible(false);
        add(panelActualizarDatos);
        panelEditarUsuarios = new Ad_PanelActualizacionDatos();
        panelEditarUsuarios.setBounds(318,0,672,455);
        panelEditarUsuarios.setVisible(false);
        add(panelEditarUsuarios);
        panelEditarParqueaderos = new PanelEditarParqueaderos();
        panelEditarParqueaderos.setBounds(318,0,672,455);
        panelEditarParqueaderos.setVisible(false);
        add(panelEditarParqueaderos);
        panelConsultarParqueaderos = new PanelConsultarParqueaderos();
        panelConsultarParqueaderos.setBounds(318,0,672,455);
        panelConsultarParqueaderos.setVisible(false);
        add(panelConsultarParqueaderos);
        panelIngresarParqueaderos = new PanelIngresarParqueaderos();
        panelIngresarParqueaderos.setBounds(318,0,672,455);
        panelIngresarParqueaderos.setVisible(false);
        add(panelIngresarParqueaderos);
        panelEditarCelda = new EditarCeldas();
        panelEditarCelda.setBounds(318,0,672,455);
        panelEditarCelda.setVisible(false);
        add(panelEditarCelda);
        panelIngresarCelda = new IngresarCeldas();
        panelIngresarCelda.setBounds(318,0,672,455);
        panelIngresarCelda.setVisible(false);
        add(panelIngresarCelda);
        panelListarVehiculos = new Ad_PanelListarVehiculos();
        panelListarVehiculos.setBounds(318,0,672,455);
        panelListarVehiculos.setVisible(true);
        add(panelListarVehiculos);
    }
    
    public Principal_Admin() {
        initComponents();
        setSize(990,495);
        panelRegistroUsuarios = new PanelRegistroUsuarios();
        panelRegistroUsuarios.setBounds(318,0,672,455);
        panelRegistroUsuarios.setVisible(false);
        add(panelRegistroUsuarios);
        panelListarUsuarios = new PanelListarUsuarios();
        panelListarUsuarios.setBounds(318,0,672,455);
        panelListarUsuarios.setVisible(false);
        add(panelListarUsuarios);
        panelConsultarCeldas = new Ad_PanelConsultarCeldas();
        panelConsultarCeldas.setBounds(318,0,672,455);
        panelConsultarCeldas.setVisible(false);
        add(panelConsultarCeldas);
        panelActualizarDatos = new Op_PanelActualizacionDatos();
        panelActualizarDatos.setBounds(318,0,672,455);
        panelActualizarDatos.setVisible(false);
        add(panelActualizarDatos);
        panelEditarUsuarios = new Ad_PanelActualizacionDatos();
        panelEditarUsuarios.setBounds(318,0,672,455);
        panelEditarUsuarios.setVisible(false);
        add(panelEditarUsuarios);
        panelEditarParqueaderos = new PanelEditarParqueaderos();
        panelEditarParqueaderos.setBounds(318,0,672,455);
        panelEditarParqueaderos.setVisible(false);
        add(panelEditarParqueaderos);
        panelConsultarParqueaderos = new PanelConsultarParqueaderos();
        panelConsultarParqueaderos.setBounds(318,0,672,455);
        panelConsultarParqueaderos.setVisible(false);
        add(panelConsultarParqueaderos);
        panelIngresarParqueaderos = new PanelIngresarParqueaderos();
        panelIngresarParqueaderos.setBounds(318,0,672,455);
        panelIngresarParqueaderos.setVisible(false);
        add(panelIngresarParqueaderos);
        panelEditarCelda = new EditarCeldas();
        panelEditarCelda.setBounds(318,0,672,455);
        panelEditarCelda.setVisible(false);
        add(panelEditarCelda);
        panelIngresarCelda = new IngresarCeldas();
        panelIngresarCelda.setBounds(318,0,672,455);
        panelIngresarCelda.setVisible(false);
        add(panelIngresarCelda);
        panelListarVehiculos = new Ad_PanelListarVehiculos();
        panelListarVehiculos.setBounds(318,0,672,455);
        panelListarVehiculos.setVisible(true);
        add(panelListarVehiculos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btConsParqueaderos = new java.awt.Button();
        btConsCelda = new java.awt.Button();
        btSalir = new java.awt.Button();
        btActDatos = new java.awt.Button();
        btConsUsuarios = new java.awt.Button();
        btConsVehiculos = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setFocusCycleRoot(false);

        PanelMenu.setBackground(new java.awt.Color(63, 63, 63));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoparqueadero/logo-parqueadero.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("System Engine");

        btConsParqueaderos.setBackground(new java.awt.Color(58, 124, 165));
        btConsParqueaderos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btConsParqueaderos.setForeground(new java.awt.Color(255, 255, 255));
        btConsParqueaderos.setLabel("Parqueaderos");
        btConsParqueaderos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsParqueaderosActionPerformed(evt);
            }
        });

        btConsCelda.setBackground(new java.awt.Color(58, 124, 165));
        btConsCelda.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btConsCelda.setForeground(new java.awt.Color(255, 255, 255));
        btConsCelda.setLabel("Celdas");
        btConsCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsCeldaActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(255, 0, 0));
        btSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setLabel("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btActDatos.setBackground(new java.awt.Color(58, 124, 165));
        btActDatos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btActDatos.setForeground(new java.awt.Color(255, 255, 255));
        btActDatos.setLabel("Actualizar datos");
        btActDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActDatosActionPerformed(evt);
            }
        });

        btConsUsuarios.setBackground(new java.awt.Color(58, 124, 165));
        btConsUsuarios.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btConsUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btConsUsuarios.setLabel(" Usuarios");
        btConsUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsUsuariosActionPerformed(evt);
            }
        });

        btConsVehiculos.setBackground(new java.awt.Color(58, 124, 165));
        btConsVehiculos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btConsVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        btConsVehiculos.setLabel("Vehículos");
        btConsVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btActDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btConsUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsParqueaderos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btConsParqueaderos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btActDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(694, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsUsuariosActionPerformed
        // TODO add your handling code here:
        setSize(990,495);
        panelListarVehiculos.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelActualizarDatos.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelListarUsuarios.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btConsUsuariosActionPerformed

    private void btConsParqueaderosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsParqueaderosActionPerformed
        // TODO add your handling code here:
        setSize(990,495);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelActualizarDatos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelConsultarParqueaderos.setVisible(true);
        revalidate();
        repaint();
        
        
    }//GEN-LAST:event_btConsParqueaderosActionPerformed

    private void btConsVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsVehiculosActionPerformed
        // TODO add your handling code here:
        setSize(990,495);
        panelConsultarCeldas.setVisible(false);
        panelActualizarDatos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelListarVehiculos.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btConsVehiculosActionPerformed

    private void btConsCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsCeldaActionPerformed
        // TODO add your handling code here:
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelConsultarCeldas.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btConsCeldaActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btActDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActDatosActionPerformed
        // TODO add your handling code here:
        panelActualizarDatos.setCedulaEdit(cedula_admin);
        
        setSize(990,495);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelActualizarDatos.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btActDatosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Admin().setVisible(true);
            }
        });
    }
    
    public void changeToInsertUsers() {
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelRegistroUsuarios.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void changeToConsultUsers() {
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelListarUsuarios.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void changeToEditUsers(String cedula) {
        panelEditarUsuarios.setCedulaEdit(cedula);
        
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelEditarUsuarios.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void changeToEditCells(int id) {
        panelEditarCelda.setId(id);
        
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelEditarCelda.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void changeToConsultCells() {
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelConsultarCeldas.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void changeToInsertCell(int id) {
        panelIngresarCelda.setId(id);
        
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelIngresarCelda.setVisible(true);
        revalidate();
        repaint();
    }

    public void changeToEditPark(int id) {
        panelIngresarCelda.setHistory(0);
        panelEditarParqueaderos.setId(id);
        
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelEditarParqueaderos.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void changeToInsertPark() {
        panelIngresarCelda.setHistory(1);
        
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelConsultarParqueaderos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelIngresarParqueaderos.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void changeToConsultPark() {
        setSize(990,495);
        panelActualizarDatos.setVisible(false);
        panelListarVehiculos.setVisible(false);
        panelRegistroUsuarios.setVisible(false);
        panelEditarCelda.setVisible(false);
        panelIngresarParqueaderos.setVisible(false);
        panelListarUsuarios.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelIngresarCelda.setVisible(false);
        panelEditarParqueaderos.setVisible(false);
        panelEditarUsuarios.setVisible(false);
        panelConsultarParqueaderos.setVisible(true);
        revalidate();
        repaint();
    }
    
    public void setCedula( String cedula ) {
        cedula_admin = cedula;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private java.awt.Button btActDatos;
    private java.awt.Button btConsCelda;
    private java.awt.Button btConsParqueaderos;
    private java.awt.Button btConsUsuarios;
    private java.awt.Button btConsVehiculos;
    private java.awt.Button btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
