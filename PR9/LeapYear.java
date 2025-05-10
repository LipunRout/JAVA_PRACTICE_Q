import java.util.Scanner;
public class LeapYear {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Year for check ");
            int Year=sc.nextInt();
            if(Year%4==0 && Year%100!=0){
                  System.out.println("Yes "+Year+" Is A Leap Year !");
            }
            else if(Year%400==0){
                  System.out.println("Yes "+Year+" Is A Leap Year !");
            }
            else{
                  System.out.println("NO "+Year+" Is NOt A Leap Year !");
            }
      }
      
}
