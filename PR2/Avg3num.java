import java.util.Scanner;

public class Avg3num {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your 3 Number ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int Avg=(a+b+c)/3;
            System.out.println("The Avg IS "+Avg);

      }
}
