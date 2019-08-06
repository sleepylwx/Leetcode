import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindromicSubstring {


    public String longestPalindrome(String s) {

        if(s == null || s.length() == 0){

            return "";
        }
        Map<Character,List<Integer>> map = new HashMap<>();

        for(int i = s.length()-1; i > -1; --i){

            if(!map.containsKey(s.charAt(i))){

                map.put(s.charAt(i),new ArrayList());
            }
            List<Integer> list = map.get(s.charAt(i));

            list.add(i);

        }

        int num = 0;
        String res = "";

        for(int i = 0; i < s.length(); ++i){

            if(s.length() - i <= num){

                break;
            }
            List<Integer> end = map.get(s.charAt(i));

            for(int j = 0; j < end.size(); ++j){

                int last = end.get(j);

                if(last-i+1 <= num){

                    break;
                }
                if(i > last){

                    break;

                }

                boolean flag = true;
                for(int k = i;k <= (i+last)/2;++k){

                    if(s.charAt(k) != s.charAt(last-(k-i))){


                        flag = false;
                        break;
                    }

                }

                if(flag && num < last - i + 1){

                    num = last - i + 1;
                    res = s.substring(i,last+1);

                }

            }

        }


        return res;
    }

    public String longestPalindrome1(String s){

        int num = 0;
        String res = "";
        for(int i = 0; i < s.length() ;++i){

            if(s.length() - i <= num){

                break;
            }

            for(int j = s.length() - 1; j >= i; --j){

                if(j-i+1 <= num){

                    break;
                }
                boolean flag = true;

                for(int k = i; k <= (i+j)/2; ++k){

                    if(s.charAt(k) != s.charAt(j-(k-i))){

                        flag = false;
                        break;

                    }

                }

                if(flag && j-i+1 > num){

                    num = j-i+1;
                    res = s.substring(i,j+1);
                }

            }
        }

        return res;

    }

//    public String longestPalindrome2(String s){
//
//
//
//
//    }


    public static void main(String[] args) {

        String a = "dcdsaasdc";
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();

        System.out.println(test.longestPalindrome(a));
    }

}
