class Solution {
    public int bitwiseComplement(int n) {
        int bits=(int)(Math.log(n)/Math.log(2))+1;
        int bitmask=(1<<bits)-1;
        return n^bitmask;
        
    }
}