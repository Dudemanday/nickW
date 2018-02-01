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
class Cylinder extends Circle implements ThreeD{
    
    private double height = 1;

    public Cylinder() {
        super();
    }
    
    public Cylinder(double radius){
        setRadius(radius);
    }

    public double getheight(){
        return height;
    }

    public void setheight(double height){
        if(height > 0){
            this.height = height;
        } else {
            throw new IllegalArgumentException(
                    "Error, radius must be greater than zero. Radius: " + height);
        }
    }
    
    public double calcVolume(){
        return super.calcArea() * height;
    }
    
    public double calcArea(double height){
        return Math.PI * Math.pow(height, 2);
    }
    
    public String toString(){
        return String.format("Circle: radius=%.1f", this.getClass().getSimpleName(), height);
    }
}
