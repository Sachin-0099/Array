package Array;
import java.util.*;
public class swap {
    public static void swap(int arr[],int n){
        for(int i=0;i<n-1;i+=2){
   int temp=arr[i];
     arr[i]=arr[i+1];
     arr[i+1]=temp;
        }
     
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the times you want to run the queries");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            int arr[]=new int[n];
        
            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
            }
                swap(arr,n);
                for( int i=0;i<n;i++){
System.out.print(arr[i]+" ");
                }
            System.out.println();
            t--;


        }
    
   }
}
