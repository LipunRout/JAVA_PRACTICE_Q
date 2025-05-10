import java.util.Scanner;

public class Day2weekNyr {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Days ");
            double Days=sc.nextDouble();
            double Week=Days/7;
            double Year=Days/360;
            double Rdays=Days%7;

            System.out.println("IN week IS "+Week);
            System.out.println("in year IS "+Year);
            System.out.println("Remaining Days IS "+Rdays);
      }
}
