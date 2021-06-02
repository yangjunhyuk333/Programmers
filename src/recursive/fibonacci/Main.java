package recursive.fibonacci;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int N){

        if(N <= 1){
            return N;
        }else {
            return fibonacci(N - 2) + fibonacci(N - 1);
        }

    }
}
