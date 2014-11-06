import java.util.*;

public class Substring
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        int length = input.length();
        int a = 0;
        int b = 1;
        int c = 0;
        while(a<input.length())
        {
            System.out.println(input.substring(a,input.length()));
            while ((input.length() - b) >a)
            {
                System.out.println(input.substring(a, input.length() - b));
                b++;
            }
            a++;
            b = 1;
        }
        
    }
}