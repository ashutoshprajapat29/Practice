package Arrays;
public class Main2 {

    public static int findIndex(int arr[],int num){
        for(int i=0;i<num;i++){
           
           for(int j=0; j<arr.length-1;j++){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
           }
        }

        //to find given num
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};
        System.out.println(findIndex(arr, 4

        ));
        
    }
}
