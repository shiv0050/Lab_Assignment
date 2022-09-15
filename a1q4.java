import java.util.Scanner;
class a1q4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // Scanner class object for input
        System.out.print("Enter 1st no: ");
        int num1=input.nextInt();
        System.out.print("Enter 2nd no: ");
        int num2=input.nextInt();
        System.out.println("Using temporary variable"); 
        System.out.println("Orginal values: num1="+num1+" & num2="+num2);
        int temp =num2; //Swapping using temp var
        num2=num1;
        num1=temp;
        System.out.println("Swapped values: num1="+num1+" & num2="+num2); 
        temp =num2;
        num2=num1;
        num1=temp;
        System.out.println();
        System.out.println("Without using temporary variable");
        System.out.println("Orginal values: num1="+num1+" & num2="+num2);
        num1=num1+num2; //swapping without temp var
        num2=num1-num2;
        num1=num1-num2; 
        System.out.println("Swapped values: num1="+num1+" & num2="+num2);
    }
}