
import java.util.Scanner;

public class PN0 {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your NUmber");
            int num=sc.nextInt();
            if(num>0){
                  System.out.println(num+" is Positive ");
            }
            else if(num<0){
                  System.out.println(num+" is negative ");
            }
            else{
                  System.out.println(num);
            }
      }

}
