import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        double A = (double) a;
        double B = (double) b;
        while(A != B) {
            A = Math.ceil(A/2);
            B = Math.ceil(B/2);
            answer++;
        }
        return answer;
    }
}