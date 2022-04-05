/**
 * @(#)List.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Graded_Activity_7;
import java.util.Scanner;
import java.util.Random;
public class Kimmakim_List {
    public static void main(String[] strings) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input the number of elements: "); 
        int n = input.nextInt();
        int[] ListA= new int[n]; 
        int[] ListB= new int[n];
        int[] ListC= new int[n];
        Random random = new Random();

            for(int i=0; i<n; i++){
                ListA[i]=random.nextInt(90)+10;  
            }
            for(int i=0; i<n; i++){
                ListB[i]=random.nextInt(90)+10;  
            }  
            for(int i=0; i<n; i++){
                ListC[i]=ListA[i]*ListB[i];  
            }
            System.out.println("\tList A\tList B\t\tList C");

            for(int i=0; i<n; i++){
                System.out.println("\t "+ListA[i]+" \t "+ListB[i]+"\t\t "+ListC[i]);  
            }


    }
}