/**
 * Created by 36249 on 2017/3/5.
 */
public class FactorialTrailingZeros {

    public int trailingZeroes(int n){

        return n == 0? 0:n/5 + trailingZeroes(n/5);
    }

    public static void main(String[] args) {

        long num = 1;
        for(int i = 30; i >= 1 ;--i){

            num *= i;
        }

        System.out.println(num);
        FactorialTrailingZeros test = new FactorialTrailingZeros();
        System.out.println(test.trailingZeroes(30));
    }
}
