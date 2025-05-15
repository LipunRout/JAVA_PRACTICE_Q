import java.util.Scanner;

public class WeekdayWeekend {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Day(In number) :");
            int Day = sc.nextInt();
            switch (Day) {
                  case 1,2,3,4,5:
                        System.out.println("Weekday");
                        break;
                  case 6:
                        System.out.println("WeekEnd");
                        break;
                  case 7:
                        System.out.println("WeekEnd");
                        break;
                  default:
                        System.out.println("Invalid day");
            }

      }
}


// DayNumber|	Day Name |	Type
//----------------------------------------
// 1	             Monday	Weekday
// 2	            Tuesday	Weekday
// 3	            Wednesday	Weekday
// 4	            Thursday	Weekday
// 5	            Friday	Weekday
// 6	            Saturday	Weekend
// 7	            Sunday	Weekend