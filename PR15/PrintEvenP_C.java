import java.util.Scanner;

public class PrintEvenP_C {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your String ");
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++){
                  if(i%2==0){
                        System.out.println(s.charAt(i));
                  }
            }
            
      }
}
