class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                secondmax=max;
                max=nums[i];
            }
            if(nums[i]>secondmax && nums[i]!=max){
                secondmax=nums[i];
            }
            
        }
        return(max-1)*(secondmax-1);
        
    }
}