import java.util.Scanner;

public class Frequency {
      public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Strings ");
            String s=sc.nextLine();
            System.out.println("Enter Your char What You Looking for ");
            char c=sc.next().charAt(0);
            int count=0;
            for(int i=0;i<s.length();i++){
                  if(s.charAt(i)==c){
                        count++;
                  }
                  
            }
            System.out.println(count);
            
      }
}
