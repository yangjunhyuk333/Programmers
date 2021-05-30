package argorithm.recursive;

import java.util.*;
import javafx.util.*;
import java.io.*;

//1일차에 용 1마리가 있을때

public class Recursive {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        dragonCount(1, N, false, 1, 0);

    }

    static void dragonCount(int currentDay, int N, boolean isEgg, int dragonCount, int eggCount){
        if(isEgg){
            if(currentDay % 2 == 0){
                dragonCount(++currentDay, N, false, ++dragonCount, eggCount);
            }
        }else{
            if(currentDay % 3 == 0){
                dragonCount(++currentDay, N, true, dragonCount, eggCount + 3);
            }
        }
    }
}
