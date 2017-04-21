import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 36249 on 2017/3/5.
 */
public class PascalsTraiangleII {

    public List<Integer> getRow(int rowIndex){

        List<Integer> res = new ArrayList<>();

        Integer[] temp = new Integer[rowIndex+1];

        temp[0] = 1;


        for(int i = 1; i < rowIndex+1 ;++i){

            for(int j = i; j > 0; --j ){

                temp[j] = temp[j] + temp[j-1];
            }

        }

        return Arrays.asList(temp);
    }
}
