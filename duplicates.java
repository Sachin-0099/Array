package Array;
import java.util.*;
public class duplicates {
    public static void  duplicates(int arr[]){
     for( int i=0;i<arr.length;i++){
          int count=0;
        for(int j=0;j<arr.length;j++){      
        if(arr[i]==arr[j]){
           count++;
        }
    }
    if(count>1){
        System.out.println(arr[i]);
    }
}

}

    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of time you wnat to run the queries");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
  duplicates(arr);
            t--;
        }
    }
}