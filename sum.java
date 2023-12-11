package Array;
import java.util.*;
public class sum {
    public static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of times queries run");
        int t=sc.nextInt();
        
        int Sum=0;
        while(t>0){
            System.out.println("Enter the size");
            int size=sc.nextInt();
            int array[]=new int[size];
            for(  int i=0;i<size;i++){
             array[i]=sc.nextInt();
             Sum+=array[i];
        
            }
                 System.out.println(Sum);
        
          t--;
            }
           
        }

     

    public static void main(String args []){
sum();
    }
}

