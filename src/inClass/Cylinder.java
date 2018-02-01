/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inClass;

import inClass.ThreeD;

/**
 *
 * @author Nick
 */
class Cylinder extends Circle implements ThreeD{
    
    private double height = 1;

    public Cylinder() {
        super();
    }
    
    public Cylinder(double radius, double height){
        super(radius);
        setHeight(height);
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
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
        return 2 * super.calcArea() + height * calcCircumference();
    }
    
    public String toString(){
        return String.format("Circle: radius=%.1f", this.getClass().getSimpleName(), height);
    }
}
