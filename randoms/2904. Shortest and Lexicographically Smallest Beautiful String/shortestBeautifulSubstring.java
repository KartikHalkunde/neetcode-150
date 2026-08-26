class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int count = 0;
        String ans = "";
        int left = 0;
        for(int right = 0; right < n ; right++){
            if(s.charAt(right) == '1'){
                count++;
            }
            if(count == k){
                while(s.charAt(left) == '0'){
                    left++;
                }
                String current = s.substring(left, right + 1);
                if(ans.equals("")|| current.length() < ans.length()||
                (current.length() == ans.length() && current.compareTo(ans) < 0)){
                    ans = current;
                }
                count--;
                left++;
            }
        } 
        return ans;
       
    }
}
