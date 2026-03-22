public class linear_search{
    public static int linear_searching(String number[],String key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
              
        }
        return -1;
       
    }
    public static void main(String args[]){
        String numbers[]={"mango","apple","bannana","pineapple"};
        String key="rice";
        int index=linear_searching(numbers, key);
        if(index==-1){
            System.out.print("Not Available");
        }
        else {System.out.println("index is :"+index);}
    }
}