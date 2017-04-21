import java.util.Arrays;

/**
 * Created by 36249 on 2016/11/25.
 */


/**
 *
 * greedy algorithm
 */
public class AssignCookies {


    /**
     *
     *
     * @param g is the greed factor array of the children
     * @param s is the size array of the cookies
     * @return  the num of content children
     */
    public int findContentChildren(int[] g, int[] s) {


        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int res = 0;
        for(; i < g.length; ++i){

            if(j == s.length){

                break;
            }

            for(; j < s.length; ++j){


                if(g[i] <= s[j]){

                    ++res;
                    ++j;
                    break;
                }
            }

        }

        return res;
    }
}
