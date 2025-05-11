import java.util.Scanner;

public class AssignMin {
      public static void main(String[] args) {
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter Your NUmbers "); 
           int n1=sc.nextInt();
           int n2=sc.nextInt();
           int max=(n1<n2)?n1:n2;
           System.out.println(max);
      }
}
