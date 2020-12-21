package pr5;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Choice task(10 11 12): ");
        int choice =  s1.nextInt();
        if (choice == 9) {
            int a, b, val = 0;
            int[] array;
            Scanner s0 = new Scanner(System.in);
            System.out.print("volume 0: ");
            a = s0.nextInt();
            System.out.print("volume 1: ");
            b = s0.nextInt();
            array = new int[a+b];
            for (int z = 0; z <= a+b; z++) {
                for (int x = 0; x <= b; x++) {
                    array[z] = 1;
                }
                for (int y = 0; y <= a; y++) {
                    array[z] = 0;
                }
            }
        }
        else if (choice == 10) {
            Scanner s2 = new Scanner(System.in);
            System.out.print("Input value:");
            int value = s2.nextInt();
            int a = func_value(value, 0);
            System.out.println(a);
        } else if (choice == 11) {
            int value1, counter_zero = 0, counter_one = 0;
            Scanner s3 = new Scanner(System.in);
            while (counter_zero != 2) {
                value1 = s3.nextInt();
                if (value1 == 1) counter_one++;
                if (value1 == 0) counter_zero++;
                else counter_zero = 0;
            }
            System.out.println(counter_one);
        } else {
            func_12();
        }
    }
    public static int func_value(int val, int val1){
        val1 = 10*val1 + val % 10;
        val = val/10;
        if (val == 0) return val1; else return func_value(val, val1);
    }
    public static void func_12 (){
        Scanner s4 = new Scanner(System.in);
        int value1, counter_zero = 0, counter_value = 0, counter = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (counter_zero != 1) {
            value1 = s4.nextInt();
            if (value1%2 == 1){
                array.add(counter_value, value1);
                counter_value++;
            }
            if (value1 == 0) counter_zero++;
        }
        for(int x = 0; x < counter_value; x++){
            System.out.println(array.get(x));
        }
    }
}
