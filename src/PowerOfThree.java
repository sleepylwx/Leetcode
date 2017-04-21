/**
 * Created by 36249 on 2017/1/12.
 */
public class PowerOfThree {


    public boolean isPowerOfThree(int n){

        if(n > 0 && 1162261467 % n == 0){

            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        PowerOfThree test = new PowerOfThree();
        System.out.println(test.isPowerOfThree(5));
    }
}
