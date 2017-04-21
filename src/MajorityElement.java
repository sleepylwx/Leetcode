import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by 36249 on 2016/11/27.
 */

/**
 *  first time I saw the question,I think it can be solved in O(n)time and O(1)space
 *such as using a for loop and few variable.
 *  But I didn't get a way instantly,so I use a easily thought solution : using HashMap to
 *  map the num and the appearing time of the num. if the num is limited in a certain number
 *  I will just use a array to map it.
 *
 *  This is a best way to get the major number
 */
public class MajorityElement {


    public int majorityElement(int[] nums) {

        int res = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; ++i){


            if(res == nums[i]){

                ++count;
            }
            else if(count != 0){

                --count;
            }
            else{

                res = nums[i];
                count = 1;
            }
        }

        return res;
    }
}
