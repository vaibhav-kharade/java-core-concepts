import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter a value : ");
        int num = scanner.nextInt();
        System.out.println("==================== Square Pattern of * =====================");

        for(int i =0; i<=num; i++){
            //This is outer loop of lines / rows
            for (int j = 0; j <= num; j++) {
                //This is Inner loop for Columns
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
