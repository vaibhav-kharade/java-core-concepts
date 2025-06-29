import java.util.Scanner;


// =========== RightAngleTriangleNumbers ============
// 1
// 12
// 123
// 1234
// 12345

public class RightAngleTriangleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows: ");
        int num = sc.nextInt();
        System.out.println("=========== RightAngleTriangleNumbers ============");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
