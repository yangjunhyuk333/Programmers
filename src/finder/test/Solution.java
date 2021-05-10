package finder.test;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][]giveUpMath = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        ArrayList<Integer> answer = new ArrayList<Integer>();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        for(int index = 0; index < 3; index++){
            int index3 = 0;
            for(int index2 = 0; index2 < answers.length; index2++){
                if(giveUpMath[index][index3] == answers[index2]){
                    int count = map.get(index + 1);
                    map.put(index + 1, count + 1);
                }
                if(index3 > giveUpMath[index].length - 2){
                    index3 = 0;
                }else{
                    index3++;
                }
            }

        }

        for(int index : map.keySet()){
            if(map.get(index).equals(Collections.max(map.values()))) {
                answer.add(index);
            }
        }

        Collections.sort(answer);

        int[] answer2 = new int[answer.size()];
        int index = 0;
        for(int answerItem : answer){
            answer2[index] = answerItem;
            index++;
        }

        return answer2;
    }
}