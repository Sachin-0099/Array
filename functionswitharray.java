package Array;
import java.util.*;
public class functionswitharray {
public static int[] Takeinput(){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int array[]=new int[size];
for(int i=0;i<size;i++){
array[i]=sc.nextInt();
}
return array;
}
public static void printarray(int array[])
{
    int size=array.length;
    for(int i=0;i<size;i++){
System.out.print(array[i]+" ");
    }
    System.out.println();
}
public static void main(String [ ]args){
int arr[]=Takeinput();
printarray(arr);
}
    
}
}
