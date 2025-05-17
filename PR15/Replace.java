import java.util.Scanner;

public class Replace {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your String ");
            String s=sc.nextLine();
            String c="";
            for(int i=0;i<s.length();i++){
                  char ch =s.charAt(i);
                  if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||
                  ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ){
                        ch='*';
                  }
                  c+=ch;
            }
            System.out.println(c);
      }
}
