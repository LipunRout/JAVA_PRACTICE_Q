import java.util.Scanner;

public class CheckPrime {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number ");
            int n=sc.nextInt();
            int c=0;
            for (int i=2;i<n;i++){
                  if(n%i==0){
                        c++;
                  }
            }
            if(c==0){
                  System.out.println("yes");
            }
            else{
                  System.out.println("no");
            }
      }
}
