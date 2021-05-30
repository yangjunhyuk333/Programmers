package argorithm.anagram;

import java.util.*;
import java.io.*;

public class Anagram {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();

        int index = 0;
        for(String item : input){
            for(int i = 0; i < item.length(); i++){
                if(index == 0){
                    arrayList.add(item.substring(i, i + 1));
                    Collections.sort(arrayList);
                }else{
                    arrayList2.add(item.substring(i, i + 1));
                    Collections.sort(arrayList2);
                }
            }

            index++;
        }

        if(arrayList.equals(arrayList2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
