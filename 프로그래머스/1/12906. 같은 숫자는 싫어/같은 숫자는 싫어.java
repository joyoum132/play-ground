import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);

        for (int i=1; i<arr.length; i++) {
            if(!s.isEmpty() && arr[i] != s.peek()) {
                s.add(arr[i]);
            }
        }

        return s.stream().mapToInt(it->it).toArray();
    }
}