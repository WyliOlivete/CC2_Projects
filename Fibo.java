//Finals Activity 1 - OLIVETE

package fibo;

import java.util.Scanner;
public class Fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number: ");
        
        int num = sc.nextInt() + 1;
        
        display(num);
    }
    
    public static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else if (i > 1) {
            return (fibonacci(i-1) + fibonacci(i-2));
        } else return 0;
    }
    
    public static void display(int num) {
            for (int j = 0; j < num; j++) {
                System.out.print("f("+j+")\t");
            }
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(fibonacci (j) + "\t");
            }
            System.out.print("\n");
        }
    }
    
}
