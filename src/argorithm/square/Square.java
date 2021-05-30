package argorithm.square;

import java.util.*;
import java.io.*;

//주어진 둘레에서 최대 넓이의 직사각형 구하기
//        둘레/2해서 나온 값을 Z로 해서
//        X(가로) 1→Z/2, Y(세로) Z/2→1
//        이렇게 무식하게 풀었음 Python 으로는 시간초과 떳지만 C++로 똑같이 짜서 돌리니 통과함

public class Square {

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int round = Integer.parseInt(bf.readLine());
        int max = round / 2; //가로 변의 합과 세로 변의 합의 최댓값

        ArrayList<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < max; i++){
            for(int j = 2; j > 1; j--){
                answerList.add(((i + 1) / 2) * ((max)/j));
            }
        }

        answerList.sort(Collections.reverseOrder());

        System.out.println(answerList.get(0));

    }

}
