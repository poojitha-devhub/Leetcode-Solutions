class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            String a=words[i];
            int s=a.length();
            boolean isPalindrome=true;
            for(int j=0;j<s/2;j++){
                if(a.charAt(j)!=a.charAt(s-1-j)){
                    isPalindrome=false;
                    break;
                }
            }
            if(isPalindrome){
                return a;
            }
        }
        return "";
        
    }
}