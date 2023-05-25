import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {

            // print r-i spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // print 1 to i
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // print i-1 to 1
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
