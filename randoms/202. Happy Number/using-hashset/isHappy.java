class Solution {
    public int squareSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += (digit * digit);
            n /=  10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = squareSum(n);

        while(n != 1){
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
                n = squareSum(n);
                }
            }
        return true;
    }
}
