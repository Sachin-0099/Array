package Array;
import java.util.*;
public class unique {
    public static int unique(int arr[]){
      int ans=0;
      for(int i=0;i<arr.length;i++){
        ans=ans^arr[i];
      }
  return ans;
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of time you wnat to run the queries");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();//size should [2m+1];
            //IN this array m no.are present twice and only one no.are present once
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
      System.out.println(  unique(arr));
            t--;
        }
    }
}
