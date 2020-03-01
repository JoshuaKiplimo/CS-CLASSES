import java.util.Scanner;
public class WORDCOUNT{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        String stripstr = str.strip();//remove  leading and trailing whitespace
        System.out.print("Number of  words in the string: " + count_vowels(stripstr)+"\n");
    }
 public static int count_vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                count++;
            }
        }
        return count +1;
    }
}