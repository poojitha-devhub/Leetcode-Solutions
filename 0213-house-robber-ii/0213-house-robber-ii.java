class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        //exclude start
        int case1=robcircle(nums,1,n-1);
        //exclude last
        int case2=robcircle(nums,0,n-2);

        return Math.max(case1,case2);
    }
    public int robcircle(int[] nums,int start, int end){
        int size=end-start+1;
        int dp[]=new int[size];
        dp[0]=nums[start];
        if(size>1){
            dp[1]=Math.max(nums[start],nums[start+1]);
        }
        for(int i=2;i<size;i++){
            int curr=nums[start+i];
            dp[i]=Math.max(curr+dp[i-2],dp[i-1]);
        }
        return dp[size-1];
    }
}