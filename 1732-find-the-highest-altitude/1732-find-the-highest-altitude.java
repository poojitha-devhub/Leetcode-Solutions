class Solution {
    public int largestAltitude(int[] gain) {
        int var=0;
        int maxans=0;
        for(int i=0;i<gain.length;i++){
            var=var+gain[i];
            maxans=Math.max(var,maxans);
        }
        return maxans;
    }
        
}