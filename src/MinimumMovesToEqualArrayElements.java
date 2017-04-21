/**
 * Created by 36249 on 2016/11/25.
 */
public class MinimumMovesToEqualArrayElements {


    public int minMoves(int[] nums) {

        int min = nums[0];
        for(int i = 0; i < nums.length ;++i){

            if(min > nums[i]){

                min = nums[i];
            }
        }

        int res = 0;
        for(int i = 0; i < nums.length ;++i){

            res += (nums[i] - min);
        }

        return res;
    }
}
