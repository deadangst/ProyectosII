/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Excepciones.UsuariosExcepciones;
import Entidades.*;
import Negocio.UsuarioNegocio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario
 */
public class JFrameUsarios extends javax.swing.JFrame {

    private final UsuarioNegocio usuarioNegocio;

    /**
     * Creates new form JFrameUusarios
     */
    public JFrameUsarios() {
        initComponents();
        usuarioNegocio = new UsuarioNegocio();
        TableModel tableModel = this.completarTableModel();
        jTable1.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private TableModel completarTableModel() {
        try {
            List<Usuarios> listaUsuarios = usuarioNegocio.consultarTodosLosUusarios();
            Object[] columnas = new Object[]{"Nombre", "Apellido", "ID", "Teléfono", "Tipo de Usario", "Email", "Usuario", "Password", "País", "Ciudad", "Provincia", "Calle"};
            Object[][] datos = new Object[listaUsuarios.size()][columnas.length];
            for (int i = 0; i < listaUsuarios.size(); i++) {
                datos[i][0] = listaUsuarios.get(i).getNombre();
                datos[i][1] = listaUsuarios.get(i).getApellido();
                datos[i][2] = listaUsuarios.get(i).getIdentificacion();
                datos[i][3] = listaUsuarios.get(i).getNumeroTelefonico();
                datos[i][4] = listaUsuarios.get(i).getTipoUsuario();
                datos[i][5] = listaUsuarios.get(i).getCorreoElectronico();
                datos[i][6] = listaUsuarios.get(i).getUsuario();
                datos[i][7] = listaUsuarios.get(i).getPassword();
                datos[i][8] = listaUsuarios.get(i).getPais();
                datos[i][9] = listaUsuarios.get(i).getCiudad();
                datos[i][10] = listaUsuarios.get(i).getProvincia();
                datos[i][11] = listaUsuarios.get(i).getCalle();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;
        } catch (Exception ex) {
            Logger.getLogger(JFrameUsarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Nomre = new javax.swing.JLabel();
        jLabel1Apellido = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Apellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Calle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_TipoUsuario = new javax.swing.JComboBox<>();
        jLabel6Email = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Telefono = new javax.swing.JTextField();
        jButton_Ingresar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel8Usuario = new javax.swing.JLabel();
        jTextField_Usuario = new javax.swing.JTextField();
        jLabel8Password = new javax.swing.JLabel();
        jTextField_Pais = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Ciudad = new javax.swing.JTextField();
        jTextField_Provincia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Nomre.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1Nomre.setText("Nombre");
        getContentPane().add(jLabel1Nomre, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 417, -1, -1));

        jLabel1Apellido.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1Apellido.setText("Apellido");
        getContentPane().add(jLabel1Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 417, -1, -1));

        jTextField_Nombre.setBackground(new java.awt.Color(0, 153, 153));
        jTextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 411, 140, -1));

        jTextField_Apellido.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jTextField_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 411, 140, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Agregue la dirección del Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 630, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Pais");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 690, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Ciudad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 696, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Calle");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 762, -1, -1));

        jTextField_Calle.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jTextField_Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 756, 249, -1));

        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Tipo de usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 463, -1, -1));

        jComboBox_TipoUsuario.setBackground(new java.awt.Color(0, 51, 51));
        jComboBox_TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Vendedor", "Cliente" }));
        getContentPane().add(jComboBox_TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 458, -1, -1));

        jLabel6Email.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6Email.setText("Email");
        getContentPane().add(jLabel6Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 463, -1, -1));

        jTextField_Email.setBackground(new java.awt.Color(0, 153, 153));
        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 457, 140, -1));

        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Teléfono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 463, -1, -1));

        jTextField_Telefono.setBackground(new java.awt.Color(0, 153, 153));
        jTextField_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 457, 140, -1));

        jButton_Ingresar.setBackground(new java.awt.Color(0, 51, 51));
        jButton_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Ingresar.setText("Ingresar");
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 419, -1, -1));

        jButton_Eliminar.setBackground(new java.awt.Color(0, 51, 51));
        jButton_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 457, -1, -1));

        jButton_Limpiar.setBackground(new java.awt.Color(0, 51, 51));
        jButton_Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Limpiar.setText("Limpiar");
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 624, -1, -1));

        jButton_Actualizar.setBackground(new java.awt.Color(0, 51, 51));
        jButton_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Actualizar.setText("Actualizar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 503, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("ID/Cédula");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 417, -1, -1));

        jTextField_ID.setBackground(new java.awt.Color(0, 153, 153));
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 411, 140, -1));

        jLabel8Usuario.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8Usuario.setText("Usuario");
        getContentPane().add(jLabel8Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 551, -1, -1));

        jTextField_Usuario.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jTextField_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 545, 136, -1));

        jLabel8Password.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8Password.setText("Password");
        getContentPane().add(jLabel8Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 551, -1, -1));

        jTextField_Pais.setBackground(new java.awt.Color(0, 153, 153));
        jTextField_Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PaisActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 690, 140, -1));

        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Provincia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 696, -1, -1));

        jTextField_Ciudad.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jTextField_Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 690, 140, -1));

        jTextField_Provincia.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jTextField_Provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 690, 140, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102, 90));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Usuarios"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "ID", "numero telefonico", "Tipo de usuario", "Email", "Usuario", "Password", "Pais", "Ciudad", "Provincia", "Calle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setResizable(false);
            jTable1.getColumnModel().getColumn(11).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Asigne un Usuario y Contraseña:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 509, -1, -1));

        jPasswordField_Password.setBackground(new java.awt.Color(0, 153, 153));
        jPasswordField_Password.setText("jPasswordField1");
        getContentPane().add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 545, 140, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1600px BG.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1230, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreActionPerformed

    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        if (ValidarFormulario()) {
            Usuarios usuarios = CapturaUsuarios();
            try {
                String insertar = usuarioNegocio.insertar(usuarios);
                if (insertar.equals("Error")) {
                    throw new UsuariosExcepciones("Ocurrio un Error al ingresar el usuario");
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario ha sido creado Satisfactoriamente como: " + insertar, null, 1);
                    RefrescarTabla();
                    LimpiarCampos();
                }
            } catch (UsuariosExcepciones ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            }

        }
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int seleccionada = jTable1.rowAtPoint(evt.getPoint());

        jTextField_ID.setText(String.valueOf(jTable1.getValueAt(seleccionada, 2)));
        jTextField_Nombre.setText(String.valueOf(jTable1.getValueAt(seleccionada, 0)));
        jTextField_Apellido.setText(String.valueOf(jTable1.getValueAt(seleccionada, 1)));
        jTextField_Telefono.setText(String.valueOf(jTable1.getValueAt(seleccionada, 3)));
        jComboBox_TipoUsuario.setSelectedItem(jTable1.getValueAt(seleccionada, 4));
        jTextField_Email.setText(String.valueOf(jTable1.getValueAt(seleccionada, 5)));
        jTextField_Usuario.setText(String.valueOf(jTable1.getValueAt(seleccionada, 6)));
        jPasswordField_Password.setText(String.valueOf(jTable1.getValueAt(seleccionada, 7)));
        jTextField_Pais.setText(String.valueOf(jTable1.getValueAt(seleccionada, 8)));
        jTextField_Ciudad.setText(String.valueOf(jTable1.getValueAt(seleccionada, 9)));
        jTextField_Provincia.setText(String.valueOf(jTable1.getValueAt(seleccionada, 10)));
        jTextField_Calle.setText(String.valueOf(jTable1.getValueAt(seleccionada, 11)));

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        if (ValidarFormulario()) {
            Usuarios usuarios = CapturaUsuarios();
            try {
                String actualizar = usuarioNegocio.actualizar(usuarios);
                if (actualizar.equals("Error")) {
                    throw new UsuariosExcepciones("Ocurrio un Error al actualizar al usuario");
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario ha sido actualizado satisfactoriamente: " + actualizar, null, 1);
                    RefrescarTabla();
                    LimpiarCampos();
                }

            } catch (UsuariosExcepciones ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            }
        }
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        if (ValidarFormulario()) {
            Usuarios usuarios = CapturaUsuarios();
            try {
                String eliminar = usuarioNegocio.eliminar(usuarios);
                if (eliminar.equals("Error")) {
                    throw new UsuariosExcepciones("Ocurrio un Error al actualizar al usuario");
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario fue eliminado satisfactoriamente: " + eliminar, null, 1);
                    RefrescarTabla();
                    LimpiarCampos();
                }
            } catch (UsuariosExcepciones ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            }
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jTextField_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TelefonoActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PaisActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFramePrincipalAdmin jfPrincipalAdmin = new JFramePrincipalAdmin();
        jfPrincipalAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(JFrameUsarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUsarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUsarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUsarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUsarios().setVisible(true);
            }
        });
    }

    private boolean ValidarFormulario() {
        boolean bandera = true;

        if (jTextField_Nombre.getText().length() < 3) {
            JOptionPane.showMessageDialog(this, "El nombre debe tener al menos 3 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Nombre.getText().length() > 30) {
            JOptionPane.showMessageDialog(this, "El nombre debe tener menos de 30 caracteres", null, 2);
            bandera = false;
        }
        if (jLabel1Nomre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacio", null, 2);
            bandera = false;
        }
        if (jTextField_Apellido.getText().length() < 2) {
            JOptionPane.showMessageDialog(this, "El apellido debe tener al menos 2 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Apellido.getText().length() > 30) {
            JOptionPane.showMessageDialog(this, "El apellido debe tener menos 30 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Apellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El apellido no puede estar vacio", null, 2);
            bandera = false;
        }
        if (jTextField_Email.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "El Email debe ser mayor a 10 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Email.getText().length() > 30) {
            JOptionPane.showMessageDialog(this, "El Email debe ser menor a 30 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una direccion de correo", null, 2);
            bandera = false;
        }
        if (jTextField_Calle.getText().length() < 2) {
            JOptionPane.showMessageDialog(this, "La calle debe ser mayor a 2 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Calle.getText().length() > 30) {
            JOptionPane.showMessageDialog(this, "La calle debe ser menor a 30 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Pais.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el pais", null, 2);
            bandera = false;
        }
        if (jTextField_Ciudad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la ciudad", null, 2);
            bandera = false;
        }
        if (jTextField_Provincia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la provincia", null, 2);
            bandera = false;
        }
        if (jPasswordField_Password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El Password no puede estar vacío", null, 2);
            bandera = false;
        }
        if (jPasswordField_Password.getText().length() < 6) {
            JOptionPane.showMessageDialog(this, "El Password tiene que ser mayor a 6 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El Usuario no puede estar vacío", null, 2);
            bandera = false;
        }
        if (jTextField_Usuario.getText().length() < 3) {
            JOptionPane.showMessageDialog(this, "El Usuario tiene que ser mayor a 3 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Usuario.getText().length() > 10) {
            JOptionPane.showMessageDialog(this, "El Usuario tiene que ser menor a 10 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_Telefono.getText().length() < 8) {
            JOptionPane.showMessageDialog(this, "El Telefono tiene contener 8 dígitos ", null, 2);
            bandera = false;
        }
        if (jTextField_Telefono.getText().length() > 8) {
            JOptionPane.showMessageDialog(this, "El Telefono tiene contener 8 dígitos ", null, 2);
            bandera = false;
        }

        return bandera;
    }

    private Usuarios CapturaUsuarios() {
        Usuarios usuarios = new Usuarios();
        usuarios.setIdentificacion(jTextField_ID.getText());
        usuarios.setNombre(jTextField_Nombre.getText());
        usuarios.setApellido(jTextField_Apellido.getText());
        usuarios.setCorreoElectronico(jTextField_Email.getText());
        usuarios.setNumeroTelefonico(Integer.parseInt(jTextField_Telefono.getText()));
        usuarios.setCalle(jTextField_Calle.getText());
        usuarios.setCiudad(jTextField_Ciudad.getText());
        usuarios.setProvincia(jTextField_Provincia.getText());
        usuarios.setPassword(jPasswordField_Password.getText());
        usuarios.setUsuario(jTextField_Usuario.getText());
        usuarios.setTipoUsuario(jComboBox_TipoUsuario.getSelectedItem().toString());
        usuarios.setPais(jTextField_Pais.getText());

        return usuarios;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JComboBox<String> jComboBox_TipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel1Apellido;
    private javax.swing.JLabel jLabel1Nomre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6Email;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8Password;
    private javax.swing.JLabel jLabel8Usuario;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Calle;
    private javax.swing.JTextField jTextField_Ciudad;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Pais;
    private javax.swing.JTextField jTextField_Provincia;
    private javax.swing.JTextField jTextField_Telefono;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
  private void RefrescarTabla() {
        TableModel tableModel = this.completarTableModel();
        jTable1.setModel(tableModel);
    }

    private void LimpiarCampos() {
        jTextField_Nombre.setText("");
        jTextField_Email.setText("");
        jTextField_Telefono.setText("");
        jTextField_Calle.setText("");
        jTextField_Apellido.setText("");
        jTextField_Ciudad.setText("");
        jTextField_Provincia.setText("");
        jPasswordField_Password.setText("");
        jTextField_Usuario.setText("");
        jTextField_ID.setText("");
        jTextField_Pais.setText("");

    }
}
