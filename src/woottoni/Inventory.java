/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woottoni;

/**
 *
 * @author Nick
 */
public class Inventory {
    
    //max length for the id field
    final int MAX_ID_LENGTH = 8;
    
    //
    String id;
    
    //
    String name;
    
    //
    int qoh;
    
    //
    int rop;
    
    //
    double sellPrice;
    
    public Inventory(){}
    
    public Inventory(String id, String name, double sellPrice){
        
    }
    
    public Inventory(String id, String name, int qog, int rop, double sellPrice){
        
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        if(this.id.length()==MAX_ID_LENGTH &&
                this.id.charAt(0)){
            
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        
    }
    
    public int getQoh(){
        return this.qoh;
    }
    
    public void setQoh(int qoh){
        
    }
    
    public int getRop(){
        return this.rop;
    }
    
    public void setRop(int rop){
        
    }
    
    public double getSellPrice(){
        return this.sellPrice;
    }
    
    public void setSellPrice(double sellPrice){
        
    }
    
    public String toString(){
        return String.format("id: id=%.1f", id
                + "name: name=%.1f", name
                + "qoh: qoh=%.1f", qoh
                + "rop: rop=%.1f", rop
                + "sellPrice: sellPrice=%.1f", sellPrice);
    }
}
