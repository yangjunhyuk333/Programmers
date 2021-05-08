package hash.level2;

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, String> map = new HashMap<String, String>();

        for (String input : phone_book) {

            map.put(input, input); //map 의 요소들을 중복 제거 후 초기화

        }

        for (String target : phone_book){
            for (int i = 0; i < target.length(); i++){
                if (map.containsKey(target.substring(0, i))){ //target 의 0 ~ i(target 문자열의 길이)가 map 에 존재하면 return false
                    return false;
                }
            }
        }

        return answer;
    }
}