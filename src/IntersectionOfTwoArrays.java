import java.util.*;

/**
 * Created by 36249 on 2016/11/25.
 */
public class IntersectionOfTwoArrays {


    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        List<Integer> arr = new ArrayList<>();
        for(int i : nums1){

            set1.add(i);
        }

        for(int i : nums2){

            if(set1.remove(i)){

                arr.add(i);
            }
        }

        int[] res = new int[arr.size()];
        for(int i = 0; i < arr.size(); ++i){

            res[i] = arr.get(i);
        }
        return res;
    }
}
