/**
 * Created by 36249 on 2017/1/12.
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n){

        if(n > 0 && 0x40000000 % n == 0){

            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        PowerOfTwo test = new PowerOfTwo();
        System.out.println(test.isPowerOfTwo(24));
    }
}
