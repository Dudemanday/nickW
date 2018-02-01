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
public class Circle extends Shape{

    private double radius = 1;

    public Circle() {}
    
    public Circle(double radius){
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        } else {
            throw new IllegalArgumentException(
                    "Error, radius must be greater than zero. Radius: " + radius);
        }
    }
    
    public double calcCir(double radius){
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public String toString(){
        return String.format("Circle: radius=%.1f", this.getClass().getSimpleName(), radius);
    }
}
