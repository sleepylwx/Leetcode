import java.util.ArrayList;

/**
 * Created by 36249 on 2017/1/13.
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices){

        int res = 0;
        if(prices == null || prices.length == 0){

            return res;
        }

        int cur = prices[0];
        for(int i = 1; i < prices.length; ++i){

            if(prices[i] > cur){

                res = Math.max(prices[i] - cur,res);
            }
            else{
                cur = prices[i];
            }

        }

        return res;
    }



    // 2 16  1 7 9  10
}
