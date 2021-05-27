package heap.more_spicy;
import java.util.*;

class Solution {
    public int solution(int[] scoville, int k) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int scovilles : scoville){
            queue.add(scovilles);
        }

        while(queue.peek() <= k){
            if (queue.size() == 1) {
                return -1;
            }

            queue.add(queue.poll() + (queue.poll() * 2));
            answer++;
        }

        return answer;
    }
}
