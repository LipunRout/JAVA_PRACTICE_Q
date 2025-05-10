
import java.util.Scanner;

public class Lcm {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your NUmbers");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int small=0,i=1;
            int hcf=0;
            if(n1>n2){
                  small=n2;
            }
            else{
                  small=n1;
            }
            while(i<=small){
                  if(n1%i==0 && n2%i==0){
                        hcf=i;
                  }
                  i++;

            }
            System.out.println(" Your Hcf IS  " +hcf);
            int lcm=(n1*n2)/hcf;
            System.out.println("Your LCM is "+lcm);

      }
}
