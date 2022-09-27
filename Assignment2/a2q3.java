import java.util.Scanner;
class a2q3{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in); // Scanner class object for input
        int index=0;// day of the month
        String month = "";
        int days = 0;

        do{
            System.out.print("Enter number of month: ");
            index = input.nextInt();

            if(index>12 || index<1)
                System.out.println("Please Enter a valid number!");
        }
        while(index>12 || index<1);

        switch(index){

            case(1):
                month = "January";
                days = 31;
                break;
            case(2):
                month = "February";
                days = 28;
                break;
            case(3):
                month = "March";
                days = 31;
                break;
            case(4):
                month = "April";
                days = 30;
                break;
            case(5):
                month = "May";
                days = 31;
                break;
            case(6):
                month = "June";
                days = 30;
                break;
            case(7):
                month = "July";
                days = 31;
                break;
            case(8):
                month = "August";
                days = 31;
                break;
            case(9):
                month = "September";
                days = 30;
                break;
            case(10):
                month = "October";
                days = 31;
                break;
            case(11):
                month = "November";
                days = 30;
                break;
            case(12):
                month = "December";
                days = 31;
                break;
        }

        System.out.println("Month: " + month);
        System.out.println("Number of days in " + month + ": "+days);

    }
}