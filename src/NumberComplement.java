/**
 * Created by 36249 on 2017/1/13.
 */
public class NumberComplement {

    public int findComplement(int num) {
        return ~num + (Integer.highestOneBit(num) << 1);
    }

    public static void main(String[] args) {

        NumberComplement test = new NumberComplement();
        System.out.println();
    }
}
