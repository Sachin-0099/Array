package Array;

public class increment {
    public static void increment(int arr[]){
    arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String args []){
        int arr[]={1,2,3,4,5,6};
        increment(arr);
        for(int i=0;i<arr.length;i++){
  System.out.println(arr[i]+" ");
        }
      

    }
}
