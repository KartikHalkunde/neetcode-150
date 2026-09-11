class Solution {
    public String minWindow(String s, String t) {

        if(t.length() > s.length()){
            return "";
        }

        int low = 0;
        int res = Integer.MAX_VALUE;
        int length = 0;
        int n = s.length();
        int start = 0;

        int[] sash = new int[256];
        int[] tash = new int[256];

        for(int i = 0; i < t.length(); i++){
            tash[t.charAt(i)]++;
        }

        for(int high = 0; high < n; high++){
            sash[s.charAt(high)]++;

            while(sahi(sash, tash)){
                length = high - low + 1;
                
                if(length < res){
                    res = length;
                    start = low;
                }
                sash[s.charAt(low)]--;
                low++;
            }
        }
        if(res == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, res + start);
    }

    boolean sahi(int[] sash, int[] tash){

        for(int i = 0; i < tash.length; i++){

            if(tash[i] > sash[i]){
                return false;
            }
        }
        return true;
    }
}
