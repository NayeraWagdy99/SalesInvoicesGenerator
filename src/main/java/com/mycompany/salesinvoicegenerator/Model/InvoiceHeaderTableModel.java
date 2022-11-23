/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinvoicegenerator.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author DELL
 */
public class InvoiceHeaderTableModel extends AbstractTableModel {
   private List<InvoiceHeader> InvoicesList;
   private DateFormat DF =new SimpleDateFormat("dd-MM-yyyy");
    public InvoiceHeaderTableModel(List<InvoiceHeader> InvoicesList ) {
        this.InvoicesList=InvoicesList;
    }

    public List<InvoiceHeader> getInvoicesList() {
        return InvoicesList;
    }
    

    @Override
    public int getRowCount() {
    return InvoicesList.size();
    }

    @Override
    public int getColumnCount() {
       return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
       switch(columnIndex){
           case 0:
               return "Invoice Number";
           case 1:
               return "Invoice Date";
           case 2:
               return"Customer Name";
           case 3:
               return "Invoice Total";
           default:
               return "";
       }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
         switch(columnIndex){
           case 0:
               return Integer.class;
           case 1:
               return String.class;
           case 2:
               return String.class;
           case 3:
               return Double.class;
           default:
               return Object.class;
       }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      InvoiceHeader row =  InvoicesList.get(rowIndex);
         switch(columnIndex){
           case 0:
               return row.getInvoiceNumber();
           case 1:
               return DF.format(row.getInvoiceDate());
           case 2:
               return row.getCustomerName();
           case 3:
               return row.getInvoiceHeaderTotal();
           default:
               return "";
       }
    }


    
}
