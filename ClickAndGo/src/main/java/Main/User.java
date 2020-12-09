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
public abstract class User {
    
    abstract public boolean validateLogin(String username, String password);
    public String getUsername(){
    
        return this.username;
    }
    
    public String getPassword(){
    
        return this.password;
    } 
    
    private String username;
    private String password;
    
    
}
