import java.util.*;

public class Solution {
    public int solution(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int sum = 0;
        for (char ch : arr) {
            sum += (ch - '0');
        }
        return sum;
    }
}