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
public class Sphere extends Circle implements ThreeD{

    public Sphere() {
        super();
    }

    public Sphere(double radius) {
        super(radius);
    }

    public double calcArea() {
        return 4 * super.calcArea();
    }

    public double calcVolume() {
        return 4.0 / 3.0 * getRadius() * super.calcArea();
    }

}
