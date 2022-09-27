class MinOfThree{
    public static void main(String args[]){
        int num1=10;
        int num2=50;
        int num3=20;
        int smallest;
        if(num1<num2){
            if(num1<num3)       // num3>num1<num2
                smallest=num1;
            else                // num3<num1<num2
                smallest=num3;
        }
        else{
            if(num2<num3)       // num3>num2<num1
                smallest=num2;
            else 
                smallest=num3;  // num3<num2<num1
        }
        System.out.println("Smallest number : "+smallest); 
    }
}