package Arrays;
import java.util.*;
public class Footn{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
 int n=sc.nextInt();
 int teamA[]=new int [n];
 for(int i=0;i<n;i++){
    teamA[i]=sc.nextInt();
 }
 int m=sc.nextInt();
 int teamB[]=new int [m];

 for(int i=0;i<m;i++){
    teamB[i]=sc.nextInt();
 }
Arrays.sort(teamA);

int low=0;
int high=teamA.length;
while(low<=high){
    int mid=low+(high-low)/2;
    if(mid)
}

// for(int i=0;i<teamB.length;i++){
// int count=0;
// for(int j=0;j<teamA.length;j++){
//     if(teamA[j]<=teamB[i]){
//         count ++;
//     }else{
//         break;
//     }
// }
// System.out.println(count);
// }
    }
}