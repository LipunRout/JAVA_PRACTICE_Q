import java.util.Scanner;

public class Fahrenheit2Celsius {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter The Temp in Farenheit ");
            double x=sc.nextInt();
            double Ce=(x-32)*5/9;
            System.out.println(x+" Celsius in celcius "+Ce);
            sc.close();
      }
}
