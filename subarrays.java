public class subarrays {
    public static void sub_arrays(int n[]){
        int ts=0;
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(n[k]+" ");
                 
                }
                   ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }
    public static void main (String aargs[]){
        int n[]={1,2,3,4,5,6};
        sub_arrays(n);
    }
}
