import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 36249 on 2017/1/9.
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] num1,int[] num2){

        Arrays.sort(num1);
        Arrays.sort(num2);
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(true){

            if(i >= num1.length || j >= num2.length){

                break;
            }

            if(num1[i] == num2[j]){

                result.add(num1[i]);
                ++i;
                ++j;
            }
            else if(num1[i] > num2[j]){

                ++j;
            }
            else{

                ++i;
            }
        }

        int[] arrayResult = new int[result.size()];
        for(int k = 0; k < arrayResult.length; ++k){

            arrayResult[k] = result.get(k);
        }
        return arrayResult;
    }

}
