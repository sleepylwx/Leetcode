import java.util.List;
import java.util.Stack;

/**
 * Created by 36249 on 2017/1/13.
 */
public class ClimbingStairs {


    public int climbStairs(int n){

        if(n == 0 || n == 1)
            return n;
        int res = 0;
        int q1 = 1;
        int q2 = 1;
        for(int i = 1; i < n; ++i){

            res = q1 + q2;
            q1 = q2;
            q2 =res;
        }

        return res;
    }


}
