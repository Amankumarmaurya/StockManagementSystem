/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aman Maurya
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        SelectProd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        proid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        proname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        prodesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        proquantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        procategory = new javax.swing.JComboBox<>();
        proadd = new javax.swing.JButton();
        proedit = new javax.swing.JButton();
        prodelete = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        home1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Product ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Product Id");

        proid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        proid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Name");

        proname.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Quantity");

        prodesc.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Description");

        proquantity.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Category");

        procategory.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        procategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        proadd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        proadd.setText("Add");
        proadd.setToolTipText("");
        proadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proaddMouseClicked(evt);
            }
        });
        proadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proaddActionPerformed(evt);
            }
        });

        proedit.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        proedit.setText("Edit");
        proedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proeditMouseClicked(evt);
            }
        });

        prodelete.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        prodelete.setText("Delete");
        prodelete.setToolTipText("");
        prodelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodeleteMouseClicked(evt);
            }
        });
        prodelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodeleteActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Description", "Category"
            }
        ));
        producttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(producttable);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("Product List");

        home1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        home1.setText("clear");
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(proid)
                                    .addComponent(proname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proquantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(proadd, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(prodesc, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(procategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(proedit)
                                        .addGap(18, 18, 18)
                                        .addComponent(prodelete))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(home)
                        .addGap(18, 18, 18)
                        .addComponent(home1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(proid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(proname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(proquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(prodesc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(procategory))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proadd)
                            .addComponent(proedit)
                            .addComponent(prodelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(home)
                            .addComponent(home1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proidActionPerformed

    private void proaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proaddActionPerformed

    private void prodeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodeleteActionPerformed
        
   
    
        Connection  con= null;
        Statement st=null;
        ResultSet rs=null;
        String url = "jdbc:mysql://localhost:3306/stockmanagementsystem";
        String uname = "root";
        String pwd = "";
        
        
         public void SelectProd(){
             try{
        con=DriverManager.getConnection(url, uname, pwd);
         st =con.createStatement();
         rs =st.executeQuery("select * from product");
         producttable.setModel(DbUtils.resultSetToTableModel(rs));
             }catch(SQLException ex){
                 ex.printStackTrace();
             }
    }
    private void proaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proaddMouseClicked
        try{
            con=DriverManager.getConnection(url, uname, pwd);
            PreparedStatement add=con.prepareStatement("insert into Product values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(proid.getText()));
            add.setString(2, proname.getText());
            add.setInt(3, Integer.valueOf(proquantity.getText()));
             add.setString(4, prodesc.getText());
                  add.setString(5, procategory.getSelectedItem().toString());
                  int row =add.executeUpdate();
                  JOptionPane.showMessageDialog(this, "Product Successfully Added");
                   con.close();
                   SelectProd();
        }        
        catch(SQLException ex ){
            ex.printStackTrace();
            
        }
    }//GEN-LAST:event_proaddMouseClicked

    private void prodeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodeleteMouseClicked
        // TODO add your handling code here:
        if(proid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter ths Product to be Deleted.");
        }
        else{
            try{
                con=DriverManager.getConnection(url, uname, pwd);
                String id =proid.getText();
                String query="Delete from product where id="+id;
                Statement Add =con.createStatement();
                Add.executeUpdate(query);
                SelectProd();
                 JOptionPane.showMessageDialog(this, " Product Deleted Successfully.");
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_prodeleteMouseClicked

    private void producttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)producttable.getModel();
        int Myindex =producttable.getSelectedRow();
        proid.setText(model.getValueAt(Myindex, 0).toString());
        proname.setText(model.getValueAt(Myindex, 1).toString());
         proquantity.setText(model.getValueAt(Myindex, 2).toString());
        prodesc.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_producttableMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
       new Home().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void proeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proeditMouseClicked
        // TODO add your handling code here:
        if(proid.getText().isEmpty()||proname.getText().isEmpty()||proquantity.getText().isEmpty()||prodesc.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
            
        }
        else{
            try{
                 con=DriverManager.getConnection(url, uname, pwd);
                 String updatedata="update product set name='"+proname.getText()+"'"+",quantity="+proquantity.getText()+""+",description='"+prodesc.getText()+"'"+",procategory='"+procategory.getSelectedItem().toString()+"'"+" ,where id="+proid.getText();
                  Statement Add =con.createStatement();
                Add.executeUpdate(updatedata);
                JOptionPane.showMessageDialog(this, " Product Upadate Successfully.");
                 SelectProd();
            }
            catch(Exception ex){
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_proeditMouseClicked

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked
        // TODO add your handling code here:
      
        
        
    }//GEN-LAST:event_home1MouseClicked

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home1ActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proadd;
    private javax.swing.JComboBox<String> procategory;
    private javax.swing.JButton prodelete;
    private javax.swing.JTextField prodesc;
    private javax.swing.JTable producttable;
    private javax.swing.JButton proedit;
    private javax.swing.JTextField proid;
    private javax.swing.JTextField proname;
    private javax.swing.JTextField proquantity;
    // End of variables declaration//GEN-END:variables
}
