import java.util.Scanner;

public class Factorial {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number ");
            int n=sc.nextInt();
            int mul=1;
            if(n>=1){
                  for(int i=1;i<=n;i++){
                        mul*=i;
                  }
                  System.out.println("Factorial is "+mul);
            }
            else{
                  System.out.println("Enter A valid number");
            }
      }
}
