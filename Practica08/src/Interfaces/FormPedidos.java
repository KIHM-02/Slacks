package Interfaces;

import practica08.Pedido_Nodo;
import practica08.Pedido_Pila;

public class FormPedidos extends javax.swing.JFrame 
{
    private FormMenu menu;
    private Pedido_Pila pedido;
    private String rol;
    public int ID;
            
    public FormPedidos(FormMenu menu, Pedido_Pila pedido, String rol) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.menu = menu;
        this.rol = rol;
        this.pedido = pedido;
        ID = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMostrar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLibros = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAgregarPedido = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnImprimir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMostrar.setText("Mostrar Pedidos");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        lblUsuario.setText("usuario");

        btnRegresar.setText("Menu");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txaLibros.setColumns(20);
        txaLibros.setRows(5);
        jScrollPane1.setViewportView(txaLibros);

        btnAgregar.setText("Agregar Pedido");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        btnAgregarPedido.setText("Agregar");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });
        jMenu1.add(btnAgregarPedido);
        jMenu1.add(jSeparator1);

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(btnImprimir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnMostrar)
                    .addComponent(btnRegresar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Pedido_Nodo walker;

        if(pedido.isEmpty())
        {
            txaLibros.setText("No hay pedidos registrados");
            return;
        }
        else
        {
            txaLibros.setText("");

            walker = pedido.inicio;

            while(walker != null)
            {
                txaLibros.append("ID : "+walker.getId()+
                    "\nUsuario : "+walker.getUsuario()+
                    "\nFecha Salida : "+walker.getFechaSalida()+
                    "\nFecha Devolucion : "+walker.getFechaDevolucion()+"\n\n");

                walker = walker.getSiguiente();
            }
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        FormAgregarPedido frmAgregar = new FormAgregarPedido(this, pedido);
        frmAgregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        FormAgregarPedido frmAgregar = new FormAgregarPedido(this, pedido);
        frmAgregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Pedido_Nodo walker;

        if(pedido.isEmpty())
        {
            txaLibros.setText("No hay libros registrados");
            return;
        }
        else
        {
            txaLibros.setText("");

            walker = pedido.inicio;

            while(walker != null)
            {
                txaLibros.append("ID : "+walker.getId()+
                    "\nUsuario : "+walker.getUsuario()+
                    "\nFecha Salida : "+walker.getFechaSalida()+
                    "\nFecha Devolucion : "+walker.getFechaDevolucion()+"\n\n");

                walker = walker.getSiguiente();
            }
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JMenuItem btnAgregarPedido;
    private javax.swing.JMenuItem btnImprimir;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txaLibros;
    // End of variables declaration//GEN-END:variables
}
