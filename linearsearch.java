package Array;

public class linearsearch{
   public static int  linearsearch(int array[],int key){
      for(int i=0;i<array.length;i++){
         if(array[i]==key){
            System.out.println( "Key at index:"+i);
         }
      }
      return -1;
   }
public static void main(String args []){
int array[]={1,2,3,4,5,6,80};
int key=5;
linearsearch(array,key);
}

}

