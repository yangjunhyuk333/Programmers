package sort.k_number;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int index2 = 0;
        for(int[] commandItem : commands){
            for(int index = commandItem[0] - 1; index < commandItem[1]; index++){
                arrayList.add(array[index]);
            }
            Collections.sort(arrayList);
            answer[index2] = arrayList.get(commandItem[2] - 1);
            arrayList.removeAll(arrayList);
            index2++;
        }

        return answer;
    }
}