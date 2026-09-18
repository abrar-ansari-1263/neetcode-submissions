class Solution {
    public boolean isAnagram(String s, String t) {
        

        if(s.length() != t.length()){
            return false;
        }
        char[] str = s.toCharArray();
        char[] ttr = t.toCharArray();

         Arrays.sort(str);
         Arrays.sort(ttr);   

        for(int i = 0 ; i < str.length;i ++){
            if(str[i] != ttr[i]){
                return false;
            }
        }
        return true;
    }
}
