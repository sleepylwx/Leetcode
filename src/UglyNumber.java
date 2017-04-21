/**
 * Created by 36249 on 2017/1/14.
 */
public class UglyNumber {

    public boolean isUgly(int num){

        if(num <= 0){
            return false;
        }
        if(num == 1){
            return true;
        }

        int[] arr = {2,3,5};
        int count = 0;


        for(int i = 0; i < 3; ++i){

            if(num % arr[i] != 0){

                ++count;
            }
        }

        if(count == 3){
            return false;
        }

        while(num != 1){

            count = 0;
            for(int i = 0 ; i < 3; ++i){

                if(num % arr[i] == 0){

                    num /= arr[i];
                    ++count;
                }
            }
            if(count == 0){

                return false;
            }


        }

        return true;

    }
}
