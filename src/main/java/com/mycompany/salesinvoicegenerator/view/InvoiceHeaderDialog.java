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
public class InvoiceHeaderDialog extends JDialog{
    private JTextField CustomerNameTF;
    private JTextField InvoiceDateTF;
    private JLabel CustomerNameLBL;
    private JLabel InvoiceDateLBL;
    private JButton okButton;
    private JButton cancelButton;

    public InvoiceHeaderDialog(InvoiceSalesJFrame Frame) {
        CustomerNameLBL = new JLabel("Customer Name:");
        CustomerNameTF = new JTextField(20);
        InvoiceDateLBL= new JLabel("Invoice Date:");
        InvoiceDateTF = new JTextField(20);
        cancelButton= new JButton("Cancel");
        okButton = new JButton ("Ok");
        okButton.setActionCommand("CreateInvoiceOk");
        cancelButton.setActionCommand("CreateInvoiceCancel");
        okButton.addActionListener(Frame);
        cancelButton.addActionListener(Frame);
        setLayout(new GridLayout(3,2));
        add(CustomerNameLBL);
        add(CustomerNameTF);
        add(InvoiceDateLBL);
        add(InvoiceDateTF);
        add(okButton);
        add(cancelButton);
        pack();     
    }

    public JTextField getCustomerNameTF() {
        return CustomerNameTF;
    }

    public JTextField getInvoiceDateTF() {
        return InvoiceDateTF;
    }
    
    
}
