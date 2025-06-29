
// =========== RightAngleTriangleInvertedSymbol ============
// *****
//  ****
//   ***
//    **
//     *

import java.util.Scanner;

public class RightAngleTriangleInvertedSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows : ");

        int num = sc.nextInt();
        System.out.println("=========== RightAngleTriangleInvertedSymbol ============");

        for (int i = 0; i <num; i++) {
            // Print spaces where stars were earlier
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }

            // Print stars where spaces were
             for (int k = i; k < num; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
