import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by 36249 on 2017/1/8.
 */
public class LongestPalindrome {

    public int longestPalindrome(String s){


        Map<Character,Integer> alphaNumbers = new HashMap<>();
        int flag = 0;
        for(int i = 0; i < s.length(); ++i){

            char ch = s.charAt(i);
            if(alphaNumbers.containsKey(ch)){

                alphaNumbers.put(ch,alphaNumbers.get(ch)+1);
            }
            else{

                alphaNumbers.put(ch,1);
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet = alphaNumbers.entrySet();
        Iterator<Map.Entry<Character,Integer>> ita = entrySet.iterator();
        int result = 0;
        int oddMax = 0;
        while(ita.hasNext()){

            Map.Entry<Character,Integer> entry = ita.next();
            int temp = entry.getValue();
            if(temp % 2 == 0){

                result += temp;
            }
            else{
                flag = 1;
                result += temp-1;
            }
        }

        if(flag == 1){

            result += 1;
        }
        return result;
    }
}
