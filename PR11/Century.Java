import java.util.Scanner;
public class Century{
      public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Year");
            int Year=sc.nextInt();
            if(Year%100==0){
                  System.out.println("Yes");
            }
            else{
                  System.out.println("NO");
            }
      }
      
}