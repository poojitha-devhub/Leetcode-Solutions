class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int len=0;
            int wt=0;
            while(len<s.length()){
                char a=s.charAt(len);
                int b=a-'a';
                wt+=weights[b];  
                len++;
            } 
            int t=wt%26;
            char b=(char)('z'-t);
            ans+=b;
        }
        return ans;
    }
}