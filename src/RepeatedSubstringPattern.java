import java.util.HashSet;
import java.util.Set;

/**
 * Created by 36249 on 2017/1/12.
 */
public class RepeatedSubstringPattern {


    public boolean repeatedSubstringPattern(String str){

        if(str == null || str.length() == 0){

            return false;
        }
        char[] a = str.toCharArray();
        for(int i = str.length()/2; i >= 1; ++i){



            if(contain(a,i)){

                return true;
            }

        }

        return false;
    }

    private boolean contain(char[] str,int len){


        for(int i = 0; i < str.length;){


            for(int j = 0; j < len ; ++j){

                if(i >= str.length){

                    return false;
                }
                if(str[j] != str[i++]){

                    return false;
                }

            }


        }

        return true;
    }
    public static void main(String[] args) {

        RepeatedSubstringPattern test = new RepeatedSubstringPattern();
        System.out.println(test.repeatedSubstringPattern("aabaaba"));
    }
}
