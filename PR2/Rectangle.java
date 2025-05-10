import java.util.Scanner;

public class Rectangle {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Length & Breadth Of Rectangle ");
            double Length=sc.nextDouble();
            double Breadth=sc.nextDouble();
            double Area=Length*Breadth;
            double Perimeter=2*(Length+Breadth);
            System.out.println("Area is "+Area);
            System.out.println("Perimeter Is "+Perimeter);


      }
}
