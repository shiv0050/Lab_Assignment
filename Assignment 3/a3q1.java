import java.util.Scanner;
class a3q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("string 1 : ");
        String str1 = input.nextLine(); 
        System.out.print("string 2 : ");
        String str2 = input.nextLine(); 
        input.close();
        if (str1.length() < str2.length()) { 
            System.out.println("string 2 : "+str2+" is greater.");
        } 
        else if (str1.length() > str2.length()) { 
            System.out.println("string 1 : "+str1+" is greater.");
        } 

        else { 
        boolean ch_fg=false; //check flag for char of 1st string
            
        for (int i = 0; i < str1.length() && 
                    i < str2.length(); i++) { 
            if ((int)str1.charAt(i) == 
                (int)str2.charAt(i)) { 
                continue; 
            } 
            else { 
                if(((int)str1.charAt(i)) > 
                    ((int)str2.charAt(i)))
                    ch_fg=true;
            } 
        } 
        if (ch_fg) { 
            System.out.println("string 1 : "+str1+" is greater.");
        } 
        else
            System.out.println("string 2 : "+str2+" is greater.");
        } 
  
        
    }
}