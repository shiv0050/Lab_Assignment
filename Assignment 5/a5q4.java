
class Myclass {
    static int a = 20;
    Myclass() {
        a++;
    }
    void m1() {
        a++;
        System.out.println(a);
    }
}
public class a5q4 {
    public static void main(String[] args)
    {
        Myclass obj = new Myclass(); //20+1
        Myclass obj2 = new Myclass();//21+1
        Myclass obj3 = new Myclass();//22+1
        obj3.m1(); //23+1 = 24
    }
}

