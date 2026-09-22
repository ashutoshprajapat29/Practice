import java.util.*;
public class IsValidString {

    public static boolean CheckValidString(String s){
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else if(c==')'||c=='}'||c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                System.out.println(c);
                System.out.println(top);
                if((c==')'&&top!='(')||
                    (c=='}'&&top!='{') ||
                    (c==']'&&top!='[') ){
                        return false;
                    }
            }
        } return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = new String();
        str="fds(fdsc)nn";
        System.out.println(CheckValidString(str));
    }
}
