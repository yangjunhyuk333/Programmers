package binary_search.number_card;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());
        String[] arrayA = bf.readLine().split(" ");
        LinkedList<String> arrayListA = new LinkedList<>(Arrays.asList(arrayA).subList(0, count));

        Collections.sort(arrayListA);

        count = Integer.parseInt(bf.readLine());
        String[] arrayB = bf.readLine().split(" ");
        LinkedList<String> arrayListB = new LinkedList<>(Arrays.asList(arrayB).subList(0, count));

        int numberCount = 0;
        for (String arrayItem : arrayListB) {
            while (true) {
                int findNumber = Collections.binarySearch(arrayListA, arrayItem);
                if (findNumber >= 0) {
                    numberCount++;
                    arrayListA.remove(findNumber);
                } else {

                    System.out.print(numberCount + " ");
                    numberCount = 0;

                    break;

                }
            }
        }
    }

}
