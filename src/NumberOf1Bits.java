/**
 * Created by 36249 on 2017/1/14.
 */
public class NumberOf1Bits {

    public int hammingWeight(int n){

        int  res = 0;
        int mask = 1;

        while(n != 0){

            res += (n&mask);
            n >>>= 1;
        }
        return res;
    }


}
