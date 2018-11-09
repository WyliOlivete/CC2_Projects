//ACTIVITY 5 OLIVETE
package arrayoddeven;

public class ArrayOddEven {

    public static void main(String[] args) {
        //int [] values = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21};
        int [] values = {2, 4, 6, 8, 3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21};
        String tempStr = "\n\nEVEN\tODD\n";
        
        System.out.println("Elements of Array");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + "\t");
        }
        
        //Sort
        int lastOddNum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                tempStr += values[i] + "\t";
                if (lastOddNum < values.length) {
                    for (int j = lastOddNum; j < values.length; j++) {
                        if (values[j] % 2 != 0) {
                            tempStr += values[j] + "\n";
                            lastOddNum++;
                            break;
                        } else {
                            lastOddNum++;
                        }
                    }
                } else {
                    tempStr += "\n";
                }
            }
        }
        if (lastOddNum < values.length) {
            tempStr += "\t";
            for (int j = lastOddNum; j < values.length; j++) {
                if (values[j] % 2 != 0) {
                    tempStr += values[j] + "\n";
                    lastOddNum++;
                    break;
                } else {
                    lastOddNum++;
                }
            }
        }
        
        System.out.print(tempStr);
    }
    
}
