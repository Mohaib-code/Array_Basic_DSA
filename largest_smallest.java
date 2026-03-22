import java.util.*;
public class largest_smallest {
    public static void largest(int n[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(largest <n[i]){
                largest=n[i];
            }
        }
        System.out.println("THE LARGEST NUMBER IS :"+largest);
    }
    public static void smallest(int n[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(smallest > n[i]){
                smallest=n[i];
            }
        }
        System.out.println("SMALLEST NUMBER IS :"+smallest);
    }
    public static void main (String args[]){
        int n[]={3,5,7,9,2,1};
        largest(n);
        smallest(n);
    }
}
