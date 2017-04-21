import java.util.HashSet;
import java.util.Set;

/**
 * Created by 36249 on 2017/1/12.
 */
public class HappyNumber {

    public boolean isHappy(int n){

        Set<Integer> set = new HashSet<>();
        int res = n;
        set.add(n);
        while(res != 1){



            int sum = 0;
            while(res != 0){

                int q = res%10;
                sum += q*q;
                res /= 10;
            }

            res = sum;
            if(!set.add(res)){

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        HappyNumber test = new HappyNumber();
        System.out.println(test.isHappy(7));
    }
}
