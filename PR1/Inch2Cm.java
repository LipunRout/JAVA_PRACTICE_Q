
import java.util.Scanner;

public class Inch2Cm {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter The Inch to Convert to the Cm.");
            int x=sc.nextInt();
            double cm=(x*2.54);
            System.out.println(x+" in Cm is "+cm);
            sc.close();
      }
}
