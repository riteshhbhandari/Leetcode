class Solution {
    public boolean isSubsequence(String s, String t) {
        int ctr =0;
        if(s.length()==0 )
            return true;
        if(t.length()==0)
            return false;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(ctr)){
                ctr++;
                if(ctr==s.length()){
                    return true;
                }
            }
        }

        return false;
    }
}