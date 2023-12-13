import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        
        //todo 퀵정렬로 구현해보라
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        // Arrays.sort(nums);
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    }
    
    void quickSort(int[] arr,int start, int end) {
        if(start >= end) return;
        int pivotIdx = start;
        int pivot = arr[pivotIdx];
        int left = start+1;
        int right = end;
        
        while(left<=right) {
            while(left<=right && pivot >= arr[left]) {
                left++;
            }
            
            while(left<=right && pivot < arr[right]) {
                right--;
            }
            
            if(left<right) {
                swap(arr, left, right);
            }
        }
        swap(arr, pivotIdx, right);
        pivotIdx = right;
        quickSort(arr, start, pivotIdx-1);
        quickSort(arr, pivotIdx+1, end);
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}