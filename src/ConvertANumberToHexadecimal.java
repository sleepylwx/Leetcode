/**
 * Created by 36249 on 2017/1/11.
 */
public class ConvertANumberToHexadecimal {


    private char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8'
                        ,'9','a','b','c','d','e','f'};
    public String toHex(int num){


        if(num == 0){

            return String.valueOf(0);
        }

        char[] arr = new char[32];
        int index = 0;
        while(num != 0){

            arr[index++] = map[num&15];
            num >>>= 4;
        }

        char[] res = new char[index];
        for(int i = 0; i < index; ++i){

            res[i] = arr[index-i-1];
        }

        return new String(res);
    }


    public static void main(String[] args) {


        ConvertANumberToHexadecimal test = new ConvertANumberToHexadecimal();
        System.out.println(test.toHex(-1));
    }
}
