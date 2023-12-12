import java.util.*;
class Solution {
    public int solution(int n) {
        int[] arr = new int[n+1];

        for(int i=0;i<=n;i++) {
            arr[i] = i;
        }

        for(int i=2;i<=n;i++) {
            if(arr[i] == 0) continue;

            for(int j=2; j<=n/i; j++) {
                arr[j*i] = 0;
            }
        }
        return (int) Arrays.stream(arr).filter(it -> it != 0).count()-1;
    }
}