
import java.util.Scanner;

public class PrintGrade {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENter Your mark");
            double mark = sc.nextDouble();

            
            if (mark >= 80) {
                  System.out.println("E Grade");
            } else if (mark >= 70 && mark < 80) {
                  System.out.println("A Grade");
            } else if (mark >= 60 && mark < 70) {
                  System.out.println("B Grade");
            } else if (mark >= 40 && mark < 60) {
                  System.out.println("C Grade");
            } else if (mark >= 30 && mark < 40) {
                  System.out.println("D Grade");
            } else {
                  System.out.println("F Grade");
            }
      }
}