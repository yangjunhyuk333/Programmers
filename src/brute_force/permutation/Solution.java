package brute_force.permutation;
import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;

        HashMap<Integer, Boolean> set = new HashMap<>();

        permutation("", numbers, set);

        //소수 판별
        for(int key : set.keySet()){

            if(key == 1 || key == 0){
                set.put(key, true);
            }else{
                for(int i = 2; i <= (int)Math.sqrt(key); i++){

                    if(key % i == 0){
                        set.put(key, true);

                        break;
                    }
                }
            }
        }

        for(int key : set.keySet()){
            if(!set.get(key)){
                answer++;
            }
        }


        return answer;
    }

    //순열
    public void permutation(String prefix, String str, HashMap<Integer, Boolean> set){
        int n = str.length();
        if(!prefix.equals("")){
            set.put(Integer.valueOf(prefix), false);
        }
        for(int i = 0; i < n; i++){
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), set);
        }
    }
}