/**
 * Created by 36249 on 2016/11/26.
 */
public class FirstUniqueCharacterInAString {


    public int firstUniqChar(String s) {

        int[] map = new int[26];

        for(int i = 0; i < s.length() ;++i){

            ++map[s.charAt(i) - 'a'];
        }

        for(int i = 0; i < s.length(); ++i){

            if(map[s.charAt(i)-'a'] == 1){

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";
        FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();
        System.out.println(solution.firstUniqChar(s));
    }
}
