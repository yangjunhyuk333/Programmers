package binary_search.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int treeCount = scanner.nextInt();
        int cutTreeCount = scanner.nextInt();

        ArrayList<Integer> treeList = new ArrayList<>();

        for(int i = 0; i < treeCount; i++){
            treeList.add(scanner.nextInt());
        }

        Solution solution = new Solution();
        System.out.print(solution.solution(treeList, cutTreeCount));


    }
}

class Solution {

    int solution(ArrayList<Integer> treeList, int cutTreeCount){

        int start = 0;
        int end = Collections.max(treeList);
        int mid = 0;

        while (start <= end){
            mid =(start + end)/2;
            int woodLength = woodLen(mid, treeList);
            if(woodLength >= cutTreeCount){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return end;
    }

    int woodLen(int mid, ArrayList<Integer> treeList){
        int woodLength = 0;

        for(int tree : treeList){
            if (tree > mid) {
                woodLength += tree - mid;
            }
        }

        return woodLength;

    }
}
