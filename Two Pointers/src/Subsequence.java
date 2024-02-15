public class Subsequence {

    public boolean isSubsequence(String s, String t) {
        if(s.length()> t.length()){
            return false;
        }
        int idxS = 0;
        for(int i =0; i<t.length() && idxS< s.length(); i++){
            if(t.charAt(i)==s.charAt(idxS)){
                idxS++;
            }
        }
        return idxS == s.length();
    }
}
