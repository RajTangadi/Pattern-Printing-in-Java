import java.util.Scanner;

// pattern Rectangular Pattern
//i => row j => column
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease Enter the number for rows: ");
        int row = sc.nextInt();
        System.out.print("Please Enter the number for column: ");
        int column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}