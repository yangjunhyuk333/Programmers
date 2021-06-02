package argorithm.lotto;

import java.util.*;
import java.io.*;

public class Lotto {

    public static void main(String[] args){

        Random random = new Random();

        HashSet<Integer> set = new HashSet<>();

        while(set.size() < 5){
            set.add(random.nextInt(45));
        }

        ArrayList<Integer> arrayList = new ArrayList<>(set);
        for(int item : arrayList){
            System.out.print(item + " ");
        }


    }

}
