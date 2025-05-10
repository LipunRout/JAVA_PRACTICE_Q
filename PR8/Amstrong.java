
import java.util.Scanner;

public class Amstrong {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter your number ");
            int num=sc.nextInt();
            int sum=0,rem=0,count=0;
            int temp1=num,temp2=num;
            while(num>0){
                  rem=num%10;
                  count+=1;
                  num/=10;
            }
            while(temp1>0){
                  rem=temp1%10;
                  sum+=Math.pow(rem, count);
                  temp1/=10;
            }
            if(temp2==sum){
                  System.out.println("YES it's A amstrong Number ");
            }
            else{
                  System.out.println("No");
            }
      }
}
