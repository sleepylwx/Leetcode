import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2017/1/9.
 */
public class BinaryWatch {

    int[] hours = {1,2,4,8};
    int[] minutes = {1,2,4,8,16,32};
    List<Integer> hourList;
    List<Integer> minuteList;
    public List<String> readBinaryWatch(int num){

        List<String> result = new ArrayList<>();
        if(num > 10 || num < 0){

            return result;
        }
        int minHourLEDs = num  > 6? num - 6 : 0;
        int maxHourLEDs = num < 5 ? num : 4;
        for(int i = minHourLEDs; i <= maxHourLEDs; ++i){

            getHourList(i);
            getMiniteList(num - i);
            //System.out.println(hourList.size() + " " + minuteList.size());
            for(int j = 0; j < hourList.size();++j){

                for(int k = 0; k < minuteList.size();++k){
                    //System.out.println(hourList.get(j) + " " + minuteList.get(k));
                    result.add(String.format("%d:%02d",hourList.get(j),minuteList.get(k)));
                }

                //System.out.println("");
            }
        }
        return result;
    }

    private void getHourList(int num){

        hourList = new ArrayList<>();

        getHour(0,num,0);

    }
    private void getHour(int index,int num,int sum){

        if(num == 0){

            if(sum < 12){

                hourList.add(sum);
            }

            return;
        }

        for(int i = index; i < 5 - num; ++i){

            getHour(i+1,num-1,sum+hours[i]);

        }


    }

    private void getMiniteList(int num){

        minuteList= new ArrayList<>();

        getMinute(0,num,0);

    }
    private void getMinute(int index,int num,int sum){

        if(num == 0){

            if(sum < 60){

                minuteList.add(sum);
            }

            return;
        }

        for(int i = index; i < 7-num;++i){

            getMinute(i+1,num-1,sum+minutes[i]);
        }
    }

    public static void main(String[] args) {

        BinaryWatch binaryWatch = new BinaryWatch();
        binaryWatch.readBinaryWatch(1);
    }
}
