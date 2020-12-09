/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.*;

/**
 *
 * @author 19546
 */
public class Profit_RevenueController {
    
    public double updateProfit(){
    
        return sel.getProfit();
        
    }
    public double updateRevenue(){
    
        return sel.getRevenue();
    }
    private Inventory all = Inventory.getInstance();
    private Seller sel;

}
