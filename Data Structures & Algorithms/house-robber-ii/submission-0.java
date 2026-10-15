class Solution {
    public int rob(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        int rob1=0;
        int rob2=0;
        int rob3=0;
        int rob4=0;

        for(int i=0;i<nums.length;i++){
            if(i>0){
                int temp1=Math.max(nums[i]+rob1,rob2);
                rob1=rob2;
                rob2=temp1;
            }
            if(i<nums.length-1){
                int temp2=Math.max(nums[i]+rob3,rob4);
                rob3=rob4;
                rob4=temp2;
            }
        }
        return Math.max(rob2,rob4);
    }
}