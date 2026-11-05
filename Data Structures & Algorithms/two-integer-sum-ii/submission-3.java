class Solution {
    public int[] twoSum(int[] num, int target) {
    int l=0 , r=num.length-1;
    while(l<r){
      
      if(num[l]+num[r] == target) 
        return new int[]{l+1,r+1};
      if(num[l]+num[r]> target) r--;
      if(num[l]+num[r]< target) l++;
    }
 return new int[]{l+1,r+1};
 }
}