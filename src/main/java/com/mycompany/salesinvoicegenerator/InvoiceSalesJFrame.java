/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.salesinvoicegenerator;

import com.mycompany.salesinvoicegenerator.Model.InvoiceHeader;
import com.mycompany.salesinvoicegenerator.Model.InvoiceHeaderTableModel;
import com.mycompany.salesinvoicegenerator.Model.InvoiceLine;
import com.mycompany.salesinvoicegenerator.Model.InvoiceLinesTableModel;
import com.mycompany.salesinvoicegenerator.view.InvoiceHeaderDialog;
import com.mycompany.salesinvoicegenerator.view.InvoiceLineDialog;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author DELL
 */
public class InvoiceSalesJFrame extends javax.swing.JFrame implements ActionListener,ListSelectionListener{

    /**
     * Creates new form InvoiceSalesJFrame
     */
    public InvoiceSalesJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InvoicesTable = new javax.swing.JTable();
        InvoicesTable.getSelectionModel().addListSelectionListener(this);
        CreateNewInvoice = new javax.swing.JButton();
        CreateNewInvoice.addActionListener(this);
        DeleteInvoice = new javax.swing.JButton();
        DeleteInvoice.addActionListener(this);
        jLabel1 = new javax.swing.JLabel();
        InvoiceDateLabel = new javax.swing.JLabel();
        CustomerNameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InvoiceNumberLabel = new javax.swing.JLabel();
        InvoiceTotalLabel = new javax.swing.JLabel();
        InvoiceDateTextField = new javax.swing.JTextField();
        CustomerNameTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoiceItemsTable = new javax.swing.JTable();
        CreateNewLine = new javax.swing.JButton();
        CreateNewLine.addActionListener(this);
        DeleteLine = new javax.swing.JButton();
        DeleteLine.addActionListener(this);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFileMenuItem = new javax.swing.JMenuItem();
        LoadFileMenuItem.addActionListener(this);
        SaveFileMenuItem = new javax.swing.JMenuItem();
        SaveFileMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(InvoicesTable);

