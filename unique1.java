package Array;

public class unique1 {
   public static void main(String args []){
    int arr[]={
       1,2,3,4,1
    };
    for(int i=0;i<arr.length;i++){
        boolean not_duplicate=true;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]&&(i!=j)){
                not_duplicate=false;
                break;
            }
        }
        if(not_duplicate){
            System.out.println(arr[i]);
        }
    }
   } 
}
