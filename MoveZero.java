package Array;
import java.util.*;
public class MoveZero {
    public static int[] moveZeroToEnd(int arr[]){
        //BRUTE FORCE APPROACH
        // ArrayList<Integer> temp= new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] !=0){
        //         temp.add(arr[i]);
        //     }
        // }
        // int n=temp.size();
        // for(int i=n;i<arr.length;i++){
        //    arr[i]=0;
        // }

        // for(int i=0;i<n;i++){
        //     arr[i]=temp.get(i);
        // }
        // return arr;

//OPTIMAL APPROACH TIME COMPLEXITY O(2n)  SPACE O(1)
        int j=-1;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
             j=i;
             break;
            }
        }
        for(int i=j+1; i<n;i++){
            if(arr[i] !=0){
              int temp =arr[i];
              arr[i]= arr[j];
              arr[j] = temp;

              j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,23,6,0,4,0,4};
      int n[]=  moveZeroToEnd(arr);
        for(int i=0;i<arr.length;i++){
           System.out.println( arr[i]);
        }
    }
}
