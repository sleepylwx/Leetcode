import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2017/1/8.
 */
public class FindAllNumbersDisappearedInAnArray {


    public List<Integer> findDisappearedNumbers(int[] nums){

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; ++i){

            --nums[i];
        }
        for(int i = 0; i < nums.length; ++i){

            int temp = nums[i]%nums.length;
            nums[temp] %= nums.length;
            nums[temp] += nums.length;
        }
        for(int i = 0; i < nums.length ; ++i){

            if(nums[i] < nums.length){

                result.add(i+1);

            }
        }

        return result;
    }

    public static void main(String[] args) {

        new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
}
