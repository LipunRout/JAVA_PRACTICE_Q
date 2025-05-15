import java.util.Scanner;

public class RemoveSpace {
   public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Strings ");
            String s=sc.nextLine();
            String n=s.replace(" ", "");
            System.out.println(n);
}
}