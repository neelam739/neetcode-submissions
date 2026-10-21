class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }
        int minLen = Integer.MAX_VALUE, l = 0, startIdx = 0;
        int count = t.length();
        for(int r = 0; r < s.length(); r++){
            if(freq[s.charAt(r)] > 0){
                count--;
            }
            freq[s.charAt(r)]--;
            while(count == 0){
                if(r - l + 1 < minLen){
                    minLen = r - l + 1;
                    startIdx = l;
                }
                freq[s.charAt(l)]++;

                if(freq[s.charAt(l)] > 0){
                    count++;
                }
                l++;
                
            }
        }
        if(minLen == Integer.MAX_VALUE) return "";
        return s.substring(startIdx, startIdx + minLen);
    }
}