class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if(arr.length < k) return 0;
        int sum = 0;
        int result = 0;
        
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(i >= k-1) {
        
                if(sum/k >= threshold) result+=1;
                sum -= arr[i-k+1];
            }
        }
        return result;
    }
}