/**
 * @(#)Dim2.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Graded_Activity_7;
import java.util.*;   
import java.lang.Math;
public class Kimmakim_Dim2 {

            public static int getRandomIntegerBetweenRange(int min, int max){
            int x=(int)(Math.random()*(max-min+1)+min);
            return x;
            }

            public static boolean is_prime(int num) {
            int i=2;
            boolean flag = false;
                while (i<=num/2) {
                    if (num%i==0) {
                    flag=true;break;
                    }
                        ++i;
                    }
                    return flag;
            }

            public static void sum_of_primes(int[][] mat,int row,int col) {
            int sum=0;
                for (int i=0;i<row;i++) {
                    for (int j=0;j<col;j++) {
                        if (!is_prime(mat[i][j]))
                            sum+=mat[i][j];
                    }
                }
                System.out.println(sum);
            }

            public static void main_diagonal(int[][] mat,int row,int col) {
                for (int i=0;i<row;i++) {
                    System.out.print(mat[i][i]);
                    System.out.print(" ");
                }
                System.out.println();
            }


            public static void sum_below_diagonal(int[][] mat,int row,int col){
            int sum=0;
                for (int i=0;i<row;i++) {
                    for (int j=0;j<col;j++) {
                        if (i>j)
                            sum+=mat[i][j];
                    }
                }
                System.out.println(sum);
            }


            public static void sum_above_diagonal(int[][] mat,int row,int col){
            int sum=0;
                for (int i=0;i<row;i++) {
                    for (int j=0;j<col;j++) {
                        if (i<j)
                            sum += mat[i][j];
                    }
                }
                System.out.println(sum);
            }

            public static void odd_below_diagonal(int[][] mat,int row,int col){
            Set<Integer> hash_Set = new HashSet<Integer>();
                for (int i=0;i<row;i++) {
                    for (int j=0;j<col;j++) {
                        if (i>j && mat[i][j]%2==1){
                            if(!hash_Set.contains(mat[i][j])){
                                System.out.print(mat[i][j]);
                                System.out.print(" ");
                                hash_Set.add(mat[i][j]);
                            }
                        }
                    }
                }
            System.out.println();
            }

            public static void even_above_diagonal(int[][] mat,int row,int col){
            Set<Integer> hash_Set = new HashSet<Integer>();
                for (int i=0;i<row;i++) {
                    for (int j=0;j<col;j++) {
                        if (i<j && mat[i][j]%2==0){
                            if(!hash_Set.contains(mat[i][j])){
                                System.out.print(mat[i][j]);
                                System.out.print(" ");
                                hash_Set.add(mat[i][j]);
                            }
                        }
                    }
                }
            System.out.println();
            }

            public static void print_array(int[][] mat,int row,int col) {
                for (int i=0;i<row;i++) {
                    for (int j=0;j<col;j++) {
                        System.out.print(mat[i][j]);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }

            public static void main(String[] args) {
            int row=5,col=5;
            int[][] mat=new int[row][col];
            for (int i=0;i<row;i++) {
                for (int j=0;j<col;j++) {
                    mat[i][j]=getRandomIntegerBetweenRange(10,75);
                }       
            }

                System.out.println("Output the array elements");
                print_array(mat,row,col);
                System.out.println("Output the sum of prime numbers in the array.");
                sum_of_primes(mat,row,col);
                System.out.println("Output the elements in the main daigonal.");
                main_diagonal(mat,row,col);
                System.out.println("Output the sum of the elements below the diagonal.");
                sum_below_diagonal(mat,row,col);
                System.out.println("Output the sum of the elements above the diagonal.");
                sum_above_diagonal(mat,row,col);
                System.out.println("Output the odd numbers below the diagonal.");
                odd_below_diagonal(mat,row,col);
                System.out.println("Output the even numbers above the diagonal.");
                even_above_diagonal(mat,row,col);



    }
}