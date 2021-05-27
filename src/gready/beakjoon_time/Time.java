package gready.beakjoon_time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meetingRoomCount = Integer.parseInt(br.readLine());

        int[][] meetingTime = new int[meetingRoomCount][2];

        for(int i = 0; i < meetingRoomCount; i++){
            for (int j = 0; j < 2; j++){
                meetingTime[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solution.solution(meetingTime));

    }

}

class Solution {
    public int solution(int[][] meetingTime){
        int answer = 1;

        int firstNumber = meetingTime[0][0];
        for(int i = 1; i < meetingTime.length; i++){
            if(firstNumber < meetingTime[i][0]){
                firstNumber = meetingTime[i][1];
                answer++;
            }
        }

        return answer;
    }
}
