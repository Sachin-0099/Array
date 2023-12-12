package Array;
import java.util.*;
public class arrange {
    public static void arrange(int arr[],int n){
int left=0;
int right=n-1;
int counter=1;
while(left<=right){
    if(counter%2==1){
        arr[left]=counter;
        left++;
        counter++;
    }else{
arr[right]=counter;
right--;
counter++;
    }
}
    

   
}
    
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the times you wnt to run queries");
int t=sc.nextInt();
while(t>0){
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    arrange(arr,n);
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println();
    t--;

}
}
}

