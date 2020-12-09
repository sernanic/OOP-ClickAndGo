/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.*;

/**
 *
 * @author 19546
 */
public class Inventory {
    private static Inventory allProdsInstance = null;
    
    private Inventory(){}
    
    public static Inventory getInstance() 
    { 
        if (allProdsInstance == null) 
            allProdsInstance = new Inventory(); 
  
        return allProdsInstance; 
    }
    
    public void addToAllProds(Product P){
    
        allProds.add(P);
    }
    
    public ArrayList<Product> getAllProds(){
    
        return allProds;
    }
    
    private static ArrayList<Product> allProds;
}
