/**
 * Created by 36249 on 2017/1/31.
 */
public class NumberOfSegmentsInAString {

    public int countSegments(String s){

        if(s == null || s.equals("")){

            return 0;
        }

        int res = 0;
        String[] temp = s.split(" ");
        if(temp.length == 1){

            return 1;
        }
        for(int i = 0; i < temp.length ; ++i){

            res += countSegments(temp[i]);

        }
        return res;
    }

    public int countSegments0(String s){

        if(s == null || s.equals("")){

            return 0;
        }
        char[] target = s.toCharArray();
        boolean hasContent = false;
        int res = 0;
        for(int i = 0 ; i < target.length; ++i){

            if(target[i] == ' ' && hasContent){

                ++res;
                hasContent = false;
            }
            else if(target[i] != ' '){

                hasContent = true;
            }
        }

        if(hasContent){

            ++res;
        }
        return res;
    }
}
