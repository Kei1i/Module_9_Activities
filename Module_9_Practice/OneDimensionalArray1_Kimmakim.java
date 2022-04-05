/**
 * @(#)OneDimensionalArray1.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_9_Practice;
import java.util.*;
public class OneDimensionalArray1_Kimmakim {
    public static void main(String[] args) {

        int[] list = new int[5];         
        int min = 0, max = 9;
        for (int i = 0; i < 5; i++)     
            list[i] = (int) (Math.random() * ((max - min) + 1)) + min;   
                System.out.println("Array elements are: " + Arrays.toString(list));     
                int count = 0;
                System.out.print("The median is: ");
        
                for (int i = 0; i < 5; i++) {
                    if (list[i] % 4 == 0) 
                        System.out.print(list[i] + " ");            
                    count++;
                }

                System.out.println("\n" + count + " The median is");       
                int sum = 0;        
                double avg = 0.0;  
                int large = list[0], small = list[0];    
                for (int i = 0; i < 5; i++) {
                    sum += list[i];            
                    if (large < list[i])
                        large = list[i];        
                    if (small > list[i])
                        small = list[i];        
                    avg = sum / 20;
        
                System.out.println("The sum is: " + sum);
                System.out.println("the Average is: " + avg);
                System.out.println("The biggest element is: " + large);
                System.out.println("The smallest element is: " + small);
            }
        }    
}