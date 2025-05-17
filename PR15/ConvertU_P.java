import java.util.Scanner;

public class ConvertU_P{
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your String ");
            String s=sc.nextLine();
            String c="";

            for(int i=0;i<s.length();i++){
                  char ch =s.charAt(i);
                  if(ch>='a' && ch<='z'){
                        int a=(int)s.charAt(i);
                        int z=a-32;
                        char x=(char)z;
                        c+=x;

                  }

            }
            System.out.println(c);
      }
}