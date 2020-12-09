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
public class Users{
    
    private static Users userInstance = null;
    
    private Users(){}
    
    public void addUser(User u){
    
        this.users.add(u);
    }
    
    public boolean checkUN(String user){
        
        boolean temp = false;
    
        for(User un:users){
        
            if(un.getUsername() == user){
            
                temp = true;
            }else{
                temp = false;}
        }
        
        return temp;
    }
    
    public boolean validateLogin(String user, String pass){
        
        boolean val = false;
    
        if(this.checkUN(user)){
        
            int temp = user.indexOf(user);
            if(users.get(temp).getPassword() == pass){
            
                val = true;
            }
        }
        return val;
    }
    
    public static Users getInstance() 
    { 
        if (userInstance == null) 
            userInstance = new Users(); 
  
        return userInstance; 
    }
    
    private ArrayList<User> users;
    
    
    
}
