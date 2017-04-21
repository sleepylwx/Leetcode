import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2017/1/31.
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows){


        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0){

            return res;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);
        for(int i = 1; i < numRows; ++i){

            temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0; j < i - 1;++j){

                temp.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
            }
            temp.add(1);
            res.add(temp);
        }

        return res;
    }
}
