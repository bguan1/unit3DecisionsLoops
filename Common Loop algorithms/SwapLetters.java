import java.util.*;

public class SwapLetters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        Random r = new Random();
        for(int ct=0;ct<input.length();ct++){
            int i=r.nextInt(input.length()-1);
            int j=r.nextInt((input.length()-1));
            if(j<i+1){
                while(j<i+1){
                    j++;
                }
            }

            String finals="";
            
            String first=input.substring(0,i);
            char sw1=input.charAt(i);
            String middle=input.substring(i+1,j);
            char sw2 = input.charAt(j);
            String end = input.substring(j+1, input.length());
            finals = first + sw2 + middle + sw1 + end;
            System.out.println(finals);
            
        }
    }
}
        