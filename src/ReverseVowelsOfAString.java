import java.util.HashSet;
import java.util.Set;

/**
 * Created by 36249 on 2017/1/28.
 */
public class ReverseVowelsOfAString {


    public String reverseVowels(String s){

        char[] arr = s.toCharArray();
        char[] res = new char[s.length()];

        int j = arr.length - 1;
        for(int i = 0 ; i < arr.length; ++i){

            res[i] = arr[i];
            if(isVowel(arr[i])){

                for(;j > -1 ; --j){

                    if(isVowel(arr[j])){

                        res[i] = arr[j];
                        --j;
                        break;
                    }

                }

            }

        }

        return new String(res);
    }

    private boolean isVowel(char a){

        switch (a){

            case'a':
            case'A':
            case'e':
            case'E':
            case'i':
            case'I':
            case'o':
            case'O':
            case'u':
            case'U':
                return true;
            default:
                return false;


        }
    }
    public String reverseVowels0(String s){


        char[] arr = new char[s.length()];
        char[] res = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        int index = 0;
        for(int i = 0; i < res.length; ++i){

            if(set.contains(res[i])){

                arr[index++] = res[i];
            }
        }

        for(int i = 0 ; i < res.length ; ++i){

            if(set.contains(res[i])){

                res[i] = arr[--index];
            }
        }

        return new String(res);
    }


}
