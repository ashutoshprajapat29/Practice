import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int [] sum(int []arr , int target){
        HashMap<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
     int compliment=target-arr[i];
     if(map.containsKey(compliment)){
         return new int[] {map.get(compliment),i};
        
     } 
            map.put(arr[i], i);
        


     }
     return new int []{};
    }
    public static void main(String[] args) {
       int arr[]={1,3,5,6,7,5,8};
       int target=10;
     
       System.out.println(Arrays.toString(sum(arr, target)));
    }
}