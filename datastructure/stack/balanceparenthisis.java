package datastructure.stack;

import javax.swing.text.StyledEditorKit;
import java.util.Stack;

public class balanceparenthisis {
    static Stack<Character> s = new Stack<>();
    public static Boolean isparent(String str){
        for(int i = 0 ; i <=str.length();i++){
            char cur =  str.charAt(i);
            if(isopen (cur)){
                s.push(cur);
            }
            else{
                if(s.isEmpty()){
                    return false;
                } else if (!ismatch(cur,s.peek())) {
                    return false;
                }else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
    public static  Boolean isopen(char cur){
        return (cur=='{' || cur=='['|| cur == '(');
    }
    public static  Boolean ismatch(char a,char b){
        return (a=='('&&b==')'||a=='['&&b==']'||a=='{'&&b=='}');
    }

    public static void main(String[] args) {
        balanceparenthisis bl = new balanceparenthisis();

    }
}
