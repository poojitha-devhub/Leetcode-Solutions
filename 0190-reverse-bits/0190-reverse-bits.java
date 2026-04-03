class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            int bit=n&1;// get last bit
            result=(result<<1)|bit;// shift result and add bit
            n=n>>1;// shift n to process next bit

        }
        return result;
        
    }
}