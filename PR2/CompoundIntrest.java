import java.util.Scanner;

public class CompoundIntrest {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your principal AMout");
            double p=sc.nextDouble();
            System.out.println("Enter Your Rate Of Intrest ");
            double r=sc.nextDouble();
            System.out.println("Enter Your Time in Years ");
            double t=sc.nextDouble();
            double TotalAMount=p*Math.pow((1+r/100), t);
            double CompoundIntrest=TotalAMount-p;
            System.out.println("Your Compound Intrest is  "+CompoundIntrest);
      }
}
