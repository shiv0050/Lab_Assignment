class Employee{

    String name, address;
    int yoj, salary;

    Employee(String name, String address, int yoj, int salary){

        this.name = name;
        this.address = address;
        this.yoj = yoj;
        this.salary = salary;
    }
}

public class a4q2  {
    
    public static void main(String args[]){

        Employee e1 = new Employee("Robert", "64C- WallsStreat", 1994, 1000000);
        Employee e2 = new Employee("Sam", "68D- WallsStreat", 2000 ,2000000);
        Employee e3 = new Employee("John", "26B- WallsStreat", 1999, 2500000);
        Employee[] emps = new Employee[3];

        emps[0] = e1;
        emps[1] = e2;
        emps[2] = e3;

        System.out.println("Name    Year of joining    Address      Salary");

        for(int i = 0; i<3; i++)
            System.out.println(emps[i].name + "     " + emps[i].yoj + "      " + emps[i].address + "   " + emps[i].salary);
        
    }
}