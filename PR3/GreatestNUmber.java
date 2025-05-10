
import java.util.Scanner;

public class GreatestNUmber {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your 3 NUmbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int gt;
            if(a>b & a>c){
                  gt=a;
            }
            else if(b>c){
                  gt=b;
            }
            else{
                  gt=c;
            }
            System.out.println("Greatest Number IS "+gt);

      }
      
}
