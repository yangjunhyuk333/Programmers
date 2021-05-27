package gready.beakjoon_coin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {

        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> coinArr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            coinArr.add(scanner.nextInt());
        }

        System.out.println(solution.solution(k, 0, coinArr));

    }



//    10 4200
//    1
//    5
//    10
//    50
//    100
//    500
//    1000
//    5000
//    10000
//    50000
}

class Solution {
    public int solution(int k, int count, ArrayList<Integer> coinArr){
        int answer = 0;

        coinArr.sort(Collections.reverseOrder());

        for(int coin : coinArr){
            if(k >= coin){
                count += k/coin;
                k %= coin;
            }
        }

        answer = count;

        return answer;
    }
}