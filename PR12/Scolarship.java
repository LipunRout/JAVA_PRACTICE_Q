import java.util.Scanner;

public class Scolarship {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Mark(In number) :");
            System.out.println("Enter Your Math Mark(In number) :");
            int Math = sc.nextInt();
            System.out.println("Enter Your Eng Mark(In number) :");
            int Eng = sc.nextInt();
            System.out.println("Enter Your Science Mark(In number) :");
            int Sc = sc.nextInt();
            System.out.println("Enter Your Hindi Mark(In number) :");
            int Hn = sc.nextInt();
            System.out.println("Enter Your Biology Mark(In number) :");
            int bio = sc.nextInt();

            int total = Math + Eng + Sc + Hn + bio;
        double percentage = (total / 500.0) * 100;


        System.out.printf("\nTotal Marks: %d/500\n", total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
           
                  if(percentage>=75){
                        System.out.println("You Are eligibile.!");
                        
                  }
                  else{
                        System.out.println("NOt eligibile.!");
                  }
                  

            




      }
      
}
