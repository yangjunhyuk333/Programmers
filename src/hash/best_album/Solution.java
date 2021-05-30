package hash.best_album;
import java.util.*;
import javafx.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, ArrayList<Pair<Integer, Integer>>> hashMap = new HashMap<>();

        ArrayList<Pair<Integer, Integer>> arrayList = new ArrayList<>();

        int index = 0;
        for(String genre : genres){
            arrayList.add(new Pair<>(plays[index], index));
            hashMap.put(genre, arrayList);

            index++;
        }




        return answer;
    }
}