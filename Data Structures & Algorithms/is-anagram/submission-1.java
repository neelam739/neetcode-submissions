class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sc= new char[26];
        for(int i=0;i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            sc[t.charAt(i)-'a']--;
        }
        for (int i=0;i<26;i++){
            if(sc[i]!=0) return false;
        }
    return true;
    }
}
