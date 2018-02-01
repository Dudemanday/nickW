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
    final int ID_LENGTH = 8;
    
    //stores the - character to be used in comparing 
    //to a character in the ID string
    final String DASH = "-";
    
    //
    final int MIN_NAME_LENGTH = 1;
    
    //
    final int MIN_QOH = 0;
    
    //
    final int MIN_ROP = 0;
    
    //
    final int MIN_SELLPRICE = 0;
    
    //
    String id = "ABC-1234";
    
    //
    String name = "New Item";
    
    //
    int qoh = 0;
    
    //
    int rop = 25;
    
    //
    double sellPrice = 0;
    
    public Inventory(){}
    
    public Inventory(String id, String name, double sellPrice){
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
    }
    
    public Inventory(String id, String name, int qog, int rop, double sellPrice){
        this.id = id;
        this.name = name;
        this.qoh = qoh;
        this.rop = rop;
        this.sellPrice = sellPrice;
        
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        if(id.length()==ID_LENGTH &&
                Character.isLetter(id.charAt(0)) &&
                Character.isLetter(id.charAt(1)) &&
                Character.isLetter(id.charAt(2)) &&
                DASH.equals(id.charAt(3)) &&
                Character.isDigit(id.charAt(4)) &&
                Character.isDigit(id.charAt(5)) &&
                Character.isDigit(id.charAt(6)) &&
                Character.isDigit(id.charAt(7))){
            this.id = id;
        } else {
            System.out.println("Error, ID must be in the form 'ABC-1234'.");
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        if(name.length() >= MIN_NAME_LENGTH){
            this.name = name;
        } else {
            System.out.println("Error, name length must be greater than zero.");
        }
    }
    
    public int getQoh(){
        return this.qoh;
    }
    
    public void setQoh(int qoh){
        if(qoh > MIN_QOH){
            this.qoh = qoh;
        } else {
            System.out.println("Error, quantity on hand must be greater than zero.");
        }
    }
    
    public int getRop(){
        return this.rop;
    }
    
    public void setRop(int rop){
        if(rop > MIN_ROP){
            this.rop = rop;
        } else {
            System.out.println("Error, re order point must be greater than zero.");
        }
    }
    
    public double getSellPrice(){
        return this.sellPrice;
    }
    
    public void setSellPrice(double sellPrice){
        if(sellPrice > MIN_SELLPRICE){
            this.sellPrice = sellPrice;
        } else {
            System.out.println("Error, sell price must be greater than zero.");
        }
        
    }
    
    public String toString(){
//        return String.format("id: id=%.1f", id
//                + "name: name=%.1f", name
//                + "qoh: qoh=%.1f", qoh
//                + "rop: rop=%.1f", rop
//                + "sellPrice: sellPrice=%.1f", sellPrice);
        return String.format(this.id + " (" + this.name + "), QOH: "
                + qoh + " Price: $ %3.2f", this.sellPrice);
    }
}
