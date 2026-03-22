public class binary_search {
    public static int binary(int n[],int key){
        int start=0,end=n.length-1;
        while(start <= end){
            int mid=(start + end)/2;
            if(n[mid]==key){
                //found
                return mid;
            }
            if(n[mid]<key){
                //right
                start=mid+1;
            }
            else{
                //left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n[]={2,4,6,8,10,12,14},key=12;
        int check=binary(n, key);
        if (check == -1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("number is :"+n[check] +" present at index :"+check);
        }
    }
}
