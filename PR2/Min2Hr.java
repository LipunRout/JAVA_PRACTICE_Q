import java.util.Scanner;

public class Min2Hr {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your MIns ");
            double min=sc.nextDouble();
            double hr=min/60;
            double Rmin=min%60;

            System.out.println("IN HOUR IS "+hr);
            System.out.println("Remain Mins IS "+Rmin);
      }
}
