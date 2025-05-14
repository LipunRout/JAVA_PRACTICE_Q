import java.util.Scanner;

public class BasedOnAge {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your age :");
            double Age=sc.nextDouble();
            if(Age>0){
                  if(Age>0 && Age<=12){
                        System.err.println("You Are A Child.!");
                        
                  }
                  
                  else if(Age>=13 && Age<=19){
                        System.err.println("You Are A Teen.!");
                        
                  }
                  else if(Age>=20 && Age<=59){
                        System.err.println("You Are An Adult.!");
                        
                  }
                  else {
                        System.out.println("Senior ");
                  }

            }
            else{
                  System.out.println("Invalid Age");
            }
            
            
      }
}
// Child: 0–12 years

// Teen: 13–19 years

// Adult: 20–59 years

// Senior: 60+ years