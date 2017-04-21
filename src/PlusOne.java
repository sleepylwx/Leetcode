/**
 * Created by 36249 on 2017/1/31.
 */
public class PlusOne {

    public int[] plusOne(int[] digits){

        for(int i = digits.length - 1 ; i > -1; --i){


            if(digits[i] < 9){

                ++digits[i];
                return digits;
            }

            digits[i] = 0;
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
