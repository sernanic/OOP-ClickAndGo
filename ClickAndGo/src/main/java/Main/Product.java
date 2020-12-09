/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author 19546
 */
public class Product {

    public Product(String name, int quantity, double invoicePrice, double sellPrice) {
        this.name = name;
        this.quantity = quantity;
        this.invoicePrice = invoicePrice;
        this.sellPrice = sellPrice;
       
        
    }

    public double getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(double invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    
    public void printProduct(){
    
        System.out.print("Product Name: " + name + "\n" +
                          "Price: $" + quantity + "\n");
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




    
    
    private String name;
    private int quantity;
    private double invoicePrice;
    private double sellPrice;
    
    
}
