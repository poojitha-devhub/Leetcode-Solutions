class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            int a=nums[i];
            freq[a-1]=1;
            
        }
        for(int j=0;j<n;j++){
            if(freq[j]==0){
                ans.add(j+1);
            }
        }
        return ans;    
    }
}