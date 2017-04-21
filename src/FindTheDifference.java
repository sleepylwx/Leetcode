/**
 * Created by 36249 on 2016/11/25.
 */


/**
 *
 * using the ^ operator to find the difference between to object
 */
public class FindTheDifference {


    public char findTheDifference(String s, String t) {

        char a = 0;
        char b = 0;

        for(int i = 0; i < s.length(); ++i){

            a ^= s.charAt(i);
            b ^= t.charAt(i);
        }
        for(int i = 0; i < t.length(); ++i){

            b ^= t.charAt(i);
        }

        return (char)(a^b);
    }


    public static void main(String[] args) {

        String s = "tefgb";
        String t = "baetfg";
        FindTheDifference solution = new FindTheDifference();
        System.out.println(solution.findTheDifference(s,t));
    }
}
