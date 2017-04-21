/**
 * Created by 36249 on 2017/1/8.
 */
public class CircularArrayLoop {

    private int length;
    public boolean circularArrayLoop(int[] nums){

        if(nums == null || nums.length < 2){

            return false;
        }
        int curIndex = 0;
        int loopCount = 0;
        this.length = nums.length;
        int temp = nums[curIndex];
        final int loopDirection = temp/Math.abs(temp);
        while(true){


            curIndex = getIndex(curIndex + temp);
            if(loopDirection*nums[curIndex] <= 0){ //如果循环方向和下次移动方向不一致，或者当前结点
                //已经访问，则返回false

                return false;
            }

            temp = nums[curIndex];
            nums[curIndex] = 0;

            if(curIndex == 0 ){

                break;
            }

            ++loopCount;
        }
        return true;
    }

    private  int getIndex(int index){

        return (index+this.length)%this.length;

    }

    public static void main(String[] args) {



    }
}
