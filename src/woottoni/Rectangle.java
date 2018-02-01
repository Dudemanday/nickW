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
public class Rectangle extends Shape {

    private double length = 1;
    private double width = 1;

    public Rectangle() {}

    public Rectangle(double length, double height) {

        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {

        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Error: length must be greater "
                    + "than 0.");
        }
    }

    public void setWidth(double width) {

        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Error: width must be greater "
                    + "than 0.");
        }
    }

    public double calcPerimeter() {
        return 2 * length + 2 * width;
    }

    public double calcArea() {
        return length * width;
    }

    public String toString() {
        return String.format("%s length=%.1f width=%.1f",
                super.toString(), length, width);
    }
}
