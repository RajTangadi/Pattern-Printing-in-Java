import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}