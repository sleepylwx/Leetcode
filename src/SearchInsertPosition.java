/**
 * Created by 36249 on 2017/1/27.
 */
public class SearchInsertPosition {


    public int searchInsert(int[] nums, int target){

        int start = 0;
        int last = nums.length-1;
        while(start <= last) {

            int index = (start + last)/2;
            if(nums[index] > target){

                last = index - 1;
            }
            else if(nums[index] == target){

                return index;
            }
            else{

                start = index + 1;
            }
        }

        return start;

    }
}
