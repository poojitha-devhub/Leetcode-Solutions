class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small){
                small=nums[i];
            }
            if(nums[i]>large){
                large=nums[i];
            }
        }
        for(int i=small;i<=large;i++){
            list.add(i);
        }
        for(int i=0;i<nums.length;i++){
            list.remove(Integer.valueOf(nums[i]));
        }
        return list;
        
        
    }
}