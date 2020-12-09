package Main;
import java.util.*;


public class ShoppingCart implements ProductList
        
{
    
    public void addProduct(Product P){
    
        cart.add(P);
    }
    
    public void removeProduct(Product P){
    
        if(cart.contains(P)){
        
            cart.remove(P);
        }
    }
    private ArrayList<Product> cart;
  

}