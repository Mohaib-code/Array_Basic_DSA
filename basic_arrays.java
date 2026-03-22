import java.util.*;
public class basic_arrays {
    public static void main(String args[]){
        int marks[]=new int[40];
        // int nums[]={11,22,33};
        // String fruits[]={"apple","mango"};
        // System.out.println(nums[2]);
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phy :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("math :"+marks[2]);
        System.out.println("blank :"+marks[39]);

    }
}
