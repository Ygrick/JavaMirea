package pr5;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value:");
        int value =  sc.nextInt();
        int a = func_value(value, 0);
        System.out.println(a);
    }
    public static int func_value(int val, int val1){
        val1 = 10*val1 + val % 10;
        val = val/10;
        if (val == 0) return val1; else return func_value(val, val1);
    }
}
