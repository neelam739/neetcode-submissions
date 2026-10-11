class Solution {
    public int maxProfit(int[] p) {
       int max=0; int l=0, r=l+1;
       while( r<p.length){
        if(p[l] < p[r]){
            max= Math.max(max, p[r]-p[l]);
        }else {
            l=r;
        }
        r++;
       } 
       return max;
    }
}
