package argorithm.number_rule;

import java.io.*;

public class NumberRule{
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = bf.readLine().split(" ");
        int n = Integer.parseInt(NK[0]);
        int k = Integer.parseInt(NK[1]);

        int count = 0;
        while(n > 1){
            if(n % k != 0){
                n -= 1;
            }else{
                n /= k;
            }
            count++;
        }

        System.out.println(count);
    }
}
