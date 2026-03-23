public class buy_sell_stock {
    public static int algo(int n[]){
        int bp=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n.length;i++){
            if(bp<n[i]){
                int profit=n[i]-bp;//single day
                maxProfit=Math.max(maxProfit, profit);//compare gross profit with single day
            }
            else{
                bp=n[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(algo(prices));
    }
}
