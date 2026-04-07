import java.util.*;
public class balanced_stack{
    public static boolean isBalanced(String exp) {
        Deque<Character> stack=new ArrayDeque<>();
        for(char ch:exp.toCharArray())
        {
            if(ch=='('||ch=='['||ch=='{')
            {
                stack.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}')
            {
                if (stack.isEmpty()) 
                    return false;
                char top = stack.pop();
                if((ch==')' && top!='(') || (ch==']' && top!='[')||(ch=='}' && top!='{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String exp="{[()]}";
        System.out.println(isBalanced(exp) ? "Balanced" : "not balanced");
    }
    
}