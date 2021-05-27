package binary_search.tree.find_number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        ArrayList<Integer> arrayListA = new ArrayList<>();
        for(int i = 0; i < count; i++){
            arrayListA.add(scanner.nextInt());
        }

        count = scanner.nextInt();
        ArrayList<Integer> arrayListB = new ArrayList<>();
        for (int i = 0; i < count; i++){
            arrayListB.add(scanner.nextInt());
        }

        Solution solution = new Solution();
        HashMap<Integer, Integer> hashMap = solution.solution(arrayListA, arrayListB);

        for(int key : arrayListB){
            System.out.println(hashMap.get(key));
        }

    }
}

class Solution {

    HashMap<Integer, Integer> solution(ArrayList<Integer> arrayListA, ArrayList<Integer> arrayListB){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        Collections.sort(arrayListA);

        for (Integer arrayB : arrayListB) {

            int start = 0;
            int end = Collections.max(arrayListA);
            int mid = 0;

            hashMap.put(arrayB, 0);

            while (start <= end) {
                mid = (start + end) / 2;

                int exitsNumber = 0;
                if(arrayB == mid){
                    exitsNumber = 1;
                }

                if (exitsNumber == 1) {
                    hashMap.put(arrayB, exitsNumber);
                    break;
                } else {
                    if (arrayB >= mid) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }

        return hashMap;
    }
}
