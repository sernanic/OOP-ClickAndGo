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
     
    private String Username;
    private String Password;
    private ProductList pl;
    private Users user;
    
}
