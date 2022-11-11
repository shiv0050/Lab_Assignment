 class Mammals{
    void show(){
        System.out.println("I am a Mammal");
    }
}
 class MarineAnimals extends Mammals{
    void show(){
        System.out.println("I am a Marine Animal");
    }
    void mmlShow(){
        super.show(); // Calling parent function 
    }
}
 class BlueWhale extends MarineAnimals{
    
    void show(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    void mramlShow(){
        super.mmlShow(); // Calling parent function 
        super.show(); // Calling parent function 
    }
}
public class a5q1 {
    public static void main(String[] args) {
        Mammals mml=new Mammals();
        mml.show(); // Calling by obj
        MarineAnimals mraml=new MarineAnimals();
        mraml.show(); // Calling by obj
        BlueWhale blw=new BlueWhale();
        blw.show(); // Calling by obj
        blw.mramlShow(); // Calling parent function 
    }
}
