import java.util.*;

class Solution {
    public int solution(int n) {
        if(n <= 1) return n;
        int num = 1;
        int acc = 0;
        while(num < Math.sqrt(n)) {
            if(n % num == 0) {
                acc += num;
                acc += n/num;
            }
            num++;
        }
        if(num == Math.sqrt(n)) {
            acc += num;
        }

        return acc;
    }
}