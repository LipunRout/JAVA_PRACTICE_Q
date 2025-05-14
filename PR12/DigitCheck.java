
import java.util.Scanner;

public class DigitCheck{
      public static void main(String[] args) {
            Scanner sc =new Scanner (System.in);
            System.out.println("Enter Your Charcter ");
            char s=sc.next().charAt(0);
            if(Character.isDigit(s)){
                  System.out.println("Yes It Is A digit ");
            }
            else{
                  System.out.println("It is not a Digit ");
            }
      }
}