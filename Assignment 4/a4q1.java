import java.util.Scanner;
import java.util.Vector;

class  a4q1{
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of vector: ");
        String n = input.nextLine();

        int length = Integer.parseInt(n);
        Vector<String> vec = new Vector<String>(length);

        for(int i = 0; i<length; i++){

            System.out.print("Enter next element of vector or \'-1\' to end loop: ");

            String in = input.nextLine();

            if(in.equals("-1"))
                break;
            
            vec.addElement(in);
        }

        for(int i = 0; i<vec.size(); i++)
            System.out.println(vec.elementAt(i));
        

    }
}