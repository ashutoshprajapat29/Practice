
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine().trim();
        StringBuilder nrmlStr=new StringBuilder(str);
        nrmlStr.reverse();
        
        StringBuilder password=new StringBuilder();

         int i=0;
            while(i<str.length()){
                //check first two digits 
                String twoNum=nrmlStr.substring(i,i+2);
                int value=Integer.parseInt(twoNum);

                if(value==32||(value>=65&&value<=90)||(value>=97 && value<=99)){
            password.append((char)value);
                    i+=2;
                    continue;
                }else{
                    String threeNum=nrmlStr.substring(i,i+3);
                int value2=Integer.parseInt(threeNum);
                password.append((char)value2);
                i+=3;
                }
            }
            System.out.println(password.toString());
    }
}
