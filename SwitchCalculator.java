//Activity 2 OLIVETE CARANTO
package switchcalculator;

import java.util.Scanner;
public class SwitchCalculator {
    
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, result = 0;
        String operation = "";
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter operation: ");
        operation = sc.next().toLowerCase();
        
        switch(operation){
            case ("*") : {
                result = num1*num2;
                System.out.println("= " + result);
            } break;
            case ("multiply") : {
                result = num1*num2;
                System.out.println("= " + result);
            } break;
            case ("/") : {
                result = num1/num2;
                System.out.println("= " + result);
            } break;
            case ("divide") : {
                result = num1/num2;
                System.out.println("= " + result);
            } break;
            case ("+") : {
                result = num1+num2;
                System.out.println("= " + result);
            } break;
            case ("add") : {
                result = num1+num2;
                System.out.println("= " + result);
            } break;
            case ("-") : {
                result = num1-num2;
                System.out.println("= " + result);
            } break;
            case ("subtract") : {
                result = num1-num2;
                System.out.println("= " + result);
            } break;
            case ("%") : {
                result = num1%num2;
                System.out.println("= " + result);
            } break;
            case ("modulo") : {
                result = num1%num2;
                System.out.println("= " + result);
            } break;
        }
    }
    
}
