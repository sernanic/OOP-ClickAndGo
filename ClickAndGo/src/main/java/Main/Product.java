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

    public Product(String name, int quantity, double price, double revenue, double sales) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.revenue = revenue;
        this.sales = sales;
        
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getProfit() {
        double temp = this.getRevenue()- this.getSales();
        return temp;
    }

    
    
    private String name;
    private int quantity;
    private double price;
    private double revenue;
    private double sales;
    
    
}
