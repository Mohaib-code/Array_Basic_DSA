public class trapping_rainwater{
    public static int algorithm(int n[]){
        //left max boundary
        int left_max[]=new int[n.length];
        left_max[0]=n[0];
        for(int i=1;i<n.length;i++){
            left_max[i]=Math.max(n[i], left_max[i-1]);
        }
        //right max boundary
        int right_max[]=new int[n.length];
        right_max[n.length-1]=n[n.length-1];
        for(int i=n.length-2;i>=0;i--){
            right_max[i]=Math.max(n[i], right_max[i+1]);
        }
        //loop
        int sum_trapped_water=0;
        for (int i = 0; i < n.length; i++) {
            
             //water level=min(left max,right max)
            int water_level=Math.min(left_max[i],right_max[i]);
            //trapped=water level-height*width but in this question width is 1 so skipping
            int trapped_water=water_level-n[i];
            sum_trapped_water=sum_trapped_water+trapped_water;

        }
       return sum_trapped_water;
        
        //sum of all trapped water
       
    }
    public static void main (String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(height.length);
        int sum=algorithm(height);
        System.out.println(sum);
    }
}