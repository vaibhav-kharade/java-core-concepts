import java.util.Scanner;

// ==================== Hollo Square Pattern of * =====================
//  * * * *
//  *     *
//  *     *
//  * * * *

public class HolloSquare{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("==================== Hollo Square Pattern of * =====================");

        for (int i = 1; i<=num; i++) {
            //This is outer loop of lines / rows

             for (int j = 1; j<=num; j++) {
                //This is inner loop for Columns

                if (i==1 || j==1 || i==num || j==num){  
                    System.out.print(" *");   
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}