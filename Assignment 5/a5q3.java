import java.util.Scanner;
class Marks {
    long roll_no;
    String name;
    int marks;
    Marks(){
        roll_no=(long) (19100000+(10000*Math.random()));
    }
}
class Physics extends Marks{
    void get_marks(){
        System.out.println("Physics marks: "+marks);
    }
    
}
class Chemistry extends Marks{
    void get_marks(){
        System.out.println("Chemistry marks: "+marks);
    }
}

class Mathematics extends Marks{
    void get_marks(){
        System.out.println("Mathematics marks: "+marks);
    }
}
public class a5q3{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter no of students: ");
        int class_strength = input.nextInt();
        int avg_marks=0;
        for(int i=0;i<class_strength;i++){
            String nm;int mks;
            System.out.print("Enter name: ");
            nm=input.nextLine();
            Marks student =new Marks();
            student.name=nm;
            Physics phy=new Physics();
            Chemistry chem=new Chemistry();
            Mathematics math=new Mathematics();
            System.out.print("Enter Physics marks: ");
            mks=input.nextInt();
            phy.marks=mks;
            System.out.print("Enter Chemistry marks: ");
            mks=input.nextInt();
            chem.marks=mks;
            System.out.print("Enter Mathematics marks: ");
            mks=input.nextInt();
            math.marks=mks;
            System.out.println();
            System.out.println("Name: "+student.name);
            System.out.println("Roll Number: "+student.roll_no);
            System.out.println("Total Marks: "+(phy.marks+chem.marks+math.marks));
            avg_marks+=phy.marks+chem.marks+math.marks;
            System.out.println();
        }
        System.out.println("Class Average marks: "+(double)avg_marks/class_strength);
        }
    

}
