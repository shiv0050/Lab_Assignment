import java.util.Scanner;
public class a3q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:  ");
        int number = input.nextInt();
        input.close();
        System.out.println("Hailstone Sequence:-");
        if(number==1) System.out.println("Number is 1.");
        while (number != 1) {
            if (number % 2 == 0) {
                System.out.println("Having the number "+ number+": " + number / 2);
                number /= 2;
            } else {
                System.out.println("3 x number + 1: " + (number * 3 + 1));
                number = number * 3 + 1;
            }
        }
    }         
}
