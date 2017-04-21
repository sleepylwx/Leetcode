import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 36249 on 2017/1/10.
 */
public class NumberOfBoomerangs {


    public int numberOfBoomerangs(int[][] points){


        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0; i <points.length; ++i){

            for(int j = 0; j < points.length;++j){

                if(i == j){

                    continue;
                }
                int distance = getDistance(points[i],points[j]);
                map.put(distance,map.getOrDefault(distance,0)+1);
            }

            for(Integer value : map.values()){

                result += value*(value-1);
            }
            map.clear();
        }

        return result;
    }

    private int getDistance(int[] pointA,int[] pointB){

        int x = pointA[0] - pointB[0];
        int y = pointA[1] - pointB[1];
        return x * x + y * y;
    }
}
