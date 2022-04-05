/**
 * @(#)TwoDimensionalArray.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_9_Practice;
import java.util.*;
public class TwoDimensionalArray_Kimmakim {
   public static void main(String[] args) {

       int[][] arr = new int[5][5];
       Random rand = new Random();

            for(int i=0;i<5;i++) {
                for(int j=0;j<5;j++) {
                    arr[i][j] = rand.nextInt(10);
                }
            }

            System.out.println("The array elements:");
            for(int i=0;i<5;i++) {
                for(int j=0;j<5;j++) {
                    System.out.print(arr[i][j]+"\t");
                }
            System.out.println();
            }

            System.out.println("\n");
            System.out.println("Output the sum of each row:");
            for(int i=0;i<5;i++) {
                int count = 0;
                System.out.printf("The row %d elements sum:",i);
                for(int j=0;j<5;j++) {
                    count = count + arr[i][j];
                }
            System.out.println(count);
            }

            System.out.println("\n");
            System.out.println("Output the sum of each column:");
            for(int i=0;i<5;i++) {

                int count = 0;
                System.out.printf("The Column %d elements sum:",i);
                for(int j=0;j<5;j++) {
                    count = count + arr[j][i];
                    }
            System.out.println(count);
            }

            System.out.println("\n");
            int count = 0;
            System.out.print("The Sum of all elements:");
            for(int i=0;i<5;i++) {
                for(int j=0;j<5;j++) {
                    count = count + arr[i][j];
                    }
            }
            
            System.out.println(count);
            System.out.println("\n");

       

   }
}
