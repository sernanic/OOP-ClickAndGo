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
public class WishList implements ProductList {
    public void addProduct(Product P){
    
        wishlist.add(P);
        
    }
    
    public void removeProduct(Product P){
    
        if(wishlist.contains(P)){
        
            wishlist.remove(P);
        }
    }
    private ArrayList<Product> wishlist;
}
