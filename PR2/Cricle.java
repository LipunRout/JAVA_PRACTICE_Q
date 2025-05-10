
import java.util.Scanner;

public class Cricle {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Radius ");
            double r=sc.nextDouble();
            double Area=Math.PI*Math.pow(r, 2);
            System.out.println("Area Of Circle is "+Area);
            double Circumference=2*Math.PI*r;
            System.out.println("Circumference Of Circle is "+Circumference);
      }
      
}
