package pr6;
import java.util.*;
public class Student {
    private String name;
    private int gpa;
    Student(){
        gpa = 0 + (int) (Math.random() * 100);
        if (gpa < 100) name = "Michael";
        else if (gpa < 80) name = "Dmitriy";
        else if (gpa < 60) name = "Jhon";
        else if (gpa < 40) name = "Salam";
        else if (gpa < 20) name = "Albert";
    }
    public int getGpa(){
        return gpa;
    }
}