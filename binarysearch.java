package Array;

public class binarysearch {
    public static int binarysearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;

            } if(arr[mid]>key){
                end=mid-1;
            }else{
               start= mid+1;
            }
        }
        return -1;
    }
    public static void main(String args []){
        int arr[]={1,5,3,8,23,9};
        int key=23;
      System.out.println(binarysearch(arr,key));
    }
}
