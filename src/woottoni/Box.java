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
public class Box extends Rectangle implements ThreeD{
    
    private double height = 3;
    
    public Box(){
        
    }
    
    public Box(double length, double width, double height) {
        super(length, width);
        setHeight(height);
    }
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0){
            this.height = height;
        }else{
            throw new IllegalArgumentException("Error: height must be greater "
                + "than 0.");
        }
    }

    public double calcArea(){
        return 2 * super.calcArea() + 2 * getLength() * height 
            + 2 * getWidth() * height;
    }
    
    public double calcVolume(){
        return super.calcArea() * height;
    }
    
    public String toString() {
        return String.format("%s height=%.1f", super.toString(), height);
    }
}
