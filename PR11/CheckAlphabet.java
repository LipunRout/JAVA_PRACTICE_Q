import java.util.Scanner;

public class CheckAlphabet {
      public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Char");
            char s=sc.next().charAt(0);

            if(Character.isLetter(s)){
                  System.out.println("YEs Alphabet");
            }
            else{
                  System.out.println("No not an alphabet");
            }
            
            
      }
}
