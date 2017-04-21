/**
 * Created by 36249 on 2017/3/5.
 */
public class RemoveDupicatesFromSortedArray {


    public int removeDuplicates(int[] nums){

        int n = nums.length;
        if(n < 2){

            return n;
        }

        int length = 1;
        for(int i = 1; i <n ; ++i){

            if(nums[i] != nums[i-1]){

                nums[length++] = nums[i];
            }
        }

        return length;
    }


    public static void main(String[] args) {

        RemoveDupicatesFromSortedArray test = new RemoveDupicatesFromSortedArray();
        System.out.println(test.removeDuplicates(new int[]{1,3,4,3}));
    }
}
