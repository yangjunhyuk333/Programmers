package hash.level2_2;
import java.util.*;

//경우의 수 계산 각 옷의 종류 +1 을 모두 곱한 뒤 -1

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String[] clothe : clothes) {
            if (map.containsKey(clothe[1])) {
                int result = map.get(clothe[1]);
                map.put(clothe[1], result + 1);
            } else {
                map.put(clothe[1], 1);
            }
        }


        for(String keys : map.keySet()){ // keySet: HashMap에 저장된 모든 키가 저장된 Set을 반환한다.

            answer *= (map.get(keys) + 1);

        }

        return answer - 1;
    }
}