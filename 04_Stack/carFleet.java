class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        //Stratergy: solved using 2d array and stack
        /*
	 Question: 
There are n cars at given miles away from the starting mile 0, traveling to reach the mile target.

You are given two integer arrays position and speed, both of length n, where position[i] is the starting mile of the ith car and speed[i] is the speed of the ith car in miles per hour.

A car cannot pass another car, but it can catch up and then travel next to it at the speed of the slower car.

A car fleet is a single car or a group of cars driving next to each other. The speed of the car fleet is the minimum speed of any car in the fleet.

If a car catches up to a car fleet at the mile target, it will still be considered as part of the car fleet.

Return the number of car fleets that will arrive at the destination.
	*/

        int n = position.length;
        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a,b) -> Integer.compare(a[0], b[0]));

        Stack<Double> stack = new Stack<>();

        for(int i = n  - 1; i >= 0; i--){
            
            double time = (double)(target - cars[i][0]) / cars[i][1];

            if(stack.isEmpty() || time>stack.peek()){
                stack.push(time);
            }

        }
        return stack.size();
    }
}
