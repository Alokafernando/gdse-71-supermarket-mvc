/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.dto.ItemDto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ItemPanel extends javax.swing.JPanel {

    private ItemController ITEM_CONTROLLER;
    
    /**
     * Creates new form ItemPanel
     */
    public ItemPanel() {
        ITEM_CONTROLLER = new ItemController();
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

        lblheader = new javax.swing.JLabel();
        lblcode = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        lbldesc = new javax.swing.JLabel();
        lblpacksize = new javax.swing.JLabel();
        lblunitprice = new javax.swing.JLabel();
        txtdesc = new javax.swing.JTextField();
        txtpacksize = new javax.swing.JTextField();
        txtunitprice = new javax.swing.JTextField();
        txtqoh = new javax.swing.JTextField();
        lblqoh = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btlupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        lblheader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblheader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblheader.setText("Manage Item");

        lblcode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcode.setText("ItemCode");

        lbldesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldesc.setText("Desciption");

        lblpacksize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpacksize.setText("PackSize");

        lblunitprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblunitprice.setText("UnitPrice");

        lblqoh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblqoh.setText("QOH");

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btlupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btlupdate.setText("Update");
        btlupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblcode, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbldesc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblpacksize, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtpacksize, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56)
                                            .addComponent(lblunitprice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtunitprice, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(btndelete)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(btlupdate)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnsave))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblqoh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtqoh, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblheader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcode)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldesc))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpacksize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpacksize)
                    .addComponent(lblunitprice)
                    .addComponent(txtunitprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblqoh)
                    .addComponent(txtqoh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btlupdate)
                    .addComponent(btndelete))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        saveItem();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btlupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlupdateActionPerformed
        updateItem();
    }//GEN-LAST:event_btlupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteItem();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        searchItem();
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlupdate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblcode;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JLabel lblheader;
    private javax.swing.JLabel lblpacksize;
    private javax.swing.JLabel lblqoh;
    private javax.swing.JLabel lblunitprice;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtpacksize;
    private javax.swing.JTextField txtqoh;
    private javax.swing.JTextField txtunitprice;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
      String [] columns = {"ItemCode", "Description", "PackSize", "UnitPrice", "QtyOnHand"};
      DefaultTableModel dtm = new DefaultTableModel(columns, 0){
          public boolean isCellEditable(int rows, int columns){
              return false;
          }
      };
      
      try{
          List<ItemDto> itemDtos = ITEM_CONTROLLER.getAllItems();
          for (ItemDto itemDto : itemDtos) {
              Object [] rowData = {itemDto.getItemCode(), itemDto.getDesciption(), itemDto.getPackSize(), itemDto.getUnitPrice(), itemDto.getQoh()};
              dtm.addRow(rowData);
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
      }
      jTable1.setModel(dtm);
    }

    private void searchItem(){
        String itemCode = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        System.out.println(itemCode);
        
        try{
            ItemDto itemDto = ITEM_CONTROLLER.search(itemCode);
            if (itemCode != null) {
                txtcode.setText(itemDto.getItemCode());
                txtdesc.setText(itemDto.getDesciption());
                txtpacksize.setText(itemDto.getPackSize());
                txtunitprice.setText(String.valueOf(itemDto.getUnitPrice()));
                txtqoh.setText(String.valueOf(itemDto.getQoh()));
            }else{
                JOptionPane.showMessageDialog(this, "Item not Found");
            }
        
        }catch(Exception e){
              JOptionPane.showMessageDialog(this, e.getMessage());
         }
    }
    
    private void clearform(){
        txtcode.setText("");
        txtdesc.setText("");
        txtpacksize.setText("");
        txtqoh.setText("");
        txtunitprice.setText("");
                
    }
    
    private  void saveItem(){
        ItemDto itemDto = new ItemDto(
                txtcode.getText(),
                txtdesc.getText(),
                txtpacksize.getText(),
                Double.parseDouble(txtunitprice.getText()),
                Integer.parseInt(txtqoh.getText()));
        
        try{
            String resp = ITEM_CONTROLLER.save(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearform();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void updateItem(){
        ItemDto itemDto = new ItemDto(
            txtcode.getText(),
            txtdesc.getText(),
            txtpacksize.getText(),
            Double.parseDouble(txtunitprice.getText()),
            Integer.parseInt(txtqoh.getText()));
        
        
        try{
            String resp = ITEM_CONTROLLER.update(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearform();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
  
    private void deleteItem(){
        ItemDto itemDto = new ItemDto(
            txtcode.getText(),
            txtdesc.getText(),
            txtpacksize.getText(),
            Double.parseDouble(txtunitprice.getText()),
            Integer.parseInt(txtqoh.getText()));
        
        
        try{
            String resp = ITEM_CONTROLLER.delete(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearform();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    
}
