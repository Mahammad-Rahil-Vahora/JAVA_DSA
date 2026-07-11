public class bestTimeBuyAndSellStock {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4,10,98};
        int ans = bAs(prices);
        System.out.println("Maximum profit is: "+ ans);

    }
    public static int bAs(int [] arr){
        int n = arr.length;
        int minPrice = arr[0];
        int maxProfit = 0;

        for(int i = 0; i < n; i++){
            if(minPrice > arr[i]){
                minPrice = arr[i];
            }
            else {
                int profit = arr[i] - minPrice;

                if(maxProfit < profit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
