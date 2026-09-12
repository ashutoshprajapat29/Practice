package Arrays;

public class Stocks {

    public static int maxProfit(int arr[]){
        int maxProfit=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              int  profit=arr[j]-arr[i];
              maxProfit=Math.max(maxProfit, profit);

            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
System.out.println(maxProfit(arr));
    }
}
