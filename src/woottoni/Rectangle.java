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
public class Rectangle extends Shape{
    
    int width = 1;
    int length = 5;
    
    public Rectangle() {
        calcArea();
    }

    @Override
    public double calcArea(){
        return width * length;
    }
    
    public double calcPerimeter(){
        return (width * 2 + length * 2);
    }
}
