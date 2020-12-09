/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author 19546
 */
public class Seller extends User{
    
     public Seller(String username, String password){
        
        this.Username = username;
    
        this.Password = password;
    }
    
    public String getUsername(){
    
        return this.Username;
    }
    
    public String getPassword(){
    
        return this.Password;
    }
    public boolean validateLogin(String username, String password){
    
     return user.validateLogin(username, password);
    }
    
    public void addProds(Product p){
    
        SellerProds.add(p);
        AllProds.addToAllProds(p);
    }
    
    public double getRevenue(){
    
        double temp = 0;
        
        for(Product p:SellerProds){
        
            temp += p.getSellPrice();
        }
        
        return temp;
    }
    
    public double getCosts(){
    
        double temp = 0;
        
        for(Product p:SellerProds){
        
            temp += p.getInvoicePrice();
        }
        
        return temp;
    }
    
    public double getProfit(){
    
        return this.getRevenue() - this.getCosts();
    }
    
   
     
    private String Username;
    private String Password;
    private ArrayList<Product> SellerProds;
    private Inventory AllProds = Inventory.getInstance();
    private Users user;
    private double Revenue;
    private double Costs;
    private double Profit;
    
}
