package leetcode;

import java.util.Stack;

public class IsValid20 {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

     有效字符串需满足：

     左括号必须用相同类型的右括号闭合。
     左括号必须以正确的顺序闭合。
     注意空字符串可被认为是有效字符串。

     示例 1:

     输入: "()"
     输出: true
     示例 2:

     输入: "()[]{}"
     输出: true
     */

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>() ;
        char[] chars = s.toCharArray();

        for (char c:chars
             ) {
            if(stack.isEmpty())
                stack.push(c);
            else if (isV(stack.peek(),c))
                stack.pop();
            else
                stack.push(c);

        }

        return stack.size() == 0;
    }


    public boolean isV(char c1,char c2){
        return ((c1 =='(')&&c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');

    }
}
