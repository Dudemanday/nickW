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
    
    int height = 3;
    
    public Box(){
        
    }
    
    public double calcArea(){
        return height * width * 2 + height * length * 2 + length * width * 2;
    }
    
    public double calcVolume(){
        return super.calcArea() * height;
    }
}
