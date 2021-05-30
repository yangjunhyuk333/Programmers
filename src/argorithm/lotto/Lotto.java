package argorithm.lotto;

import java.util.*;
import java.io.*;

public class Lotto {

    public static void main(String[] args){

        Random random = new Random();
        for(int i = 0; i < 5; i++){
            System.out.print(random.nextInt(45) + " ");
        }

    }

}
