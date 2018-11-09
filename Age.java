
package age;

//Activity 2 OLIVETE CARANTO

import static java.lang.Double.isNaN;
import java.util.Scanner;
public class Age {

    public static void main(String[] args) {
        int age;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        if (sc.hasNextInt()){
            age = sc.nextInt();
            
            if (age < 0){
                System.out.println("no negative age");
            } else if (age <= 2){
                System.out.println("baby");
            } else if (age <= 5) {
                System.out.println("toddler");
            } else if (age <= 12) {
                System.out.println("kid");
            } else if (age <= 18) {
                System.out.println("teen");
            } else if (age <= 59) {
                System.out.println("adult");
            }
        } else {
            System.out.println("invalid input");
        }
    }

}
