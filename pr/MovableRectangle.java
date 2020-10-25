package pr;
import java.io.*;
public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.bottomRight.x = x1;
        this.bottomRight.y = y1;
        this.topLeft.x = x2;
        this.topLeft.y = y2;
        this.topLeft.ySpeed = ySpeed;
        this.topLeft.xSpeed = xSpeed;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    public void movedDown(){
        this.topLeft.y = this.topLeft.y - this.topLeft.ySpeed;
        this.bottomRight.y = this.bottomRight.y - this.bottomRight.ySpeed;
    }
    public void moveUp(){
        this.topLeft.y = this.topLeft.y + this.topLeft.ySpeed;
        this.bottomRight.y = this.bottomRight.y + this.bottomRight.ySpeed;
    }
    public void moveLeft(){
        this.topLeft.x = this.topLeft.x - this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x - this.bottomRight.xSpeed;
    }
    public void moveRight(){
        this.topLeft.x = this.topLeft.x + this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x + this.bottomRight.xSpeed;
    }
}