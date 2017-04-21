import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 36249 on 2017/1/9.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums){

        if(nums == null || nums.length < 2){

            return false;
        }
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1; ++i){

            if(nums[i] == nums[i+1]){

                return true;
            }
        }
        return false;
    }
}
