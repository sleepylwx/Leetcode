import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2016/11/25.
 */
public class FizzBuzz {


    public List<String> fizzBuzz(int n) {


        List<String> arr = new ArrayList<>();

        for(int i = 1; i <= n; ++i){




            boolean isFizz = (i % 3) == 0;
            boolean isBuzz = (i % 5) == 0;

            if(isFizz && isBuzz){

                arr.add("FizzBuzz");
            }
            else if(isFizz){

                arr.add("Fizz");
            }
            else if(isBuzz){

                arr.add("Buzz");
            }
            else{

                arr.add(String.valueOf(i));
            }



        }

        return arr;
    }

}
