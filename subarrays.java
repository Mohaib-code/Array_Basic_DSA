public class subarrays {
    public static void sub_arrays(int n[]){
        int ts=0;
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(n[k]+" ");
                    sum=sum+n[k];
                 
                }
                   ts ++;
                   System.out.print("= "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }
    
    public static void Max_sub_arrays(int n[]){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum=sum+n[k];           
                }   
                if(max_sum<sum){
                    max_sum=sum;
                }                
                   System.out.print(sum+ " ");
                System.out.println();
            }
           
        }
        System.out.println(max_sum);
    }
    public static void prefix_max_subArrays(int n[]){
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int [n.length];

        prefix[0]=n[0];
        for(int i=1;i<n.length;i++){ 
            prefix[i]=prefix[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int sum=0;
                 sum=start == 0?prefix[end]:prefix[end]-prefix[start-1];
                 
                if(max_sum<sum){
                    max_sum=sum;
                }                
                   System.out.print(sum+ " ");
                System.out.println();
            }
           
        }
        System.out.println(max_sum);
    }
    public static void kadane(int n[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
             
            cs=cs+n[i];
             ms=Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }
            
            
            
        
       
        }
        System.out.println("MAX sum of sunarrays is :"+ms);
    }
    
    
    public static void main (String aargs[]){
        int n[]={-2,-3,-4,-2,-5,-3};
        // sub_arrays(n);
        // Max_sub_arrays(n);
        kadane(n);
    }
}
