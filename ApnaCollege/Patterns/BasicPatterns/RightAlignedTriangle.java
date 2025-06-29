import java.util.Scanner;


//     *
//    **
//   ***
//  ****
// *****

public class RightAlignedTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows : ");
        int num = sc.nextInt();
        System.out.println("=========== RightAlignedTriangle ============");

        for (int i = 0; i < num; i++) {
            for (int j = i; j < num-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
