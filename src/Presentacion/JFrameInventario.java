/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Excepciones.InventarioExcepcion;
import Entidades.Inventario;
import Negocio.InventarioNegocio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author deada
 */
public class JFrameInventario extends javax.swing.JFrame {

    /**
     * Creates new form JFrameInventario
     */
    private final InventarioNegocio inventarioNegocio;

    public JFrameInventario() {
        initComponents();
        inventarioNegocio = new InventarioNegocio();
        TableModel tableModel = this.completarInventarioModel();
        jTable_Inventario.setModel(tableModel);
    }

    private TableModel completarInventarioModel() {
        try {
            List<Inventario> listaProducto = inventarioNegocio.consultarTodosLosProductos();
            Object[] columnas = new Object[]{"Código", "Nombre", "Precio", "Cantidad Disponible", "Categoría"};
            Object[][] datos = new Object[listaProducto.size()][columnas.length];
            for (int i = 0; i < listaProducto.size(); i++) {
                datos[i][0] = listaProducto.get(i).getCodigo();
                datos[i][1] = listaProducto.get(i).getNombre();
                datos[i][2] = listaProducto.get(i).getPrecio();
                datos[i][3] = listaProducto.get(i).getCantidad();
                datos[i][4] = listaProducto.get(i).getCategoria();
            }
            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;
        } catch (Exception ex) {
            Logger.getLogger(JFrameInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Inventario = new javax.swing.JTable();
        jLabel_NombreProd = new javax.swing.JLabel();
        jTextField_NombreProd = new javax.swing.JTextField();
        jLabel_Precio = new javax.swing.JLabel();
        jLabel_Cantidad = new javax.swing.JLabel();
        jLabel_Cat = new javax.swing.JLabel();
        jTextField_Precio = new javax.swing.JTextField();
        jTextField_Cantidad = new javax.swing.JTextField();
        jComboBox_Cat = new javax.swing.JComboBox<>();
        jButton_AgregarProd = new javax.swing.JButton();
        jButton_ActualizarProd = new javax.swing.JButton();
        jButton_EliminarProd = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();
        jLabel_Codigo = new javax.swing.JLabel();
        jLabel_CodigoValor = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Precio", "Cantidad Disponible", "Categoría"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Inventario.setColumnSelectionAllowed(true);
        jTable_Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_InventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Inventario);
        jTable_Inventario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable_Inventario.getColumnModel().getColumnCount() > 0) {
            jTable_Inventario.getColumnModel().getColumn(0).setResizable(false);
            jTable_Inventario.getColumnModel().getColumn(1).setResizable(false);
            jTable_Inventario.getColumnModel().getColumn(2).setResizable(false);
            jTable_Inventario.getColumnModel().getColumn(3).setResizable(false);
            jTable_Inventario.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 1200, 240));

