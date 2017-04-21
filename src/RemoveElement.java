/**
 * Created by 36249 on 2017/1/31.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val){


        int j = nums.length;
        for(int i = 0 ; i < j; ++i){


            if(nums[i] == val){

                for(j = j -1;j > i;--j){

                    if(nums[j] != val){

                        nums[i] = nums[j];
                        break;
                    }
                }
            }
        }
        return j;

    }
}
