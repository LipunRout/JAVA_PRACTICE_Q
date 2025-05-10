import java.util.Scanner;
public class Palindrom {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
             System.out.println("Enter Your NUmber ");
             int n=sc.nextInt();
             int rem=0;
             int rev=0;
             int temp=n;
             
             while(n!=0){
                   rem=n%10;
                   rev=rev*10+rem;
                   n/=10;
 
             }
             if(temp==rev){
                   System.out.println("YeS palindrom");
             }
             else{
                   System.out.println("No");
             }
       }

}
