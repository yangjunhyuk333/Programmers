package stack_queue.truck;
import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Queue<Integer> waitingQueue = new LinkedList<Integer>();
        Queue<Integer> arriveQueue = new LinkedList<Integer>();

        for (int truck : truck_weights) {
            waitingQueue.add(truck);
        }

        arriveQueue.add(waitingQueue.poll());
        while (true) {
            if(!waitingQueue.isEmpty() && !arriveQueue.isEmpty()
                    && (waitingQueue.peek() + arriveQueue.peek()) < weight) {

                arriveQueue.add(waitingQueue.poll());


            }else if(waitingQueue.isEmpty() && arriveQueue.isEmpty()){
                break;
            }

            if(answer % bridge_length == 0 && !arriveQueue.isEmpty()){
                arriveQueue.poll();
            }

            answer++;


        }

        return answer;
    }
}