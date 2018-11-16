//ACTIVITY 6 OLIVETE, Wyli Charles L.
package multidarray;

import java.util.Scanner;
public class MultiDArray {

    public static void main(String[] args) {
        /*
        int rows = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        rows = sc.nextInt();
        
        int columns[] = new int[rows];
        
        for (int i = 0; i < rows; i++) {
            System.out.print("Input number of columns for row " + i + ": ");
            columns[i] = sc.nextInt();
        }
        
        String [][] arr = new String[rows][columns];
        
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Input string value for item [" + i + ", " + j + "]: ");
                arr[i][j] = sc.next();
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row[] = new int[sc.nextInt()];
        int column[] = new int[row.length];
        
        for (int i = 0; i < row.length; i++) {
            System.out.print("Enter column size for row: " + i + ": ");
            column[i] = sc.nextInt();
        }
        
        int mostColumns = 0;
        for (int i = 0; i < column.length; i++) {
            if (column[i] > mostColumns) {
                mostColumns = column[i];
            }
        }
        
        String arr[][] = new String[row.length][mostColumns];
        
        System.out.print("Enter elements:\n");
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column[i]; j++) {
                System.out.print("Row " + i + " " + "Column " + j + ": ");
                arr[i][j] = sc.next();
            }
        }
        
        System.out.println();
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column[i]; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
