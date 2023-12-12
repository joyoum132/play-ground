class Solution {
    public int[] solution(int n, int m) {
        int gcdVal = gcd(n, m);
        return new int[] {gcdVal, m*n/gcdVal};
    }
    
    public int gcd(int n, int m) {
        int val = n % m;
        return (val==0) ? m : gcd(m, val);
    }
}