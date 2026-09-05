class Solution {
    public int totalFruit(int[] fruits) {

        int low = 0;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int high = 0; high < fruits.length; high++) {

            int fruit = fruits[high];

            // Add current fruit
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            // More than 2 types of fruits
            while (map.size() > 2) {

                int leftFruit = fruits[low];

                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                low++;
            }

            // Current window has at most 2 fruit types
            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}
