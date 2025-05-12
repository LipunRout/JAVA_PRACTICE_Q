import java.util.Scanner;

public class AgeCheck {
      public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Age");
            int age=sc.nextInt();
            if(age>=18){
                  System.out.println("Yes  you can vote");
            }
            else{
                  System.out.println("NO you cannt");
            }
      }
}
