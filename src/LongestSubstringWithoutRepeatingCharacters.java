public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubstring(String s) {


        int[] map = new int[200];
        for(int i = 0; i < 200; ++i){

            map[i] = -1;
        }

        int res = 0;
        int max = 0;
        int current = 0;
        for(int i = 0; i < s.length(); ++i){

            if(map[s.charAt(i)] == -1){

                map[s.charAt(i)] = i;
                ++res;
            }
            else{

                if(map[s.charAt(i)] < current){

                    ++res;
                }
                else{

                    current = map[s.charAt(i)]+1;
                    res = i - map[s.charAt(i)];
                }

                map[s.charAt(i)] = i;

            }

            if(max < res){

                max = res;
            }

        }

        return max;
    }

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters temp = new LongestSubstringWithoutRepeatingCharacters();

        temp.lengthOfLongestSubstring("abba");
    }
}
