package pr;
import java.io.*;
public class Square extends Rectangle{
    public Square(){
        this.color = "red";
        this.filled = false;
        this.length = 2.0;
    }
    public Square(double side){
        this.color = "red";
        this.filled = false;
        this.length = side;
    }
    public Square(double side, String color, boolean filled){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }
    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}