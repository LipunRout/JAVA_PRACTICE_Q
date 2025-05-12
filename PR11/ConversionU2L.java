import java.util.Scanner;

public class ConversionU2L {
      public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Char");
            char s=sc.next().charAt(0);
            char up=Character.toLowerCase(s);
            System.out.println(up);
            
      }
}
