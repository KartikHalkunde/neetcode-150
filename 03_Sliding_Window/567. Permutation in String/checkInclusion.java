class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count1 = new int[26];
        int [] count2 = new int[26];
        int low = 0;

        if(s1.length() > s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            count1[s1.charAt(i) - 'a']++;
        }
        for(int high = 0; high < s2.length(); high++){
            count2[s2.charAt(high) - 'a']++;

            if((high - low + 1) > s1.length()){
                count2[s2.charAt(low) - 'a']--;
                low++;
            }
            if(Arrays.equals(count1, count2)){
                return true;
            }
            }
        return false;
    }
}
