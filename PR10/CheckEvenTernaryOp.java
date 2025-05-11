import java.util.Scanner;

public class CheckEvenTernaryOp {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your NUmber");
            int num=sc.nextInt();
            String even=(num%2==0) ? "Yes" : "NO";
            System.out.println(even);
      }
}
