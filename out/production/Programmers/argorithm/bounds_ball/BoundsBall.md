# 바운드 볼

------------
## 사용 라이브러리/클래스/함수
java.io.*   
java.util.*   
BufferedReader   
InputStreamReader
Stack
------------
## 문제   
문제 설명   
번호가 적힌 N개의 공을 바구니에 넣고 K개 만큼 빼기를 반복할 것이다.  
이 때 마지막에 바구니에 남은 공의 번호를 출력하시오.   
단 바구니의 깊이는 10000미만이다.   
   
첫 줄에는 총 횟수를 입력받는다   
둘째 줄에는 바구니에 넣을 N개(1<=N<=100)의 공 번호를 입력받는다.     
셋째 줄에는 바구니에서 뺄 공의 개수를 입력받는다.(2면 2개를 뺀다)   
그 다음번 줄부터는 총 횟수만큼 2,3번 줄의 형태를 반복한다.    

|입력|출력|
|---|---|
2 1 2 3 2 2 3 4 5 1| 1 2 3 4|
2 5 3 8 9 3 6 8 3 1 | 5 6 8||

## 풀이

------------
입력은 속도를 위해 BufferedRead 를 사용하였다.   
바구니는 Stack 으로 구현하여 들어온 순서의 역순으로 minusCount 만큼의 수를
pop 하고 answerList 에 저장한다. 저장을 하고, stack 안의 내용을 전부 비워준다.


