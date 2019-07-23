import java.util.Stack;

public class ReverseInteger {

    public boolean checkOverFlow(int x,int num){

        int last = x % 10;
        if(num==10 && (last > 2 || last < -2)){

            return true;

        }

        return false;

    }

    public int reverse(int x) {


        Stack<Integer> stack = new Stack<>();
        int nums = 0;
        int temp = x;

        while(temp != 0){

            stack.push(temp%10);
            temp = temp /10;
            ++nums;

        }

        if(checkOverFlow(x,nums)){

            return 0;
        }

        int res = 0;
        int index = nums;


        while(!stack.empty()){


            res += stack.pop() * (int)Math.pow(10,nums-index);
            --index;

        }


        if((res ^ x) < 0){

            return 0;
        }
        return res;

    }

    public static void main(String[] args) {

        ReverseInteger test = new ReverseInteger();

        int x = 1563847412;
        System.out.println(test.reverse(x));
    }

}
