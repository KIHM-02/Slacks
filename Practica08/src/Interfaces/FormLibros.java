package Interfaces;

import practica08.Libro_Nodo;
import practica08.Libro_Pila;

public class FormLibros extends javax.swing.JFrame 
{
    
    private Libro_Pila libro;
    private FormMenu menu;
    private String rol;
    public int ID;
        
    public FormLibros(FormMenu menu, Libro_Pila libro , String rol) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.menu = menu;
        this.rol = rol;
        this.libro = libro;                                                     //Instanciamos la clase para poder agregar datos
        ID = 0;
        
        identificarRol(rol);
    }

    private void identificarRol(String rol)
    {
        if(rol.equals("alumno"))
            btnAgregar.setVisible(false);
        
        lblUsuario.setText("Modo "+rol);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaLibros = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAgregarLibro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnImprimir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaLibros.setColumns(20);
        txaLibros.setRows(5);
        jScrollPane1.setViewportView(txaLibros);

        btnAgregar.setText("Agregar Libros");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar Libros");
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

        jMenu1.setText("Archivo");

        btnAgregarLibro.setText("Agregar");
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });
        jMenu1.add(btnAgregarLibro);
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
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnMostrar)
                    .addComponent(btnRegresar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        FormAgregarLibros frmAgregar = new FormAgregarLibros(this, libro);
        frmAgregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Libro_Nodo walker;
        
        if(libro.isEmpty())
        {
            txaLibros.setText("No hay libros registrados");
            return;
        }
        else
        {
            txaLibros.setText("");
            
            walker = libro.inicio;
            
            while(walker != null)
            {
                txaLibros.append("ID : "+walker.getId()+
                        "\nTitulo : "+walker.getTitulo()+
                        "\nFecha : "+walker.getFecha()+
                        "\nCantidad : "+walker.getCantidad()+"\n\n");
                
                walker = walker.getSiguiente();
            }
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        FormAgregarLibros frmAgregar = new FormAgregarLibros(this, libro);
        frmAgregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Libro_Nodo walker;
        
        if(libro.isEmpty())
        {
            txaLibros.setText("No hay libros registrados");
            return;
        }
        else
        {
            txaLibros.setText("");
            
            walker = libro.inicio;
            
            while(walker != null)
            {
                txaLibros.append("ID : "+walker.getId()+
                        "\nTitulo : "+walker.getTitulo()+
                        "\nFecha : "+walker.getFecha()+
                        "\nCantidad : "+walker.getCantidad()+"\n\n");
                
                walker = walker.getSiguiente();
            }
        }
    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JMenuItem btnAgregarLibro;
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
