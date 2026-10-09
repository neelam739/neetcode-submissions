class Solution {
    public int[] productExceptSelf(int[] nums) {
      int prev=1;
      int n= nums.length;
      int[] output= new int[n];
      for(int i=0;i<n ;i++){
        output[i] = prev ;
        prev = prev*nums[i];
       // System.out.println(output[i]);
      }
      prev=1;
    for(int i=n-1; i>= 0 ;i--){
        output[i] = prev * output[i];
        prev = prev * nums[i];
    }
    return output;
    }
}  
