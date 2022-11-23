/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinvoicegenerator.Model;

/**
 *
 * @author DELL
 */
public class InvoiceLine {
    private String ItemName;
    private double ItemPrice;
    private int ItemCount;
    private InvoiceHeader invoiceHeader;

    public InvoiceLine(String ItemName, double ItemPrice, int ItemCount, InvoiceHeader invoiceHeader) {
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemCount = ItemCount;
        this.invoiceHeader = invoiceHeader;
    }
    
   
    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int ItemCount) {
        this.ItemCount = ItemCount;
    }

    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "ItemName=" + ItemName + ", ItemPrice=" + ItemPrice + ", ItemCount=" + ItemCount + '}';
    }
    
    public double getInvoiceLineTotal(){
        return ItemCount*ItemPrice;
    }
    public String getDataAsCSVForLines(){
        return "" + getInvoiceHeader().getInvoiceNumber() + "," + getItemName() + "," + getItemPrice() + "," + getItemCount(); 
    }
}
