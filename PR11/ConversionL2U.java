import java.util.Scanner;

public class ConversionL2U {
      public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Char");
            char s=sc.next().charAt(0);
            char up=Character.toUpperCase(s);
            System.out.println(up);
            
      }
}
