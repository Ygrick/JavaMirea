package pr;
import java.io.*;
public class Circle extends Shape{
    protected double radius;

    public Circle(){
        this.color = "red";
        this.filled = false;
        this.radius =  2.0;
    }
    public Circle(double  radius){
        this.color = "red";
        this.filled = false;
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = 3.14 * this.radius * this.radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * 3.14 * this.radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
