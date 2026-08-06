class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int max=0;
        int len=0;
        int zeroes=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            if(zeroes<=k){
                len=r-l+1;
                max=Math.max(len,max);
            }
            r++;
        }
        return max;
        
    }
}