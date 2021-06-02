package argorithm.dp;

import java.util.*;

import java.io.*;

//1일차에 용 1마리가 있을때

public class Dp {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int dragon = 0;
        int egg = 0;

        int[] dp = {0, 1, 0, 0, 0};

        for (int i = 0; i <= N; i++) {
            dp[4]= dp[3];
            dp[3] = dp[2];
            dp[2] = dp[1];
            dragon = dp[2] + dp[3] + dp[4];
            egg = dp[0] + dp[1];

            System.out.print(i + "일차 " + "dragon: " + dragon + " ");
            System.out.println(i + "일차 " + "egg: " + egg + " " + Arrays.toString(dp) );

            dp[1] = dp[0];
            dp[0] = dragon;
        }

        System.out.println("dragon: " + dragon);
        System.out.println("egg: " + egg);

    }

}