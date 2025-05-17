import java.util.Scanner;

public class PrintASCII {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your String ");
            String s=sc.nextLine();
            
            for(int i=0;i<s.length();i++){
                 int Ascii=(int) s.charAt(i);
                 System.out.println("The ASCII VALUE IS "+Ascii+" And The Value Is "+s.charAt(i)); 
            }
            
      }
}
