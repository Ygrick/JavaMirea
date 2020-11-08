package pr6;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int right = 5;
        Student[] students = new Student[right];
        int[] iDNumber = new int[10];
        int[] sort = new int[10];
        int random_number;
        for (int i = 0; i < 10; i++) {
            iDNumber[i] = 0 + (int) (Math.random() * 10);
        }
        for (int left = 0; left < iDNumber.length; left++) {
            int value = iDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < iDNumber[i]) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    break;
                }
            }
            iDNumber[i + 1] = value;
        }
        SortingStudentsByGPA sorts = new SortingStudentsByGPA();
        sorts.sorting(students, right, 0);
    }
}
