class Solution {
    public int maxArea(int[] ht) {
        int l=0, r=ht.length-1;
        int max=0;
        while(l<r){
            int water = Math.min(ht[l],ht[r]) * (r-l);
            max= Math.max(max,water);
            if(ht[l]<ht[r]) l++;
            else r--;
        }


return max;
    }
}
