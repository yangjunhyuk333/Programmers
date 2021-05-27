package stack_queue.function;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> stack = new ArrayList<Integer>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        int day = 0;
        int index = 0;

        for (int progressItem : progresses) {
            System.out.println(progressItem);
            while (progressItem < 100) {
                progressItem += speeds[index];
                day++;
            }
            System.out.println(day);

            stack.add(day);

            day = 0;
            index++;
        }

        System.out.println(stack);

        int cnt = 1;
        int j = 0;

        while (true) {
            if (j < stack.size()) {
                if (stack.get(j) >= stack.get(j + 1)) {
                    stack.remove(j + 1);
                    cnt++;
                } else {
                    j++;
                    stack.add(cnt);
                    cnt = 1;
                }

                if (stack.size() - 1 == answerList.size()) {
                    answerList.add(cnt);
                    break;
                }

            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}