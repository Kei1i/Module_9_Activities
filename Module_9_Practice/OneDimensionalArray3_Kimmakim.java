/**
 * @(#)OneDimensionalArray3.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_9_Practice;
import java.util.Scanner; 
public class OneDimensionalArray3_Kimmakim{
        public static void main(String[] args){
                Scanner input=new Scanner(System.in);  
                System.out.print("The array size: "); 

                int size=input.nextInt(); 
                int [] arr = new int[size]; 

                System.out.print("Array elements:");

                for(int i=0;i<size;i++){
                        arr[i]=input.nextInt();
                }

                System.out.println("Enter an element found in the array: "); 
                int z=input.nextInt();
                for(int i=0;i<size;i++){
                        if(arr[i]==z){
                                System.out.print(i+" "); 
                        }
                        else{
                                continue;
                        }
                }
        }
}