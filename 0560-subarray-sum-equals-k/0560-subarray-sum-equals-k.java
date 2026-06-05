class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int prefix[]=new int[nums.length];
        //define prefix
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        //define subarray
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                int sum=0;
                if(i==0){
                    sum=prefix[end];
                    if(sum==k){
                        count++;
                    }
                }
                else{
                    sum=prefix[end]-prefix[start-1];
                    if(sum==k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}