/**
 * Created by 36249 on 2017/1/10.
 */
public class AddStrings {

    StringBuffer stringBuffer = new StringBuffer();
    int flag = 0;

    public String addStrings(String num1,String num2){

        int i;
        int j;


        for(i = num1.length()-1,j = num2.length()-1;
                i >= 0 && j >= 0;--i,--j){

            int res = num1.charAt(i) - '0' + num2.charAt(j) - '0' + flag;
            flag = 0;
            if(res > 9){


                flag = 1;
            }

            stringBuffer.append(res % 10);

        }

        if(i >= 0){

            for(;i >= 0; --i){

                int res = num1.charAt(i) - '0' + flag;
                flag = 0;
                if(res > 9){


                    flag = 1;
                }

                stringBuffer.append(res % 10);
            }
        }
        else if( j >= 0){

            for(;j >= 0; --j){

                int res =  num2.charAt(j) - '0' + flag;
                flag = 0;
                if(res > 9){


                    flag = 1;
                }

                stringBuffer.append(res % 10);
            }
        }

        if(flag == 1){

            stringBuffer.append(flag);
        }

        return stringBuffer.reverse().toString();
    }



}
