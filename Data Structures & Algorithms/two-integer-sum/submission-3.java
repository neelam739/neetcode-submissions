class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] pair = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));

        int l=0; int r=nums.length-1;
        while (l < r) {
            int sum=pair[l][0]+pair[r][0];
            if(sum==target) {
                int i = pair[l][1], j = pair[r][1];
                return new int[]{Math.min(i, j), Math.max(i, j)};
            }
            if(sum>target) r--;
            else l++;
        }
        return null;
    }
}