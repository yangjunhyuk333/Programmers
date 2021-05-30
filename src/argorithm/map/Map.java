package argorithm.map;

import java.io.*;

/*
* R : 오른쪽 한 칸 이동
* L : 왼쪽 한 칸 이동
* U : 위 한 칸 이동
* D : 아래 한 칸 이동
*/

public class Map {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int scanCount = Integer.parseInt(bf.readLine());
        String[] moving = bf.readLine().split(" ");

        int[] mapCursor = {1, 1};

        for(String move : moving){

            if(move.equals("R") && mapCursor[1] < scanCount){ //오른쪽 한 칸 이동
                mapCursor[1] += 1;
            } else if(move.equals("D") && mapCursor[0] < scanCount){ // 아래 한 칸 이동
                mapCursor[0] += 1;
            }else if(move.equals("L") && mapCursor[1] > 1){ //왼쪽 한 칸 이동
                mapCursor[1] -= 1;
            }else if(move.equals("U") && mapCursor[0] > 1){ // 위 한 칸 이동
                mapCursor[0] -= 1;
            }else if(move.equals("X")){ //5, 5로 이동
                mapCursor[0] = scanCount;
                mapCursor[1] = scanCount;
            }
        }

        for(int mapCur: mapCursor){
            System.out.print(mapCur + " ");
        }

    }
}