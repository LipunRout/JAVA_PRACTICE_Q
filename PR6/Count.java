import java.util.Scanner;

public class Count {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your number for count");
            int num=sc.nextInt();
            int rem=0;
            int c=0;
            while(num!=0){
                  rem=num%10;
                  num/=10;
                  c+=1;

            }
            System.out.println("Your count is "+c);
      }
}
