# 완전 탐색 - 모의고사

------------
## 사용 라이브러리/클래스/함수
- java.util.*
- Collections.sort()
- Array
- ArrayList
- HashMap
Collections.max() : 최대값
------------
## 문제
문제 설명      
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.   
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...   
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...   
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...   

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
   
제한 조건   
시험은 최대 10,000 문제로 구성되어있습니다.   
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.   
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.   
입출력 예   

|answers|return|
|---|---|
[1,2,3,4,5]|[1]|
[1,3,2,4,2]|[1,2,3]||    

입출력 예 설명
입출력 예 #1   

- 수포자 1은 모든 문제를 맞혔습니다.   
- 수포자 2는 모든 문제를 틀렸습니다.  
- 수포자 3은 모든 문제를 틀렸습니다.   
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.   

입출력 예 #2
- 모든 사람이 2문제씩을 맞췄습니다.   

------------
## 풀이
수포자들의 정답 찍는 방식을 저장하는 giveUpMath 2차원 배열을 선언 후
정답자들을 저장할 ArrayList 를 선언한다.
수포자들의 정답 문제 개수를 저장하는 HashMap 을 하나 선언하고
반복문을 통해 정답을 비교하고 최종적으로 map 안의 value 값이 가장 높은 수포자만 ArrayList에 저장해서 sort 정렬 후 반환한다.