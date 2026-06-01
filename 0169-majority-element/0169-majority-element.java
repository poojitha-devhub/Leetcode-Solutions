class Solution {
    public int majorityElement(int[] nums) {
        for(int val : nums){
            int frequency=0;
            for(int i : nums){
                if(val==i){
                    frequency++;
                }
            }
            if(frequency>(nums.length/2)){
                return val;
            }
        }
        return 0;
    }
}