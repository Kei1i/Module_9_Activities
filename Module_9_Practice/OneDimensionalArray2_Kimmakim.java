/**
 * @(#)OneDimensionalArray2.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_9_Practice;
import java.util.Scanner;
public class OneDimensionalArray2_Kimmakim {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
            int N, temp;
            System.out.print("Enter array size: ");
            N=input.nextInt();  

            int num[]=new int[N];    
            System.out.println("The array elements:"); 
            for (int i=0;i<N;i++){
                num[i]=input.nextInt();
            }

            System.out.print("Original Array: ");
            for (int i=0;i<N;i++){
                System.out.print(num[i]+" ");
            }

            for (int i=0;i<N;i++){
                for (int j=i+1;j<N;j++){
                    if (num[i]>num[j]){
                        temp=num[i];
                        num[i]=num[j];
                        num[j]=temp;
                    }
                }
            }

            System.out.print("\nAscending Order: ");   
            for (int i = 0; i < N ; i++){
                System.out.print(num[i]+"  ");
            }

            for (int i=0;i<N;i++){
                for (int j=i+1;j<N;j++){
                    if (num[i]<num[j]){
                        temp=num[i];
                        num[i]=num[j];
                        num[j]=temp;
                    }
                }
            }

            System.out.print("\nDescending Order: ");  
            for (int i=0;i<N;i++){
                System.out.print(num[i]+" ");
            }

            
    }
}