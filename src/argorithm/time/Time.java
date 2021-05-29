package argorithm.time;

import java.io.*;

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String hour = bf.readLine();

        int count = 0;
        String time;

        for (int hour_index = 0; hour_index <= Integer.parseInt(hour); hour_index++) {
            for (int min_index = 0; min_index < 60; min_index++) {
                for (int sec_index = 0; sec_index < 60; sec_index++) {
                    time = hour_index + Integer.toString(+min_index) + sec_index;
                    if(time.contains("3")){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
