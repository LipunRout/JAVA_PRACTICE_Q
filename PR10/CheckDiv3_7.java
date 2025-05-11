import java.util.Scanner;

public class CheckDiv3_7 {
      public static void main(String[] args) {
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter Your NUmber "); 
           int n=sc.nextInt();
           String Div=(n%3==0 && n%7==0) ? "Yes" : "No";
           System.out.println(Div);
           
      }
}
