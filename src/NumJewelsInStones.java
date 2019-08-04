import java.util.HashMap;
import java.util.Map;

public class NumJewelsInStones {


    public int numJewelsInStones(String J, String S) {


        int[] map = new int[128];

        for(int i = 0 ; i < S.length(); ++i){

            ++map[S.charAt(i)];
        }

        int res = 0;
        for(int i = 0; i < J.length(); ++i){

            res += map[J.charAt(i)];
        }

        return res;
    }




}
