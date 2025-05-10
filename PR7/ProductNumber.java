import java.util.Scanner;

public class ProductNumber {
      public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your NUmber ");
            int n=sc.nextInt();
            int rem=0;
            int mul=1;
            
            while(n!=0){
                  rem=n%10;
                  mul*=rem;
                  n/=10;

            }
            System.out.println(mul);
      }
}
