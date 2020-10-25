package pr;
import java.io.*;
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.color = "red";
        this.filled = false;
        this.width = 2.0;
        this.length = 2.0;
    }
    public Rectangle(double width, double length){
        this.color = "red";
        this.filled = false;
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double area = this.length * this.width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * this.width + 2 * this.length;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
