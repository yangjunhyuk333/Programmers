package argorithm.bounds_ball;

import java.io.*;
import java.util.*;

public class BoundsBall {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());

        ArrayList<String> answer = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        while (count > 0) {

            String[] strings = bf.readLine().split(" ");

            stack.addAll(Arrays.asList(strings));

            int minusCount = Integer.parseInt(bf.readLine());

            for (int i = 0; i < minusCount; i++) {
                stack.pop();
            }

            answer.addAll(stack);

            stack.removeAll(stack);
            count--;
        }

        bf.close();

        Collections.sort(answer);

        for (String s : answer) {
            System.out.print(s + " ");
        }
    }
}