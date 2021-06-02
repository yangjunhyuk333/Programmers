package brute_force.carpet;
import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown + yellow; //사각형의 넓이, 가로의 최대 길이는 area / 2;
        int maxHorizontal = area / 2;

        HashMap<Integer, Integer> carpet = new HashMap<>();

        for(int i = 0; i < maxHorizontal; i++){
            if(area % (i + 1) == 0){

                if(i + 1 >= (area / (i + 1))){
                    carpet.put(i + 1, (area / (i+1)));
                }

            }
        }

        for(int key : carpet.keySet()){
            if(((carpet.get(key) - 2) * (key - 2)) == yellow){
                answer[0] = key;
                answer[1] = carpet.get(key);
            }
        }

        return answer;
    }
}