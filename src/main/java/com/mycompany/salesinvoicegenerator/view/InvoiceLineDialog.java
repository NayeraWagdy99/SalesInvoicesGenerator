/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinvoicegenerator.view;

import com.mycompany.salesinvoicegenerator.InvoiceSalesJFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class InvoiceLineDialog extends JDialog{
    private JTextField itemNameTF;
    private JTextField itemPriceTF;
    private JTextField itemCountTF;
    private JLabel itemNameLBL;
    private JLabel itemPriceLBL;
    private JLabel itemCountLBL;
    private JButton okButton;
    private JButton cancelButton;

    public InvoiceLineDialog(InvoiceSalesJFrame Frame) {
       itemNameLBL= new JLabel("Item Name:");
       itemNameTF=new JTextField(20);
       itemPriceLBL= new JLabel("Item Price");
       itemPriceTF = new JTextField(20);
       itemCountLBL= new JLabel("Item Count:");
       itemCountTF= new JTextField(20);
       cancelButton= new JButton("Cancel");
       okButton = new JButton ("Ok");
       okButton.setActionCommand("CreateLineOk");
       cancelButton.setActionCommand("CreateLineCancel");
       okButton.addActionListener(Frame);
       cancelButton.addActionListener(Frame);  
       setLayout(new GridLayout(4,2));
       add(itemNameLBL);
       add(itemNameTF);
       add(itemPriceLBL);
       add(itemPriceTF);
       add(itemCountLBL);
       add(itemCountTF);
       add(okButton);
       add(cancelButton);
       pack();
     
    }

    public JTextField getItemNameTF() {
        return itemNameTF;
    }

    public JTextField getItemPriceTF() {
        return itemPriceTF;
    }

    public JTextField getItemCountTF() {
        return itemCountTF;
    }
    
}
