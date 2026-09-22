package Arrays;
public class Main{

    public static void reverseArray(int arr[]){
        int mid=arr.length/2;
        int last=arr.length-1;
        for(int i=0;i<mid;i++){
            //swap first with last
            int temp=arr[i];
            arr[i]=arr[last-i];
            arr[last-i]=temp;
        }
    }

    public static void printPairs(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]);
            }
            System.out.println();
        }
    }

    public static void maxSubArraySum(int arr[]){

        int maxsum=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");
                 sum=sum+arr[k];

            }
           maxsum= Math.max(maxsum, sum);
            System.out.println();
        }System.out.println();
     }
     System.out.println(maxsum);
    }
public static void main(String args[]){
    int arr[]={1,-2,-3,4,5};
  //  reverseArray(arr);
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }
    maxSubArraySum(arr);
}
}