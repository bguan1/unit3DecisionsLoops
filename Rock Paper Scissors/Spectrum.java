import java.util.*;
public class Spectrum
{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String spectrum = "";

      System.out.print("Input a Wavelength: ");
      double number = in.nextDouble(); 
      if (number > Math.pow(10, -1))
      {
           System.out.println("It is a Radio Wave");
      }
      else if (number > Math.pow(10, -3))
      {
           System.out.println("It is a Microwave");
      }
      else if (number > 7*Math.pow(10, -7))
      {
           System.out.println("It is Infared");
      }
      else if (number > 4*Math.pow(10, -7))
      {
           System.out.println("It is Visible Light");
      }
      else if (number > Math.pow(10, -8))
      {
           System.out.println("It is Ultraviolet");
      }
      else if (number > Math.pow(10, -11))
      {
           System.out.println("It is an X-Ray");
      }
      else
      {
          System.out.println("It is a gamma ray");
      }
    }  
}
