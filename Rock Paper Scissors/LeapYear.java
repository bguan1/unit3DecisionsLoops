import java.util.*;
public class LeapYear
{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String leapyear = "";

      System.out.print("Input a year: ");
      double year = in.nextDouble(); 
      if (year % 400 == 0)
      {
           System.out.println("It is a Leap Year");
      }
      else if (year % 100 == 0)
      {
           System.out.println("It is not a Leap Year");
      }
      else if (year % 4 == 0)
      {
           System.out.println("It is a Leap Year");
      }
      else
      {
          System.out.println("It is not a Leap Year");
      }
    }  
}
