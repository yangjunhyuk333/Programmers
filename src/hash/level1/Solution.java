package hash.level1;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<String, Integer>(); //hashmap 변수 선언

        for(String player : participant){

            if(map.containsKey(player)){
                int result = map.get(player); //player 가 속한 hash 키 값
                map.put(player, result + 1); //해당 map에 키 값을 증가 시키고 player를 put
            }else{
                map.put(player, 1);//없으면 player 등록
            }

        }

        for(String player : completion){

            int result = map.get(player); //player 검색해서 나온 key값 저장
            map.put(player, result - 1); //key 감소 시키고 player put

        }

        for(String player : participant){

            if(map.get(player) != 0){
                answer = player; //answer에 key값이 0인 사람 answer에 저장
            }

        }

        return answer;
    }
}