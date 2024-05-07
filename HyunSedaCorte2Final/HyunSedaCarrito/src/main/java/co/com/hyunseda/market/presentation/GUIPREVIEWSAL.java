package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.domain.Category;
import co.com.hyunseda.market.domain.Product;
import co.com.hyunseda.market.domain.acess.Factory;
import co.com.hyunseda.market.domain.acess.IProductRepository;
import co.com.hyunseda.market.main.HyunSedaSolid;
import co.com.hyunseda.market.service.ProductService;
import co.com.hyunseda.market.service.ShoppingCartService;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import co.com.hyunseda.market.infrastructure.Observer;
import co.com.hyunseda.market.service.CategoryService;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Cursor;

/**
 *
 * @author Libardo
 */
public class GUIPREVIEWSAL extends javax.swing.JFrame {

    private final ProductService service;
    private List<Product> products;

    /**
     * Creates new form GUIDishes2
     */
    public GUIPREVIEWSAL() {
        initComponents();
        IProductRepository repo = Factory.getInstance().getProductRepository("default");
        service = new ProductService(repo);
        loadCategories();
        loadAllProducts();
        setLocationRelativeTo(null);
        setSize(1000, 500);
    }

    private void loadCategories() {

      /*  cboCategories.addItem("<Todas>");
        for (Category category : Category.values()) {
            cboCategories.addItem(category.toString());
        }*/

    }

    private void loadAllProducts() {
        try {
            products = service.findAllProducts();
            DefaultListModel listModel = new DefaultListModel();

            for (Product product : products) {
                listModel.addElement(product.getProductName());
            }
            lstProducts.setModel(listModel);
        } catch (Exception ex) {
            Logger.getLogger(GUIPREVIEWSAL.class.getName()).log(Level.SEVERE, "Error al cargar platos", ex);
        }
    }

    private void loadProductsByCategory(String category) {
        /*try {
            products = service.findProductsByCatgegory(category);
            DefaultListModel listModel = new DefaultListModel();

            for (Product product : products) {
                listModel.addElement(product.getProductName());
            }
            lstProducts.setModel(listModel);
        } catch (Exception ex) {
            Logger.getLogger(GUIPREVIEW.class.getName()).log(Level.SEVERE, "Error al cargar platos", ex);
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        pnlCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProducts = new javax.swing.JList<>();
        lblImage = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        pnlNorte = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboCategories = new javax.swing.JComboBox<>();
        pnlSur = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos de Huyn Seda");

        pnlCentro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlCentro.setLayout(new java.awt.GridLayout(1, 3));

        lstProducts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstProducts);

        pnlCentro.add(jScrollPane1);

        lblImage.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen"));
        pnlCentro.add(lblImage);

        lblDescription.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        lblDescription.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción"));
        pnlCentro.add(lblDescription);

        getContentPane().add(pnlCentro, java.awt.BorderLayout.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        pnlNorte.add(jLabel3);

        jLabel1.setFont(new java.awt.Font("TeXGyreHeros", 3, 24)); // NOI18N
        jLabel1.setText("Hyun Seda");
        pnlNorte.add(jLabel1);

        jLabel2.setText("    Categoría:");
        pnlNorte.add(jLabel2);

        cboCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriesActionPerformed(evt);
            }
        });
        pnlNorte.add(cboCategories);

        getContentPane().add(pnlNorte, java.awt.BorderLayout.NORTH);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrar.png"))); // NOI18N
        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlSur.add(btnClose);

        getContentPane().add(pnlSur, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
    /**
     * Al hacer clic en el item del jList se muestra la imagen y la descripción
     *
     * @param evt
     */
    private void lstProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstProductsMouseClicked
        int i = lstProducts.getSelectedIndex();
        if (i >= 0) {
            // Coloca la descripción
            StringBuilder sb = new StringBuilder(64);
            sb.append("<html>" + products.get(i).getProductDescripcion()
                    + "<br><br>Precio: " + products.get(i).getProductPrice()
                    //+ "<br><br>Categorías: " + products.get(i).getCategoriasSecundarias().toString()
                    + "</html>");
            lblDescription.setText(sb.toString());
            // Coloca el titulo de la imagen
            lblImage.setBorder(javax.swing.BorderFactory.createTitledBorder(products.get(i).getProductName()));
            // Coloca la imagen
            String nameString = products.get(i).getProductPhoto();
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            ImageIcon imageIcon = Utilities.loadImageFromCloud(nameString);
            if (imageIcon != null) {
                lblImage.setIcon(imageIcon);
            }
            setCursor(Cursor.getDefaultCursor());
        }
    }//GEN-LAST:event_lstProductsMouseClicked

    private void cboCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriesActionPerformed
        if (cboCategories.getSelectedIndex() == 0) {
            loadAllProducts();
        } else {
            loadProductsByCategory(cboCategories.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cboCategoriesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPREVIEWSAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cboCategories;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblImage;
    private javax.swing.JList<String> lstProducts;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlSur;
    // End of variables declaration//GEN-END:variables
}