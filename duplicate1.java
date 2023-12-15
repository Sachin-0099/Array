package Array;

public class duplicate1 {
   public static void main(String args []){
    int arr[]={
       1,2,3,3,1
    };
    for(int i=0;i<arr.length;i++){
        boolean duplicate=false;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j] && (i!=j)){
   duplicate=true;
             
            }
        }
        if(duplicate){
            System.out.println(arr[i]);
        }
    }
   } 
}