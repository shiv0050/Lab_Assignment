import java.util.Scanner;
class a2q1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // Scanner class object for input
        System.out.print("Enter your score: ");
        double score=input.nextDouble();
        if(score>80 && score<90)
            score+=5;
        System.out.println("Updated Score : "+score);
    }
}