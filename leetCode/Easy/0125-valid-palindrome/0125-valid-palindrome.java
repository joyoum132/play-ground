class Solution {
    public boolean isPalindrome(String s) {
        
        int l = 0;
        int r =s.length()-1;
        String input = s.toLowerCase();
        while(l<r) {
            byte a = (byte)input.charAt(l);
            byte b = (byte) input.charAt(r);

            if(!(a <= 122 && a >= 97 || a>= 48 && a <= 57)) l++;
            else if(!(b <= 122 && b >= 97 || b>= 48 && b <= 57)) r--;
            else {
                if(a != b) return false;
                l++;
                r--;
            }
        }
        return true;
    }
}