package binary_search.find_number;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        ArrayList<Integer> arrayListA = new ArrayList<>();
        for(int i = 0; i < count; i++){
            arrayListA.add(scanner.nextInt());
        }

        Collections.sort(arrayListA);

        count = scanner.nextInt();
        ArrayList<Integer> arrayListB = new ArrayList<>();
        for (int i = 0; i < count; i++){
            arrayListB.add(scanner.nextInt());
        }

        for (Integer arrayB : arrayListB) {
            if (Collections.binarySearch(arrayListA, arrayB) >= 0){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
