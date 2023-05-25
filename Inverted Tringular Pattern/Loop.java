import java.util.Scanner;

//first method

/* 

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease Enter the number for rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row+1-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 

*/

//second method

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease Enter the number for rows: ");
        int row = sc.nextInt();

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}