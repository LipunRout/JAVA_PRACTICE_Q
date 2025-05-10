import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 50) {
            System.out.println("The number is within the range (1 to 50).");
        } else {
            System.out.println("The number is outside the range.");
        }
    }
}
