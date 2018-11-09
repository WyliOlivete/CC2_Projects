//ACTIVITY 1 - OLIVETE, CARANTO
package areas;

import java.util.Scanner;
public class Areas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        
        System.out.print("Enter circle radius: ");
        double r = sc.nextDouble();
        result = Math.PI * Math.pow(r, 2);
        System.out.print("Circle area is " + result);
        
        System.out.print("\n\nEnter square side length: ");
        r = sc.nextDouble();
        result = Math.pow(r, 2);
        System.out.print("Square area is " + result);
       
        System.out.print("\n\nEnter triangle base: ");
        r = sc.nextDouble();
        System.out.print("Enter triangle height: ");
        double s = sc.nextDouble();
        result = 0.5 * r * s;
        System.out.println("Triangle area is " + result);
        
    }
    
}
