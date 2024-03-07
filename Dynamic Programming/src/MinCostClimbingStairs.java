public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] currentCost = new int[cost.length];
        currentCost[0] = cost[0];
        currentCost[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            currentCost[i] = Math.min(currentCost[i - 1] + cost[i], currentCost[i - 2] + cost[i]);
        }
        return Math.min(currentCost[cost.length - 1], currentCost[cost.length - 2]);
    }
}
