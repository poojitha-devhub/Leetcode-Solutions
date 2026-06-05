class Solution {
    public int prefixCount(String[] words, String pref) {
        int total=0;
        for(String word : words){
            if(word.length()<pref.length()){
                continue;
            }
            int i=0;
            while(i<pref.length()&& word.charAt(i)==pref.charAt(i)){
                i++;
            }
            if(i==pref.length()){
                total++;
            }
        }
        return total;
        
    }
}