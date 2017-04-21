package others;

/**
 * Created by 36249 on 2017/3/3.
 */
public class FindMoreThanHalfOnes {


    //assume target != null and target's length > 0
    public static int findMoreThanHalfOnes(int[] target){

        int result = target[0];
        int num = 1;
        for(int i = 1; i < target.length ; ++i){

            if(target[i] != result){

                --num;
                if(num == -1){

                    result = target[i];
                    num = 1;
                }
            }
            else{

                ++num;
            }

        }

        return result;
    }


    public static void main(String[] args) {

        int[] testArray = new int[]{12,17,36,12,12};
        System.out.println(findMoreThanHalfOnes(testArray));
    }
}
