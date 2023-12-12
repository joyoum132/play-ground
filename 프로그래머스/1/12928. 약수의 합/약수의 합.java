import java.util.*;

class Solution {
    public int solution(int n) {
        if(n <= 1) return n;
        int answer = 1;
        
        int num = 2;
        while(num < Math.sqrt(n)) {
            if(n%num == 0) {
                answer += num;
                answer += n/num;
            }
            num++;
        }
        
        if(num == Math.sqrt(n)) {
            answer+= num;
        }

        return answer+n;
    }
}