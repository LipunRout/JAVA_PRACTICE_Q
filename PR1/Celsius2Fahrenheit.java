import java.util.Scanner;

public class Celsius2Fahrenheit {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter The Temp in celcius");
            double x=sc.nextInt();
            double Fa=((x*9/5)+32);
            System.out.println(x+" Celsius in Farenheit "+Fa);
            sc.close();
      }
}
