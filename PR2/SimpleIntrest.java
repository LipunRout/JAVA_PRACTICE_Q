import java.util.Scanner;

public class SimpleIntrest{
      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Your principal AMout");
      int p=sc.nextInt();
      System.out.println("Enter Your Rate Of Intrest ");
      int r=sc.nextInt();
      System.out.println("Enter Your Time in Years ");
      int t=sc.nextInt();
      double Si=(p*t*r)/100;
      System.out.println("Your Simple interset is "+Si);
            
      }
}