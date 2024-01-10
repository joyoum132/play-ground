import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        double A = Math.ceil((double) a/2);
        double B = Math.ceil((double) b/2);
        while(A != B) {
            A = Math.ceil(A/2);
            B = Math.ceil(B/2);
            answer++;
        }
        return ++answer;
    }
}