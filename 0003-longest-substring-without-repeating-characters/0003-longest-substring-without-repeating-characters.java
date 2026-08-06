class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int len=0;
        int maxlen=0;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch)&&map.get(ch)>=l){
                l=map.get(ch)+1;
            }
            len=r-l+1;
            maxlen=Math.max(len,maxlen);
            map.put(ch,r);
            r++;
        }
        return maxlen;
      
    }
}