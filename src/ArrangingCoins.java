/**
 * Created by 36249 on 2017/3/5.
 */
public class ArrangingCoins {



    public int arrangeCoins(int n){


        return (-1+(int)Math.sqrt(1+8*(long)n))/2;

    }
    public static void main(String[] args) {

        ArrangingCoins test = new ArrangingCoins();
        System.out.println(test.arrangeCoins(20));

    }
}
