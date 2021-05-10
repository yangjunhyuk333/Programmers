package sort.big_number;
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        Integer[][]giveUpMath = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        for(int number : numbers){
            System.out.println(Arrays.deepToString(giveUpMath));
        }

        return answer;
    }
}