        jLabel_NombreProd.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel_NombreProd.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_NombreProd.setText("Nombre Producto");
        getContentPane().add(jLabel_NombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 306, -1, -1));

        jTextField_NombreProd.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_NombreProd.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_NombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreProdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_NombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 240, -1));

        jLabel_Precio.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel_Precio.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_Precio.setText("Precio");
        getContentPane().add(jLabel_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 338, -1, -1));

        jLabel_Cantidad.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel_Cantidad.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_Cantidad.setText("Cantidad");
        getContentPane().add(jLabel_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 366, -1, -1));

        jLabel_Cat.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel_Cat.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_Cat.setText("Categoría");
        getContentPane().add(jLabel_Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 394, -1, -1));

        jTextField_Precio.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Precio.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 240, -1));

        jTextField_Cantidad.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Cantidad.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 240, -1));

        jComboBox_Cat.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Cat.setForeground(new java.awt.Color(0, 51, 51));
        jComboBox_Cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GPU", "Headset", "Laptop", "Monitor", "Mouse", "Parlantes", "Silla Gamer", "Teclado" }));
        jComboBox_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_CatActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 240, -1));

        jButton_AgregarProd.setBackground(new java.awt.Color(0, 102, 102));
        jButton_AgregarProd.setText("Agregar Producto");
        jButton_AgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarProdActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        jButton_ActualizarProd.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ActualizarProd.setText("Actualizar Producto");
        jButton_ActualizarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarProdActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ActualizarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, -1, -1));

        jButton_EliminarProd.setBackground(new java.awt.Color(0, 102, 102));
        jButton_EliminarProd.setText("Eliminar Producto");
        jButton_EliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarProdActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_EliminarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        jButton_Limpiar.setBackground(new java.awt.Color(0, 102, 102));
        jButton_Limpiar.setText("Limpiar");
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, -1, -1));

        jLabel_Codigo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel_Codigo.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_Codigo.setText("Código");
        getContentPane().add(jLabel_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel_CodigoValor.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_CodigoValor.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel_CodigoValor.setForeground(new java.awt.Color(51, 51, 0));
        jLabel_CodigoValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel_CodigoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 240, 30));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1230px BG.png"))); // NOI18N
        jLabel_Fondo.setText("jLabel1");
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 720));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreProdActionPerformed

    private void jButton_AgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarProdActionPerformed
        if (ValidarFormularioInventario()) {
            Inventario producto = CapturaProducto();
            try {
                String insertar = inventarioNegocio.insertar(producto);
                if (insertar.equals("Error")) {
                    throw new InventarioExcepcion("Ocurrio un Error al ingresar el producto");
                } else {
                    JOptionPane.showMessageDialog(this, "Producto ingresado correctamente, código #" + insertar, null, 1);
                    RefrescarTabla();
                    LimpiarCampos();
                }

            } catch (InventarioExcepcion ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            }
        }
    }//GEN-LAST:event_jButton_AgregarProdActionPerformed

    private void jComboBox_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_CatActionPerformed

    }//GEN-LAST:event_jComboBox_CatActionPerformed

    private void jTable_InventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_InventarioMouseClicked
        int seleccionada = jTable_Inventario.rowAtPoint(evt.getPoint());
        jLabel_CodigoValor.setText(String.valueOf(jTable_Inventario.getValueAt(seleccionada, 0)));
        jTextField_NombreProd.setText(String.valueOf(jTable_Inventario.getValueAt(seleccionada, 1)));
        jTextField_Precio.setText(String.valueOf(jTable_Inventario.getValueAt(seleccionada, 2)));
        jTextField_Cantidad.setText(String.valueOf(jTable_Inventario.getValueAt(seleccionada, 3)));
        jComboBox_Cat.setSelectedItem(String.valueOf(jTable_Inventario.getValueAt(seleccionada, 4)));

    }//GEN-LAST:event_jTable_InventarioMouseClicked

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    private void jButton_ActualizarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarProdActionPerformed
        if (ValidarFormularioInventario()) {
            Inventario producto = CapturaProducto();
            try {
                String actualizar = inventarioNegocio.actualizar(producto);
                if (actualizar.equals("Error")) {
                    throw new InventarioExcepcion("Ocurrio un Error al ingresar el producto");
                } else {
                    JOptionPane.showMessageDialog(this, "Producto Actualizado correctamente, código #" + actualizar, null, 1);
                    RefrescarTabla();
                    LimpiarCampos();
                }

            } catch (InventarioExcepcion ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            }
        }
    }//GEN-LAST:event_jButton_ActualizarProdActionPerformed

    private void jButton_EliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarProdActionPerformed
        if (ValidarFormularioInventario()) {
            Inventario producto = CapturaProducto();
            try {
                String eliminar = inventarioNegocio.eliminar(producto);
                if (eliminar.equals("Error")) {
                    throw new InventarioExcepcion("Ocurrio un Error al ingresar el producto");
                } else {
                    JOptionPane.showMessageDialog(this, "Producto Actualizado correctamente, código #" + eliminar, null, 1);
                    RefrescarTabla();
                    LimpiarCampos();
                }

            } catch (InventarioExcepcion ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), null, 2);
            }
        }
    }//GEN-LAST:event_jButton_EliminarProdActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFramePrincipalAdmin jfPrincipalAdmin = new JFramePrincipalAdmin();
        jfPrincipalAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void llenarCombo() {
        String filePath = "C:\\archivos\\categoria.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString();
                jComboBox_Cat.addItem(line);
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Error, file " + filePath + " didn't exist.");
        }

    }

    private boolean ValidarFormularioInventario() {
        boolean bandera = true;
        if (jTextField_NombreProd.getText().length() < 6) {
            JOptionPane.showMessageDialog(this, "El nombre del producto debe tener al menos de 6 caracteres", null, 2);
            bandera = false;
        }
        if (jTextField_NombreProd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre del producto no puede estar vacío", null, 2);
            bandera = false;
        }
        if (jTextField_NombreProd.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "El nombre del producto debe tener menos de 50 caracteres", null, 2);
            bandera = false;
        }

        if (Integer.parseInt(jTextField_Cantidad.getText()) > 10) {
            JOptionPane.showMessageDialog(this, "Solo de permiten 10 existencias de un mismo producto", null, 2);
            bandera = false;
        }
        if (jTextField_Cantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La Cantidad no puede estar vacía", null, 2);
            bandera = false;
        }
        if (Integer.parseInt(jTextField_Cantidad.getText()) < 1) {
            JOptionPane.showMessageDialog(this, "Ingrese al menos 1 existencia", null, 2);
            bandera = false;
        }
        if (Double.parseDouble(jTextField_Precio.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "El precio tiene que ser mayor a 0", null, 2);
            bandera = false;
        }
                if (jTextField_Precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El Precio no puede estar vacío", null, 2);
            bandera = false;
        }

        return bandera;
    }

    private Inventario CapturaProducto() {
        Inventario producto = new Inventario();
        String valor = (String) jComboBox_Cat.getSelectedItem();

        producto.setCodigo(jLabel_CodigoValor.getText());
        producto.setNombre(jTextField_NombreProd.getText());
        producto.setPrecio(Double.parseDouble(jTextField_Precio.getText()));
        producto.setCantidad(Integer.parseInt(jTextField_Cantidad.getText()));
        producto.setCategoria(valor);
        return producto;
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
            java.util.logging.Logger.getLogger(JFrameInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ActualizarProd;
    private javax.swing.JButton jButton_AgregarProd;
    private javax.swing.JButton jButton_EliminarProd;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_Cat;
    private javax.swing.JLabel jLabel_Cantidad;
    private javax.swing.JLabel jLabel_Cat;
    private javax.swing.JLabel jLabel_Codigo;
    private javax.swing.JLabel jLabel_CodigoValor;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_NombreProd;
    private javax.swing.JLabel jLabel_Precio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Inventario;
    private javax.swing.JTextField jTextField_Cantidad;
    private javax.swing.JTextField jTextField_NombreProd;
    private javax.swing.JTextField jTextField_Precio;
    // End of variables declaration//GEN-END:variables

    private void RefrescarTabla() {
        TableModel tableModel = this.completarInventarioModel();
        jTable_Inventario.setModel(tableModel);
    }

    private void LimpiarCampos() {
        jTextField_NombreProd.setText("");
        jTextField_Cantidad.setText("");
        jTextField_Precio.setText("");
        jLabel_CodigoValor.setText("");
        jComboBox_Cat.setSelectedItem("");
    }

}
