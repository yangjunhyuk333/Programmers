package time;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hour = scanner.next();
        String  min = "0";
        String  sec = "0";

        int count = 0;

        for(int hour_index = 0; hour_index < Integer.parseInt(hour); hour_index++){
            for(int min_index = 0; min_index < 60; min_index++){
                for(int sec_index = 0; sec_index < 60; sec_index++){
                    if((hour + Integer.toString(min_index) + Integer.toString(sec_index)).equals("3")){
                        count += 1;
                    }
                }
            }
        }
    }
}
