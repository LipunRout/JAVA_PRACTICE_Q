import java.util.Scanner;

public class Natural{
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter YOur Natural number ");
            int n=sc.nextInt();
            int sum=0;
            if(n>=1){
                  for(int i=1;i<=n;i++){
                        sum+=i;
                  }
                  System.out.println("Sum is "+sum);
      
            }
            else{
                  System.out.println("Invalid Input");
            }
            
      }     
}