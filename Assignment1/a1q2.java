import java.util.Scanner;
class a1q2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // Scanner class object for input
        System.out.print("Enter 1st no: ");
        float num1=input.nextFloat();
        System.out.print("Enter 2nd no: ");
        float num2=input.nextFloat();
        System.out.println("Product of "+num1+" & "+num2+" = "+(num1*num2)); //Multiplication
    }
}
