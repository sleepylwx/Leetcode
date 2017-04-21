/**
 * Created by 36249 on 2017/3/5.
 */
public class PalindromeNumber {


    public boolean isPalindrome(int x){

        if(x  < 0){

            return false;
        }
        int num1 = 0;
        int num2 = x;
        while(x != 0){


            num1 = num1 * 10 + x%10;
            x = x/10;
        }
        return num1 == num2 ? true : false;
    }


}

