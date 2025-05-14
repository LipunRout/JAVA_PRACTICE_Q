import java.util.Scanner;

public class CalculateElectricityBIll {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Units :");
            double un=sc.nextDouble();
            double bill=0;
            if(un>0){
                  if(un<=50){
                        bill=un*3;
                  }
                  else if(un>50 && un<=150){
                        bill=un*5;
                  }
                  else if(un>150 && un<=300){
                        bill=un*7;
                  }
                  else if(un>300 ){
                        bill=un*10;
                  }
                  
            }
            else{
                  System.out.println("Enter VAlid Unit");
            }
            System.out.println("Your electricity bill Was "+bill+"rs.");
            
       }
}
// Units Consumed  	Rate per Unit
// 0–50 units     	₹3.00
// 51–150 units   	₹5.00
// 151–300 units	      ₹7.00
// Above 300 units	₹10.00