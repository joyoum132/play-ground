class Solution {
    public int solution(int[][] sizes) {
        int mw = 0;
        int mh = 0;

        for (int[] s : sizes) {
            if (s[0] > s[1]) {
                int temp = s[0];
                s[0] = s[1];
                s[1] = temp;
            }

            if (s[0] > mw) mw = s[0];
            if (s[1] > mh) mh = s[1];
        }
        return mw * mh;
    }
}