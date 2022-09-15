import java.util.Scanner;
class a1q3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // Scanner class object for input
        System.out.print("Enter dividend: ");
        int num1=input.nextInt();
        System.out.print("Enter divisor: ");
        int num2=input.nextInt();
        System.out.println("Quotient of "+num1+" / "+num2+" = "+(num1/num2)); //Quotient
        System.out.println("Remainder of "+num1+" / "+num2+" = "+(num1%num2)); //Remainder
    }
}
