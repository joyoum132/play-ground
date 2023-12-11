import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(' :
                    stack.add(c);
                    break;
                case ')' :
                    if(stack.isEmpty()) return false;
                    else stack.pop();
            }
        }

        return stack.isEmpty();
    }
}