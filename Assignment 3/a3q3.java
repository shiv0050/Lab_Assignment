import java.util.Arrays;
import java.util.Scanner;
public class a3q3 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string : ");
      String str = input.nextLine();
      input.close();
      char charArray[] = str.toCharArray(); // converting string to array
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
   }
}