/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inClass;

/**
 *
 * @author Nick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle cir = new Circle();
        Cylinder cyl = new (Cylinder)Circle();
        Rectangle rec = new Rectangle();
        Sphere sph = new Shpere();
        
        Shape[] shapes = new Shape[5];
        shapes[0] = cir;
        shapes[1] = cyl;
        shapes[2] = rec;
        shapes[3] = x;
        shapes[4] = y;
        
    }
    
    public static void displayShape(Shape c){
        System.out.println(c);
        System.out.printf("Area: %2.f%n", c.calcArea());
        if( c instanceof ThreeD) {
            ThreeD three = (ThreeD)c;
            System.out.printf("Volume %2.f%n", three.calcVolume());
        }
    }
}
