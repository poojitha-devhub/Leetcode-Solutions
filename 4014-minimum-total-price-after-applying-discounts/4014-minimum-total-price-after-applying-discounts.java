class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int n=prices.length;
        int m=discounts.length;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=n-1;
        int j=m-1;
        double total=0;
        while(i>=0 && j>=0){
            double cost=prices[i]*(100-discounts[j]);
            total+=cost/100;
            i--;
            j--;
        }
        while(i>=0){
            total+=prices[i];
            i--;
        }
        return total;
        
    }
}