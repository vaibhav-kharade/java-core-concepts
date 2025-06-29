import java.util.Scanner;

public class InvertedNumberRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows : ");
        int num = sc.nextInt();
        System.out.println("=========== InvertedNumberRightAngleTriangle ============");
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i+1; j++) {
                System.out.print(j);
            }    
            System.out.println();
        }
    }
}
