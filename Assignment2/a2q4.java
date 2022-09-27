import java.lang.Math;

class a2q4 {
    public static void main(String args[]){

        int population = 80000;
        int count = 0;

        while(population<150000){
            population = (int) Math.floor(population*1.05);
            count++;
        }

        System.out.println("Population will exceed 150000 after " + count + " years, hence becoming " + population + ".");
    }
}
