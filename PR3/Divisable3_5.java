
import java.util.Scanner;

public class Divisable3_5 {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter your number");
            int num =sc.nextInt();
            if((num%3==0) & (num%5==0)){
                  System.out.println("yes");
            }
            else{
                  System.out.println("NO");
            }
      }
}