        CreateNewInvoice.setText("Create New Invoice ");
        CreateNewInvoice.setActionCommand("CreateNewInvoice ");
        CreateNewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewInvoiceActionPerformed(evt);
            }
        });

        DeleteInvoice.setText("Delete Invoice");
        DeleteInvoice.setActionCommand("DeleteInvoice");

        jLabel1.setText("Invoice Number");

        InvoiceDateLabel.setText("Invoice Date");

        CustomerNameLabel.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        InvoiceDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceDateTextFieldActionPerformed(evt);
            }
        });

        CustomerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNameTextFieldActionPerformed(evt);
            }
        });

        InvoiceItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(InvoiceItemsTable);

        CreateNewLine.setText("Create New Line");
        CreateNewLine.setActionCommand("CreateNewLine");
        CreateNewLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewLineActionPerformed(evt);
            }
        });

        DeleteLine.setText("Delete Line");
        DeleteLine.setActionCommand("DeleteLine");

        jMenu1.setText("File");

        LoadFileMenuItem.setText("Load File");
        LoadFileMenuItem.setActionCommand("LoadFile");
        LoadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(LoadFileMenuItem);

        SaveFileMenuItem.setText("Save File");
        SaveFileMenuItem.setActionCommand("SaveFile");
        SaveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(SaveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CreateNewInvoice)
                        .addGap(60, 60, 60)
                        .addComponent(DeleteInvoice)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CustomerNameLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(InvoiceDateLabel)
                                        .addComponent(jLabel1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CustomerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(InvoiceDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(InvoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(InvoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(CreateNewLine)
                        .addGap(107, 107, 107)
                        .addComponent(DeleteLine)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateNewInvoice)
                            .addComponent(DeleteInvoice)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(InvoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceDateLabel)
                            .addComponent(InvoiceDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerNameLabel)
                            .addComponent(CustomerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(InvoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateNewLine)
                            .addComponent(DeleteLine))))
                .addGap(86, 92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadFileMenuItemActionPerformed

    private void CreateNewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewInvoiceActionPerformed

    private void SaveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveFileMenuItemActionPerformed

    private void CustomerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNameTextFieldActionPerformed

    private void CreateNewLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewLineActionPerformed

    private void InvoiceDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceDateTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceSalesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceSalesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceSalesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceSalesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceSalesJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateNewInvoice;
    private javax.swing.JButton CreateNewLine;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JTextField CustomerNameTextField;
    private javax.swing.JButton DeleteInvoice;
    private javax.swing.JButton DeleteLine;
    private javax.swing.JLabel InvoiceDateLabel;
    private javax.swing.JTextField InvoiceDateTextField;
    private javax.swing.JTable InvoiceItemsTable;
    private javax.swing.JLabel InvoiceNumberLabel;
    private javax.swing.JLabel InvoiceTotalLabel;
    private javax.swing.JTable InvoicesTable;
    private javax.swing.JMenuItem LoadFileMenuItem;
    private javax.swing.JMenuItem SaveFileMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private DateFormat DF =new SimpleDateFormat("dd-MM-yyyy");
private List<InvoiceHeader> InvoicesList = new ArrayList<>();
private InvoiceHeaderTableModel invoiceHeaderTableModel;
private InvoiceLinesTableModel invoiceLinesTableModel;
private InvoiceHeaderDialog HeaderDialog;
private InvoiceLineDialog LineDialog;
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
      case "LoadFile":
            {
                try {
                    loadFile();
                } catch (ParseException ex) {
                    Logger.getLogger(InvoiceSalesJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Error:"+ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    Logger.getLogger(InvoiceSalesJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Error:"+ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
          break;

          
      case "SaveFile":
          saveFile();
          break;
            
      case "CreateNewInvoice ":
          displayNewInvoiceDialog();
           break;
           
      case "DeleteInvoice":
          deleteInvoice();
          break;
       
      case "CreateNewLine":
          displayNewLineDialog();
          break;
           
      case  "DeleteLine":
          deleteLine();
          break;
      case "CreateInvoiceCancel":
          createInvoiceCancel();
          
          break;
          
      case "CreateInvoiceOk":
          createInvoiceOk();
          break;
          
      case "CreateLineOk":
          createLineOk();
          break;
          
      case "CreateLineCancel" :
          createLineCancel();
          break;
        }
                
    }
    public void loadFile() throws FileNotFoundException, ParseException, IOException{
        JOptionPane.showMessageDialog(this, "Select Invoice Header File","Attention", JOptionPane.WARNING_MESSAGE);
        JFileChooser OpenInVoiceHeaderFile= new JFileChooser();
        int Result=OpenInVoiceHeaderFile.showOpenDialog(this);
        if(Result==JFileChooser.APPROVE_OPTION){
            File InvoiceHeaderFile= OpenInVoiceHeaderFile.getSelectedFile();
            try{
                FileReader HeaderReader= new FileReader(InvoiceHeaderFile);
                BufferedReader HeaderBuffer= new BufferedReader(HeaderReader);
                String HeaderLines = null;
                while((HeaderLines = HeaderBuffer.readLine())!=null){
                    String [] HeaderParts=HeaderLines.split(",");
                    String InvoiceNumberStr=HeaderParts[0];
                     String InvoiceDateStr=HeaderParts[1];
                      String CustomerName=HeaderParts[2];
                    int InvoiceNumber=Integer.parseInt(InvoiceNumberStr);
                    Date InvoiceDate =DF.parse(InvoiceDateStr);
                    InvoiceHeader Invoice= new InvoiceHeader(InvoiceNumber,InvoiceDate,CustomerName);
                    InvoicesList.add(Invoice);
                }
            
                JOptionPane.showMessageDialog(this, "Select Invoice Line File","Attention", JOptionPane.WARNING_MESSAGE);
             JFileChooser OpenInVoiceLineFile= new JFileChooser();
             Result=OpenInVoiceLineFile.showOpenDialog(this);
             if(Result==JFileChooser.APPROVE_OPTION){ 
             File InvoiceLineFile= OpenInVoiceLineFile.getSelectedFile();
             BufferedReader LinesBuffer= new BufferedReader(new FileReader(InvoiceLineFile));
             String LineLines = null;
                while((LineLines = LinesBuffer.readLine())!=null){
                    String [] LinesParts=LineLines.split(",");
                    String InvoiceNumberStr=LinesParts[0];
                    String ItemName=LinesParts[1];
                    String ItemPriceStr=LinesParts[2];
                    String ItemCountStr=LinesParts[3];
                    int InvoiceNumber=Integer.parseInt(InvoiceNumberStr);
                    double ItemPrice=Double.parseDouble(ItemPriceStr);
                    int ItemCount=Integer.parseInt(ItemCountStr);
                    InvoiceHeader Header=findInvoiceByNumber(InvoiceNumber);
                    InvoiceLine invoiceLine=new InvoiceLine(ItemName,ItemPrice,ItemCount,Header);
                    Header.getInvoiceLines().add(invoiceLine); 
                    
             }
                invoiceHeaderTableModel= new InvoiceHeaderTableModel(InvoicesList);
                InvoicesTable.setModel(invoiceHeaderTableModel);
                InvoicesTable.validate();
            }
               
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error:"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        displayInvoicesHeader();
        
    }
    private void saveFile(){
        String Headers="";
        String Lines="";
        for (InvoiceHeader invoiceHeader :InvoicesList){
            Headers =Headers + invoiceHeader.getDataAsCSVForHeaders();
            Headers = Headers + "\n";
            for (InvoiceLine invoiceLine : invoiceHeader.getInvoiceLines()){
                Lines = Lines + invoiceLine.getDataAsCSVForLines();
                Lines = Lines + "\n";
            }
        }
        JOptionPane.showMessageDialog(this, "Select Invoice Header File Data","Attention", JOptionPane.WARNING_MESSAGE);
        JFileChooser saveFile = new JFileChooser();
        int Result = saveFile.showSaveDialog(this);
        if(Result==JFileChooser.APPROVE_OPTION){
            File HeadersFile= saveFile.getSelectedFile();
            try { 
                FileWriter HeaderFileWriter = new FileWriter(HeadersFile);
                HeaderFileWriter.write(Headers);
                HeaderFileWriter.flush();
                HeaderFileWriter.close();
                JOptionPane.showMessageDialog(this, "Select Invoice Line File Data","Attention", JOptionPane.WARNING_MESSAGE);
                Result = saveFile.showSaveDialog(this);
                if(Result==JFileChooser.APPROVE_OPTION){
                    File LinesFile = saveFile.getSelectedFile();
                    FileWriter LinesFileWriter= new FileWriter(LinesFile);
                    LinesFileWriter.write(Lines);
                    LinesFileWriter.flush();
                    LinesFileWriter.close();       
                }
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error:"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
         
         
    }
    private InvoiceHeader findInvoiceByNumber(int InvoiceNumber){
        InvoiceHeader Header=null;
        for(InvoiceHeader invoice:InvoicesList){
            if(InvoiceNumber==invoice.getInvoiceNumber()){
                Header=invoice;
                break;
            }
        }
        return Header;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        System.out.println("Invoice Selected");
        InvoicesTableRowSelected();
    }

    private void InvoicesTableRowSelected() {
       int selectedRowIndex=InvoicesTable.getSelectedRow();
       if(selectedRowIndex>=0){
           InvoiceHeader row =invoiceHeaderTableModel.getInvoicesList().get(selectedRowIndex);
           InvoiceNumberLabel.setText(""+row.getInvoiceNumber());
           InvoiceDateTextField.setText(DF.format(row.getInvoiceDate()));
           CustomerNameTextField.setText(row.getCustomerName());
           InvoiceTotalLabel.setText(""+row.getInvoiceHeaderTotal());
           ArrayList<InvoiceLine> Lines=row.getInvoiceLines();
           invoiceLinesTableModel = new InvoiceLinesTableModel(Lines);
           InvoiceItemsTable.setModel(invoiceLinesTableModel);
           invoiceLinesTableModel.fireTableDataChanged();
       }
    }

    private void displayNewInvoiceDialog() {
      HeaderDialog = new InvoiceHeaderDialog(this);
      HeaderDialog.setVisible(true);
}
       private void displayNewLineDialog() {
       LineDialog = new InvoiceLineDialog(this);
       LineDialog.setVisible(true);
}

    private void createInvoiceCancel() {
       HeaderDialog.setVisible(false);
       HeaderDialog.dispose();
       HeaderDialog=null;
    }

    private void createInvoiceOk() {
      String CustomerName=HeaderDialog.getCustomerNameTF().getText();
      String InvoiceDateStr=HeaderDialog.getInvoiceDateTF().getText();
      HeaderDialog.setVisible(false);
      HeaderDialog.dispose();
      HeaderDialog=null;
      try {
          Date InvoiceDate =DF.parse(InvoiceDateStr);
          int InvoiceNumber=GetNextInvoiceNumber();
          InvoiceHeader invoiceHeader= new InvoiceHeader(InvoiceNumber,InvoiceDate,CustomerName);
          InvoicesList.add(invoiceHeader);
         invoiceHeaderTableModel.fireTableDataChanged();
      } catch (ParseException e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Error:"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
      }
      displayInvoicesHeader();
    }
    private int GetNextInvoiceNumber(){
        int Max =0;
        for (InvoiceHeader Header:InvoicesList){
            if (Header.getInvoiceNumber()>Max){
                Max =Header.getInvoiceNumber();
            }
        }
        return Max+1;
    }

    private void createLineOk() {
       String ItemName=LineDialog.getItemNameTF().getText();
       String ItemCountStr= LineDialog.getItemCountTF().getText();
       String ItemPriceStr=LineDialog.getItemPriceTF().getText();
      LineDialog.setVisible(false);
      LineDialog.dispose();
      LineDialog=null;
       int ItemCount=Integer.parseInt(ItemCountStr);
       double ItemPrice=Double.parseDouble(ItemPriceStr);
       int HeaderIndex=InvoicesTable.getSelectedRow();
      InvoiceHeader Invoice= invoiceHeaderTableModel.getInvoicesList().get(HeaderIndex);
       InvoiceLine invoiceLine= new InvoiceLine(ItemName,ItemPrice,ItemCount,Invoice);
       Invoice.addInvoiceLines(invoiceLine);
       invoiceLinesTableModel.fireTableDataChanged();
       invoiceHeaderTableModel.fireTableDataChanged();
       InvoiceTotalLabel.setText(""+Invoice.getInvoiceHeaderTotal());
        displayInvoicesHeader();
    }

    private void createLineCancel() {
       LineDialog.setVisible(false);
       LineDialog.dispose();
       LineDialog=null;
    }

    private void deleteLine() {
       int LineIndexSelected=InvoiceItemsTable.getSelectedRow();
       InvoiceLine Invoice =invoiceLinesTableModel.getInvoiceLines().get(LineIndexSelected);
       invoiceLinesTableModel.getInvoiceLines().remove(LineIndexSelected);
       invoiceLinesTableModel.fireTableDataChanged();
       invoiceHeaderTableModel.fireTableDataChanged();
       InvoiceTotalLabel.setText(""+Invoice.getInvoiceHeader().getInvoiceHeaderTotal());
       displayInvoicesHeader();
    }

    private void deleteInvoice() {
       int HeaderIndexSelected=InvoicesTable.getSelectedRow();
       InvoiceHeader Header=invoiceHeaderTableModel.getInvoicesList().get(HeaderIndexSelected);
       invoiceHeaderTableModel.getInvoicesList().remove(HeaderIndexSelected);
       invoiceHeaderTableModel.fireTableDataChanged();
       invoiceLinesTableModel = new InvoiceLinesTableModel(new ArrayList<InvoiceLine>());
       InvoiceItemsTable.setModel(invoiceLinesTableModel);
       invoiceLinesTableModel.fireTableDataChanged();
       InvoiceNumberLabel.setText("");
       InvoiceDateTextField.setText("");
       CustomerNameTextField.setText("");
       InvoiceTotalLabel.setText("");
       displayInvoicesHeader();
       
    }
    private void displayInvoicesHeader(){
        System.out.println("**************");
        for (InvoiceHeader invoiceHeader : InvoicesList){
            System.out.println(invoiceHeader);
        }
        System.out.println("**************");
    }

 
}
