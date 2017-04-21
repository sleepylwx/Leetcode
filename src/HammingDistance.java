/**
 * Created by 36249 on 2017/1/7.
 */
public class HammingDistance {


    public  int hammingDistance(int x,int y){

        int result = x^y;


        return Integer.bitCount(result);
    }

    public static void main(String[] args) {

        int x = 1;
        int y = 4;
        HammingDistance test = new HammingDistance();
        System.out.println(test.hammingDistance(x,y));
    }
}
