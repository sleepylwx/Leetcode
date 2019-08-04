public class DefangIPaddr {


    public String defangIPaddr(String address) {



        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < address.length(); ++i){


            if(address.charAt(i)=='.'){


                stringBuffer.append("[.]");
            }
            else {

                stringBuffer.append(address.charAt(i));

            }
        }


        return stringBuffer.toString();

    }


    public static void main(String[] args) {


        String a = "1.1.1.1";

        DefangIPaddr test = new DefangIPaddr();

        System.out.println(test.defangIPaddr(a));
    }
}
