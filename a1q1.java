import java.util.Scanner;
class a1q1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // Scanner class object for input
        System.out.print("Enter 1st no: ");
        int num1=input.nextInt();
        System.out.print("Enter 2nd no: ");
        int num2=input.nextInt();
        System.out.println("Sum of "+num1+" & "+num2+" = "+(num1+num2)); //Addition
        System.out.println("Difference of "+num1+" & "+num2+" = "+(num1-num2)); //Subtraction
    }
}