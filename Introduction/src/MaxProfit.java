public class MaxProfit {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int pist = 0;

        int lsf = Integer.MAX_VALUE;

        for (int price : prices) {

            if (price < lsf) {
                lsf = price;
            }
            pist = price - lsf;

            if (pist > profit) {
                profit = pist;
            }
        }
        return profit;

    }
}
