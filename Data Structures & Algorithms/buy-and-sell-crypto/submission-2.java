class Solution {
    public int maxProfit(int[] p) {
       int max=0; int l=0, r=l+1;
       while(l<r && r<=p.length-1){
        if(p[l] < p[r]){
            max= Math.max(max, p[r]-p[l]);
            System.out.println(max);
            r++;
        }else {
            l=r;r++;
            System.out.println(l+"--"+r);
        }
       } 
       return max;
    }
}
