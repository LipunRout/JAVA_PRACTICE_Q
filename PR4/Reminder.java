import java.util.Scanner;
public class Reminder{
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your a & b NUmber");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int rem=a-(a/b)*b;
            System.out.println("Reminder is "+rem);

      }
}