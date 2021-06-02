package recursive.factorial;

import java.util.*;
import java.io.*;

public class Factorial {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(bf.readLine());
        System.out.println(factorial(N));

    }

    public static int factorial(int N){
        if(N <= 1){
            return 1;
        }else {
            return N * factorial(N - 1);
        }
    }

}
