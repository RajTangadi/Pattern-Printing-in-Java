import java.util.Scanner;

//pyramid pattern

public class Loop {
    public static void main(String[] args) {
        System.out.print("Enter the no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 0; i <= row; i++) { // traversing over rows

            // print r -i spaces
            for (int j = 1; j <= row - 1; j++) {
                System.out.print(" ");
            }
            // print 2*i - 1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
