class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(result);
        int l=0, r = result.length()-1;
        while(l<=r){
            if(result.charAt(l)==result.charAt(r))
            { l++;r--;}
           else
           return false;
           
        }
    return true;
    }
}
