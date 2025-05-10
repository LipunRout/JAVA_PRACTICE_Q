import java.util.Scanner;
public class Fibonacci{
      public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter YOur NUmber ");
            int n=sc.nextInt();
            int n1=0;
            int n2=1;
            System.out.println("Your Fibbonacci Series Is ");
            System.out.println(n1);
            System.out.println(n2);
            for(int i=1;i<=n-2;i++){
                  int fibbo=n1+n2;
                  n1=n2;
                  n2=fibbo;
                  System.out.println(fibbo);

            }



      }
}