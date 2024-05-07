/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.service.CategoryService;
import co.com.hyunseda.market.service.ProductService;
import co.com.hyunseda.market.service.ShoppingCartService;

/**
 *
 * @author Laura Sofia
 */
public class GUIMENUPRODUCTO extends javax.swing.JFrame {
    
    private CategoryService categoryService;
    private ShoppingCartService shoppingCartService;
    private ProductService productService;
     
    public GUIMENUPRODUCTO( CategoryService categoryService,ProductService productService,ShoppingCartService shoppingCartService) {
        initComponents();
        this.categoryService = categoryService;
        this.productService = productService;
        this.shoppingCartService = shoppingCartService;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegMenuPrincipal = new javax.swing.JButton();
        btnSalirMenuProduct = new javax.swing.JButton();
        Panelbtn = new javax.swing.JPanel();
        btnAgregarProduc = new javax.swing.JButton();
        btnEditarProduc = new javax.swing.JButton();
        btnBuscarProduc = new javax.swing.JButton();
        btnEliminarProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU PRODUCTO");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        btnRegMenuPrincipal.setText("Regresar al Menu Pricipal");
        btnRegMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegMenuPrincipal);

        btnSalirMenuProduct.setText("Salir");
        btnSalirMenuProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMenuProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalirMenuProduct);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        Panelbtn.setLayout(new java.awt.GridLayout(4, 1));

        btnAgregarProduc.setText("Agregar ");
        btnAgregarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProducActionPerformed(evt);
            }
        });
        Panelbtn.add(btnAgregarProduc);

        btnEditarProduc.setText("Editar");
        btnEditarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProducActionPerformed(evt);
            }
        });
        Panelbtn.add(btnEditarProduc);

        btnBuscarProduc.setText("Buscar");
        btnBuscarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProducActionPerformed(evt);
            }
        });
        Panelbtn.add(btnBuscarProduc);

        btnEliminarProduct.setText("Eliminar");
        btnEliminarProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductActionPerformed(evt);
            }
        });
        Panelbtn.add(btnEliminarProduct);

        getContentPane().add(Panelbtn, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProducActionPerformed
        GUIAGREGARPRODUCT abrir = new GUIAGREGARPRODUCT(categoryService,productService,shoppingCartService);
        abrir.setVisible(true);
        this.setVisible(false);    
    }//GEN-LAST:event_btnAgregarProducActionPerformed

    private void btnEditarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProducActionPerformed
         GUIEDITARPRODUCT abrir = new GUIEDITARPRODUCT(categoryService,productService,shoppingCartService);
        abrir.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnEditarProducActionPerformed

    private void btnBuscarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProducActionPerformed
        //GUIBUSCPRODUCTO abrir = new GUIBUSCPRODUCTO(this, true,productService);
        //GUIProductsFindd abrir = new GUIProductsFindd(this, true,categoryService,productService,shoppingCartService);
        GUIProductsFind abrir = new GUIProductsFind(this, true,productService,shoppingCartService);
        abrir.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnBuscarProducActionPerformed

    private void btnEliminarProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductActionPerformed
        GUIELIMINARPRODUCT abrir = new GUIELIMINARPRODUCT(categoryService,productService,shoppingCartService);
        abrir.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnEliminarProductActionPerformed

    private void btnSalirMenuProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuProductActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirMenuProductActionPerformed

    private void btnRegMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMenuPrincipalActionPerformed
        GUIMENUPRINCIPAL abrir = new GUIMENUPRINCIPAL(categoryService,productService,shoppingCartService);
        abrir.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnRegMenuPrincipalActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelbtn;
    private javax.swing.JButton btnAgregarProduc;
    private javax.swing.JButton btnBuscarProduc;
    private javax.swing.JButton btnEditarProduc;
    private javax.swing.JButton btnEliminarProduct;
    private javax.swing.JButton btnRegMenuPrincipal;
    private javax.swing.JButton btnSalirMenuProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}