/**
 * Created by 36249 on 2017/1/27.
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num){

        int temp = (int)Math.sqrt(num);
        return temp*temp == num;
    }

    public static void main(String[] args) {

        ValidPerfectSquare test = new ValidPerfectSquare();
        test.isPerfectSquare(2147483647);
    }
}
