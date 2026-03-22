public class array_function{
    public static void update(int nums[]){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]+10;
        }
    }
    public static void main(String args[]){
        int marks[]={81,82,83};
        update(marks);
        //print
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}