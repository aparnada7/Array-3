/*
Brute force:
    Space: O(mn) Time:O(m*n)
Solution #1: Use k to keep rotating one by one
    Time: O(n*k)
    Space: O(1)
Solution #2[For rotate array by reversal solution below]:
    Space: O(1) constant as in-place reversal only in given array
    Time: O(N) traverse the given array of size n
 */
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return;
        }
        
        //Logic
        //First reverse the complete array
        //Now reverse in parts - 0-k & k-n-1
        int n = nums.length;
        if(k>n){
            k=k%n;
        }
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    
    private void reverse(int[] arr, int l, int r){
            while(l<r){
                swap(arr, l, r);
                l++;
                r--;
            }
        }
    
    private void swap(int[] arr, int l, int r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        
}
