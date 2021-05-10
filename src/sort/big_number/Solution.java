package sort.big_number;
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        String[] numberString = new String[numbers.length];

        int index = 0;
        for(int number : numbers){
            numberString[index] = Integer.toString(number);
            index++;
        }

        int maxNumber = 0;
        for(String number : numberString){
            map.put(Integer.parseInt(number), number.length());
            maxNumber = Collections.max(map.values());
        }

        ArrayList<Integer> previousArr = new ArrayList<Integer>();
        ArrayList<Integer> currentArr = new ArrayList<Integer>();

        for(int index2 = 0; index2 < maxNumber; index2++){
            for(int number : numbers){
                if(map.get(number).equals(index2 + 1)){
                    currentArr.add(number);
                    Collections.sort(currentArr);
                    previousArr.addAll(currentArr);
                    currentArr.removeAll(currentArr);
                }
            }
        }

        System.out.println(previousArr);
        return answer;
    }
}
