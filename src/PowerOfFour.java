/**
 * Created by 36249 on 2017/1/28.
 */
public class PowerOfFour {


    public boolean isPowerOfFour(int num){


        return num > 0 && (num & (num-1))== 0 && (num & 0x55555555) == num;
    }

    public static void main(String[] args) {

        PowerOfFour test = new PowerOfFour();
        System.out.println(test.isPowerOfFour(5));
    }
}
