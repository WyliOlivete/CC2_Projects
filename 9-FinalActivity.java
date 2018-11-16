//ACTIVITY OLIVETE

package facorfib;

import java.util.Scanner;
public class FinalActivity {

    public static void main(String[] args) {
        display();
    }
    
    public static void display() {
        System.out.println("What do you want to get? factorial/fibonacci?");
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        
        while(!operation.equals("factorial") && !operation.equals("fibonacci")) {
            System.out.println("What do you want to get? factorial/fibonacci?");
            sc = new Scanner(System.in);
            operation = sc.next();
        }
        
        System.out.println("Enter size of array:");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
            if (operation.equals("factorial")) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("f(" + arr[i] + ")\t");
                }
                System.out.print("\n");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(fact(arr[i]) + "\t");
                }
            } else if (operation.equals("fibonacci")) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("f(" + arr[i] + ")\t");
                }
                System.out.print("\n");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(fib(arr[i] + 1) + "\t");
                }
            }
    }
    
    public static int fact(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
    
    public static int fib(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n-2) + fib(n-1);
        }
    }
    
}
