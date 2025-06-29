import java.util.Scanner;

public class ReverseRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        System.out.println("======= ReverseRightAngleTriangle =======");        

        for (int i = num; i >=1; i--) {
            // Outer loop controls the number of rows
            for (int j = 1; j <= i; j++) {
                // Inner loop prints stars in Columns
                System.out.print(" *");
            }
            System.out.println(); // Move to the next line

        }
    }
}
