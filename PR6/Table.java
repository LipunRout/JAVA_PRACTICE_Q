import java.util.Scanner;

public class Table {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your number for count");
            int num=sc.nextInt();
            System.err.println("Table Of "+num+"Is ");
            for(int i=1;i<=10;i++){
                  System.err.println(num+" X "+i+" = "+(num*i));
                  
            }
      }
      
}
