
import java.util.Scanner;

public class VowelAndConsonant {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter YOur CHar TO CHECK");
            char s = sc.next().charAt(0);
            if (s >= 'A' && s <= 'Z' || s >= 'a' && s <= 'z') {
                  if (s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U'
                              || s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                        System.out.println("Vowel");

                  } else {
                        System.out.println("Consonant");
                  }

            }
            else{
                  System.out.println("Not An Alphabet");
            }

      }
}
