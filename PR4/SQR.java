import java.util.Scanner;

public class SQR {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your NUmber");
            int num = sc.nextInt();
            double sq=Math.pow(num, 2);
            System.out.println(sq);
      }
}
