class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int temp[]=new int[k];
        for(int i=(n-k);i<n;i++){
            temp[i-(n-k)]=nums[i];
        }
        for(int j=n-k-1;j>=0;j--){
            nums[j+k]=nums[j];
        }
        for(int a=0;a<k;a++){
            nums[a]=temp[a];
        }
        
    }
}