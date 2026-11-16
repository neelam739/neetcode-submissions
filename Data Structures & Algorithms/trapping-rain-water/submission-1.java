class Solution {
    public int trap(int[] ht) {
        int[] maxl= new int[ht.length];
        int[] maxr= new int[ht.length];
        maxl[0]=0; maxr[ht.length-1]=0;
        int leftMax = 0;
        for(int i=1;i<ht.length;i++){
            leftMax= Math.max(leftMax,ht[i-1]);
            maxl[i]=leftMax;
           // System.out.println(maxl[i]);
        }
        leftMax=0;
        System.out.println(" -- ");
        for(int i=ht.length-2 ; i>=0 ; i--){
            leftMax= Math.max(leftMax,ht[i+1]);
            maxr[i]=leftMax;
          //  System.out.println(maxr[i]);

        }
        leftMax=0;
        for(int i=0;i<ht.length ;i++){
            int count =Math.min(maxr[i],maxl[i])-ht[i];
            if(count>0) leftMax+=count;
        }
        return leftMax;
    }
}
