/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinvoicegenerator.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DELL
 */
public class InvoiceLinesTableModel extends AbstractTableModel{

   private List<InvoiceLine> InvoiceLines;
   private DateFormat DF =new SimpleDateFormat("dd-MM-yyyy");
    public InvoiceLinesTableModel(List<InvoiceLine> InvoiceLines ) {
        this.InvoiceLines=InvoiceLines;
    }

    public List<InvoiceLine> getInvoiceLines() {
        return InvoiceLines;
    }
    

    @Override
    public int getRowCount() {
    return InvoiceLines.size();
    }

    @Override
    public int getColumnCount() {
       return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
       switch(columnIndex){
           case 0:
               return "Item Name";
           case 1:
               return "Item Price";
           case 2:
               return"Count";
           case 3:
               return "Item Total";
           default:
               return "";
       }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
         switch(columnIndex){
           case 0:
               return String.class;
           case 1:
               return Double.class;
           case 2:
               return Integer.class;
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
      InvoiceLine row =  InvoiceLines.get(rowIndex);
         switch(columnIndex){
           case 0:
               return row.getItemName();
           case 1:
               return row.getItemPrice();
           case 2:
               return row.getItemCount();
           case 3:
               return row.getInvoiceLineTotal();
           default:
               return "";
       }
    }

}
