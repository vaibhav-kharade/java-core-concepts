import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int num = scanner.nextInt();
        System.out.println("=========== RightAngleTriangle ============");

        for (int i = 0; i <= num; i++) {
            //This is my outr loop for lines / rows
            for (int j = 0; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
