/**
 * Created by 36249 on 2016/11/26.
 */


/**
 *
 * this question tell us a truth the method : String.charAt() has a if judgement
 * which is using more time than array[i] to visit a element
 */
public class ValidAnagram {


    public boolean isAnagram(String s, String t) {

        int[] map = new int[26];
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        for(int i = 0; i <a1.length; ++i){

            ++map[a1[i] - 'a'];
        }
        for(int i = 0; i < a2.length ;++i){

            --map[a2[i] - 'a'];
        }
        for(int i = 0; i < 26; ++i){

            if(map[i] != 0){

                return false;
            }
        }

        return true;
    }
}
