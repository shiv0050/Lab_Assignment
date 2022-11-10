import java.util.*;

class Number{

    private double num;

    Number(double num){
        this.num = num;
    }

    boolean isZero(){
        return num==0;
    }

    boolean isPositive(){
        return num>0;
    }

    boolean isNegative(){
        return num<0;
    }

    boolean isOdd(){
        return num%2.0==1.0;
    }

    boolean isEven(){
        return num%2.0==0.0;
    }

    boolean isPrime(){

        for(double i = 2.0; i*i<num; i++){
            if(num%i==0)
                return false;
        }

        return true;
    }

    boolean isAmstrong(){
        
        double sum = 0;
        int temp = Math.abs((int)this.num);
        while(temp>0){

            int temp0 = temp%10;
            sum += temp0*temp0*temp0;
            temp/=10;
        }

        return num==sum;
    }

    double getFactorial(){
        
        if(isNegative()){

            System.out.println("Number is negative.");
            return -1;
        }
        double fac = 1;
        for(int i = 2;i<=num; i++){

            fac*=i;
        }

        return fac;
    }

    double getSqrt(){

        return Math.sqrt(num);
    }

    double sumDigits(){

        double sum = 0;
        int temp = Math.abs((int)this.num);
        while(temp>0){

            sum += temp%10;
            temp/=10;
        }

        return sum;
    }

    double getReverse(){

        double rev = 0;
        int temp = Math.abs((int)this.num);
        while(temp>0){

            rev = rev*10 + temp%10;
            temp/=10;
        }

        if(isNegative())
            rev*=-1;
        return rev;
    }

    void listFactors(){

        int temp = Math.abs((int) this.num);
        for(int i = 1; i<=temp; i++){

            if(temp%i==0){

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }


    void dispBinary(){

        int temp = (int)this.num;
        String s = "";
        while(temp>0){
            
            if(temp%2==0)
                s = "0" + s;
            else
                s = "1" + s;

            temp/=2;
        }

        System.out.println(s);
    }

}

class a4q3 {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String n = input.nextLine();

        Number number = new Number(Double.parseDouble(n));

        System.out.println("isZero result: " + number.isZero());
        System.out.println("isPositive result: " + number.isPositive());
        System.out.println("isNegative result: " + number.isNegative());
        System.out.println("isEven result: " + number.isEven());
        System.out.println("isOdd result: " + number.isOdd());
        System.out.println("isPrime result: " + number.isPrime());
        System.out.println("isAmstrong result: " + number.isAmstrong());

        System.out.println("getFactorial result: " + number.getFactorial());
        System.out.println("getSqrt result: " + number.getSqrt());
        System.out.println("sumDigits result: " + number.sumDigits());
        System.out.println("getReverse result: " + number.getReverse());

        System.out.println("listFactors result: ");
        number.listFactors();

        System.out.println("dispBinary result: ");
        number.dispBinary();
    }
}