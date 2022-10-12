class a3q2 {
    public static void main(String args[]) {
        int[] count=new int[21]; //count array for sorting
        int[] data={1,5,4,3,7,3,5,11,16,18,12,13,20,13,9};
        for(int i=0;i<data.length;i++){
            count[data[i]]++; // storing count of each element
        }
        for(int i=0;i<count.length;i++){
            while(count[i]!=0){
                System.out.println(i);
                    count[i]--; // decreasing count of element
            }
        }
    }
}
