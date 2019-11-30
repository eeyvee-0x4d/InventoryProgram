import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vincent
 */
public class Inventory extends javax.swing.JFrame {

    public LinkedList list = new LinkedList();

    /**
     * Creates new form Inventory
     */
    public Inventory() throws FileNotFoundException {
        initComponents();
        initializeRecord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelForTitle = new javax.swing.JPanel();
        labelForTitle = new javax.swing.JLabel();
        OrderButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        addItemButton = new javax.swing.JButton();
        editItemButton = new javax.swing.JButton();
        deleteItemButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchItemButton = new javax.swing.JButton();
        scrollPaneForItemTable = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelForTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        labelForTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelForTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelForTitle.setText("Tesla Tech Electronics Inc.");

        OrderButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OrderButton.setText("Receipt");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelForTitleLayout = new javax.swing.GroupLayout(panelForTitle);
        panelForTitle.setLayout(panelForTitleLayout);
        panelForTitleLayout.setHorizontalGroup(
            panelForTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForTitleLayout.createSequentialGroup()
                .addComponent(OrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelForTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelForTitleLayout.setVerticalGroup(
            panelForTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelForTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(OrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        editItemButton.setText("Edit Item");
        editItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemButtonActionPerformed(evt);
            }
        });

        deleteItemButton.setText("Delete Item");
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });

