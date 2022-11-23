/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinvoicegenerator.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class InvoiceHeader {
    private int InvoiceNumber;
    private Date InvoiceDate;
    private String CustomerName;
    private ArrayList<InvoiceLine> InvoiceLines;


    public InvoiceHeader(int InvoiceNumber, Date InvoiceDate, String CustomerName) {
        this.InvoiceNumber = InvoiceNumber;
        this.InvoiceDate = InvoiceDate;
        this.CustomerName = CustomerName;
      
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(int InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    @Override
    public String toString() {
        String Str="InvoiceHeader{" + "InvoiceNumber=" + InvoiceNumber + ", InvoiceDate=" + InvoiceDate + ", CustomerName=" + CustomerName + '}';
        for (InvoiceLine invoiceLine: getInvoiceLines()){
            Str += "\n\t"+invoiceLine;
        }
        return Str;
    }

    public ArrayList<InvoiceLine> getInvoiceLines() {
        if(InvoiceLines==null)
            InvoiceLines= new ArrayList<>();
   
        return InvoiceLines;
    }

    public void setInvoiceLines(ArrayList<InvoiceLine> InvoiceLines) {
        this.InvoiceLines = InvoiceLines;
    }
    public double getInvoiceHeaderTotal(){
        double Total =0.0;
        for(InvoiceLine Line:getInvoiceLines()){
            Total = Total+Line.getInvoiceLineTotal();
        }
        return Total;
    }
    public void addInvoiceLines(InvoiceLine lines){
        getInvoiceLines().add(lines);
        
    }
      public String getDataAsCSVForHeaders(){
       DateFormat DF =new SimpleDateFormat("dd-MM-yyyy");
        return "" + getInvoiceNumber() + "," + DF.format(getInvoiceDate()) + "," + getCustomerName();
    }
    
}
