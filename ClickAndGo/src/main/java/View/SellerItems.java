/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcart.my_package;

import java.util.Hashtable;

/**
 *
 * @author nicolasserna
 */
public class SellerItems {
    //{itemName1:product1,itemNam2:product2,itemName3:product3}
    Hashtable<String, Product> allItems = new Hashtable<String, Product>();
    
    public Product getItemWithName(String itemName){
        return allItems.get(itemName);
    }
    public void addItem(Product newProduct){
        allItems.put(newProduct.productName, newProduct);
    }
    public Hashtable<String, Product> getAllItems(){
        return allItems;
    }
}
