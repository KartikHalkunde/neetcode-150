class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int n = arr.length;
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            int prevonedelete = onedelete;
            int prevnodelete = nodelete;
            int curr = arr[i];

            nodelete = Math.max(prevnodelete + curr, curr);

            if(prevonedelete == Integer.MIN_VALUE){
                onedelete = prevnodelete;
            }else{
               onedelete = Math.max(
                prevonedelete + curr,
                prevnodelete
            );
            }

            result = Math.max(result, Math.max(nodelete, onedelete));
        }

        return result;
    }
}
