/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.CustomerController;
import pos.mvc.controller.ItemController;
import pos.mvc.controller.OrderController;
import pos.mvc.model.Customer;
import pos.mvc.model.Item;
import pos.mvc.model.Order;
import pos.mvc.model.OrderDetail;

/**
 *
 * @author anjanathrishakya
 */
public class OrderPanel extends javax.swing.JPanel {

    private final CustomerController customerController;
    private final ItemController itemController;
    private final OrderController orderController;
    
    private Item selectItemTemp;
    private Customer tempCustomer;
    private Double total = 0.0;
    
    private List<OrderDetail> orderDetails = new ArrayList<>();
    /**
     * Creates new form OrderPanel
     */
    public OrderPanel() {
        customerController = new CustomerController();
        itemController = new ItemController();
        orderController = new OrderController();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTitle1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtCustId = new javax.swing.JTextField();
        btnSearchCustomer = new javax.swing.JButton();
        lblCustName = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        txtItemId = new javax.swing.JTextField();
        btnSearchCustomer1 = new javax.swing.JButton();
        lblItem = new javax.swing.JLabel();
        btnItemAdd = new javax.swing.JButton();
        lblId2 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        lblId3 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setToolTipText("");

        lblTitle1.setBackground(new java.awt.Color(204, 204, 204));
        lblTitle1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Order");

        lblId.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblId.setText("Customer ID :");

        btnSearchCustomer.setText("Search Customer");
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
            }
        });

        lblId1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblId1.setText("Item ID :");

        btnSearchCustomer1.setText("Search Item");
        btnSearchCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomer1ActionPerformed(evt);
            }
        });

        btnItemAdd.setText("Add Item");
        btnItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemAddActionPerformed(evt);
            }
        });

        lblId2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblId2.setText("Order ID :");

        txtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIdActionPerformed(evt);
            }
        });

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        btnAdd.setText("Place Order");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblId3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblId3.setText("Qty :");

        jLabel1.setText("Total : ");

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblId1)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblId3)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSearchCustomer1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(btnItemAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblId2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchCustomer)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(lblItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId2)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchCustomer)))
                    .addComponent(lblCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblId1)
                        .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchCustomer1))
                    .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnItemAdd)
                    .addComponent(lblId3)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        searchCustomer();
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

    private void btnSearchCustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomer1ActionPerformed
        searchItem();
    }//GEN-LAST:event_btnSearchCustomer1ActionPerformed

    private void btnItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemAddActionPerformed
        addToTable();
    }//GEN-LAST:event_btnItemAddActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        placeOrder();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnItemAdd;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchCustomer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId3;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void searchCustomer() {
        Integer id = Integer.valueOf(txtCustId.getText());
        try {
            Customer customer = customerController.getCustomer(id);
            if (customer != null) {
                lblCustName.setText(customer.getName());
                tempCustomer = customer;
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void searchItem() {
        try {
            Integer id = Integer.valueOf(txtItemId.getText()); 
            Item item = itemController.getItem(id);
            if(item != null){
                lblItem.setText("Name : " + item.getName() + " | QOH : " + item.getQtyOnHand() );
                selectItemTemp = item;
            } else{
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void addToTable() {
        if(selectItemTemp != null){
            OrderDetail od = new OrderDetail(-1, selectItemTemp.getId(), selectItemTemp.getName(), selectItemTemp.getUnitPrice(), Integer.valueOf(txtQty.getText()));
            orderDetails.add(od);

            DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
            String[] rowData = {Integer.toString(od.getItemId()), od.getItemName(), txtQty.getText(), Double.toString(od.getUnitPrice()), Double.toString(od.getUnitPrice() * od.getQty() )};
            dtm.addRow(rowData);
            total +=selectItemTemp.getUnitPrice() * Double.valueOf(txtQty.getText());
            lblTotal.setText(Double.toString(total));
            cleanItemForm();
        } else{
            JOptionPane.showMessageDialog(this, "Select Item");
        }
    }

    private void loadTable() {
        String [] collumns = {"Id", "Name", "Qty", "Unit Price", "Sub Total"};
            
            DefaultTableModel dtm = new DefaultTableModel(collumns, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            tblOrder.setModel(dtm);
    }

    private void placeOrder() {
        Order order = new Order(Integer.valueOf(txtOrderId.getText()), Integer.valueOf(txtCustId.getText()), new Date(), total);
        
        try {
            String result = orderController.placeOrder(order, orderDetails);
            JOptionPane.showMessageDialog(this, result);
        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        cleanForm();
    }

    private void cleanItemForm() {
        txtItemId.setText("");
        txtQty.setText("");
        selectItemTemp = null;
        lblItem.setText("");
    }

    private void cleanForm() {
        cleanItemForm();
        tempCustomer = null;
        orderDetails = new ArrayList<>();
        total = 0.0;
        loadTable();
        txtCustId.setText("");
        txtOrderId.setText("");
        lblCustName.setText("");
        
        
    }
}