        searchField.setText("Search Item...");
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchItemButton.setText("Search");
        searchItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemButtonActionPerformed(evt);
            }
        });

        itemTable.setAutoCreateRowSorter(true);
        itemTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Stocks", "Unit Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        itemTable.setFillsViewportHeight(true);
        itemTable.setInheritsPopupMenu(true);
        itemTable.setShowGrid(true);
        itemTable.getTableHeader().setReorderingAllowed(false);
        scrollPaneForItemTable.setViewportView(itemTable);
        if (itemTable.getColumnModel().getColumnCount() > 0) {
            itemTable.getColumnModel().getColumn(0).setResizable(false);
            itemTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            itemTable.getColumnModel().getColumn(1).setResizable(false);
            itemTable.getColumnModel().getColumn(1).setPreferredWidth(250);
            itemTable.getColumnModel().getColumn(2).setResizable(false);
            itemTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneForItemTable)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchItemButton)))
                .addContainerGap())
        );

        mainPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addItemButton, deleteItemButton, editItemButton, searchItemButton});

        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editItemButton)
                            .addComponent(deleteItemButton)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchItemButton)
                            .addComponent(searchField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneForItemTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addItemButton, deleteItemButton, editItemButton, searchItemButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelForTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelForTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
        AddItemDialog addItemDialog = new AddItemDialog(new javax.swing.JFrame(), true);
        addItemDialog.setVisible(true);
        try {
            DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
            int row = model.getRowCount();
            
            for(int i = row - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            
            initializeRecord();
        }
        catch (FileNotFoundException e) {
        }
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void editItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemButtonActionPerformed
        // TODO add your handling code here:
        EditItem editItem = new EditItem(new javax.swing.JFrame(), true);
        editItem.setVisible(true);
        try {
            DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
            int row = model.getRowCount();
            
            for(int i = row - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            
            initializeRecord();
        }
        catch (FileNotFoundException e) {
        }
    }//GEN-LAST:event_editItemButtonActionPerformed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        // TODO add your handling code here:
        int numRows = itemTable.getSelectedRows().length;
        int selectedRow = itemTable.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        
        LinkedList items = new LinkedList();
        
        try {
            int i = 0;
            FileReader inputFile = new FileReader("inventoryRecords.txt");
            Scanner scan = new Scanner(inputFile);
            String tempString = "";

            while (scan.hasNextLine()) {
                tempString = scan.nextLine();
                String temp1[] = tempString.split(";");

               String  itemName = temp1[1];
                int itemStock = Integer.parseInt(temp1[2]);
                double itemPrice = Double.parseDouble(temp1[3]);

                items.insert(itemName, itemStock, itemPrice);
            }
        } catch (FileNotFoundException e) {
        }

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "No item selected, select an item to remove.");
        } else {
            for (int i = 0; i < numRows; i++) {
                selectedRow = itemTable.getSelectedRow();
                
                String itemNameToDelete = itemTable.getModel().getValueAt(selectedRow, 1).toString();
                items.delete(itemNameToDelete);
                
                model.removeRow(itemTable.getSelectedRow());
            }
        }
        
        //items.show();
        items.getItemList();
        
        try {
            int i = 0;

            BufferedWriter writer1 = new BufferedWriter(new FileWriter("inventoryRecords.txt"));
            
            
//            String itemCode = itemTable.getModel().getValueAt(row, 0).toString();
//            String itemName = itemTable.getModel().getValueAt(row, 1).toString();
//            String itemStock = itemTable.getModel().getValueAt(row, 2).toString();
//            String itemPrice = itemTable.getModel().getValueAt(row, 3).toString();
            int listLength = items.length();
            int itemCode = LinkedList.itemList[i].getItemCode();
            String itemName = LinkedList.itemList[i].getItemName();
            int itemStock = LinkedList.itemList[i].getItemStock();
            double itemPrice = LinkedList.itemList[i].getItemPrice();
            i++;

            writer1.write(itemCode + ";" + itemName + ";" + itemStock + ";" + itemPrice);
            writer1.close();

            BufferedWriter writer2 = new BufferedWriter(new FileWriter("inventoryRecords.txt", true));
            for (i = 1; i < listLength; i++) {
            itemCode = LinkedList.itemList[i].getItemCode();
            itemName = LinkedList.itemList[i].getItemName();
            itemStock = LinkedList.itemList[i].getItemStock();
            itemPrice = LinkedList.itemList[i].getItemPrice();

                writer2.append("\n" + itemCode + ";" + itemName + ";" + itemStock + ";" + itemPrice);
            }
            writer2.close();
        } 
        catch (IOException e) {
        }
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        // TODO add your handling code here:
        searchField.setText("");
        
        try {
            DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
            int rows = model.getRowCount();

            for (int i = rows - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            initializeRecord();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemButtonActionPerformed
        // TODO add your handling code here:
        String searchQuery = searchField.getText();
        boolean itemIsFound = false;
        int itemCode = 0;
        String itemName = "";
        int itemStock = 0;
        double itemPrice = 0;
        
        LinkedList items = new LinkedList();
        
        try {
            int i = 0;
            FileReader inputFile = new FileReader("inventoryRecords.txt");
            Scanner scan = new Scanner(inputFile);
            String tempString = "";

            while (scan.hasNextLine()) {
                tempString = scan.nextLine();
                String temp1[] = tempString.split(";");

                itemName = temp1[1];
                itemStock = Integer.parseInt(temp1[2]);
                itemPrice = Double.parseDouble(temp1[3]);

                items.insert(itemName, itemStock, itemPrice);
            }
        }
        catch(FileNotFoundException e) {
        }
        
        items.getItemList();
        int listLength = items.length();
        
        for (int i = 0; i < listLength; i++) {
            if (searchQuery.equalsIgnoreCase(LinkedList.itemList[i].getItemName()) || searchQuery.equals(Integer.toString(LinkedList.itemList[i].getItemCode()))) {
                itemIsFound = true;
                itemCode = LinkedList.itemList[i].getItemCode();
                itemName = LinkedList.itemList[i].getItemName();
                itemStock = LinkedList.itemList[i].getItemStock();
                itemPrice = LinkedList.itemList[i].getItemPrice();
            }
        }
        
        items.clear();
        items.clearItemList();
        
        if(itemIsFound) {
            DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
            int rows = model.getRowCount();
            
            for(int i = rows - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            model.addRow(new Object[]{new Integer(itemCode), new String(itemName), new Integer(itemStock), new Double(itemPrice)});
        }
        else if(searchQuery.equals("") || searchQuery.equals("Search Item...")) {
            
            JOptionPane.showMessageDialog(null, "Input is empty!");
            
            try {
                DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
                int rows = model.getRowCount();

                for (int i = rows-1 ; i >= 0; i--) {
                    model.removeRow(i);
                }
                list.clear();
                list.clearItemList();
                initializeRecord();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Item does not exist!");
        }
    }//GEN-LAST:event_searchItemButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
        Receipt receipt = new Receipt();
        receipt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OrderButtonActionPerformed
    
    /*
    * Used to initialize list from text file
    */
    private void initializeTable() {
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
    }

    private void initializeRecord() throws FileNotFoundException {
        int i = 0;
        FileReader inputFile = new FileReader("inventoryRecords.txt");
        Scanner scan = new Scanner(inputFile);
        String tempString = "";

        while (scan.hasNextLine()) {
            tempString = scan.nextLine();
            String temp[] = tempString.split(";");

            String itemName = temp[1];
            int itemStocks = Integer.parseInt(temp[2]);
            double itemPrice = Double.parseDouble(temp[3]);

            list.insert(itemName, itemStocks, itemPrice);
        }
        
        //list.show();
        //System.out.println(list.length());
        
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        
        int listLength = list.length();
        list.getItemList();
        
        for(i = 0; i < listLength; i++) {
            int itemCode = LinkedList.itemList[i].getItemCode();
            String itemName = LinkedList.itemList[i].getItemName();
            int itemStock = LinkedList.itemList[i].getItemStock();
            double itemPrice = LinkedList.itemList[i].getItemPrice();
            
           // System.out.println(itemCode + " " + itemName + " " + itemStock +  " " + itemPrice);
            model.addRow(new Object[]  {new Integer(itemCode), new String(itemName), new Integer(itemStock), new Double(itemPrice)});
        }
        
        list.clear();
        list.clearItemList();
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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Inventory().setVisible(true);
//            }
//        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OrderButton;
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JButton editItemButton;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel labelForTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelForTitle;
    private javax.swing.JScrollPane scrollPaneForItemTable;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchItemButton;
    // End of variables declaration//GEN-END:variables
}
