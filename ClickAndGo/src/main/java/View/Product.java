/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcart.my_package;

/**
 *
 * @author nicolasserna
 */
public class Product {
    String  price ="0";
    String  reviews = "0";
    String productDesc ="";
    String productName="";
    
    public String getPrice(){
        return price;
    }
    public String getReviews(){
        return reviews;
    }
   
    public String getProductName(){
        return productDesc;
    }
    public void setPrice(String setPrice){
        
        price = setPrice;
    }
    public void setReviews(String setReviews){
         reviews = setReviews;
    }
    
    public void setProductName(String setName){
        productName = setName;
    }
    public void setProductDesc(String setDesc){
        productDesc = setDesc;
    }
    
}
