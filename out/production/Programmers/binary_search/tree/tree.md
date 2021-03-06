# 이분 탐색(Binary Search) - 나무 자르기

------------
## 사용 라이브러리/클래스/함수
- java.util.*
- ArrayList
- Collections
- Scanner
------------
## 문제
문제 설명
상근이는 나무 M미터가 필요하다. 근처에 나무를 구입할 곳이 모두 망해버렸기 때문에, 정부에 벌목 허가를 요청했다. 정부는 상근이네 집 근처의 나무 한 줄에 대한 벌목 허가를 내주었고, 상근이는 새로 구입한 목재절단기를 이용해서 나무를 구할것이다.

목재절단기는 다음과 같이 동작한다. 먼저, 상근이는 절단기에 높이 H를 지정해야 한다. 높이를 지정하면 톱날이 땅으로부터 H미터 위로 올라간다. 그 다음, 한 줄에 연속해있는 나무를 모두 절단해버린다. 따라서, 높이가 H보다 큰 나무는 H 위의 부분이 잘릴 것이고, 낮은 나무는 잘리지 않을 것이다. 예를 들어, 한 줄에 연속해있는 나무의 높이가 20, 15, 10, 17이라고 하자. 상근이가 높이를 15로 지정했다면, 나무를 자른 뒤의 높이는 15, 15, 10, 15가 될 것이고, 상근이는 길이가 5인 나무와 2인 나무를 들고 집에 갈 것이다. (총 7미터를 집에 들고 간다) 절단기에 설정할 수 있는 높이는 양의 정수 또는 0이다.

상근이는 환경에 매우 관심이 많기 때문에, 나무를 필요한 만큼만 집으로 가져가려고 한다. 이때, 적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 구하는 프로그램을 작성하시오.

입력 
~~~
첫째 줄에 나무의 수 N과 상근이가 집으로 가져가려고 하는 나무의 길이 M이 주어진다. (1 ≤ N ≤ 1,000,000, 1 ≤ M ≤ 2,000,000,000)

둘째 줄에는 나무의 높이가 주어진다. 나무의 높이의 합은 항상 M보다 크거나 같기 때문에, 상근이는 집에 필요한 나무를 항상 가져갈 수 있다. 높이는 1,000,000,000보다 작거나 같은 양의 정수 또는 0이다.
   ~~~
출력   
~~~
적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 출력한다.
   ~~~
예제   

|입력|출력|
|---|---|
4 7 20 15 10 17|15||
   
------------
## 풀이
end 의 경우 treeList 에서 최댓값을 구해 설정해준다.
while 문에서 end 가 start 보다 크거나 같을때 까지 반복 해준다.
mid 는 (start + end) / 2 의 값으로 리스트의 중앙 값을 구해 넣어준다.
나무의 길이를 구하는 woodLen() 함수를 사용해 treeList 의 값이 mid 보다 클 때만
woodLength 에 treeList 값에서 mid 를 뺀 만큼의 값을 더해준다.
그리고 나서 woodLength 를 return 해준다.
woodLength 의 값이 최소 나무의 개수보다 크거나 겉다면
start 의 값에 mid + 1 한 값을 넣어주고, 아니라면 end 값에 mid - 1 한 값을 넣어준다.
그리고 while 문이 다 돌았다면 end 값을 return 해준다. end 값을 return 하는 이유는 mid값을 찾고 난 후 
end 값이 줄어들다 보면 start 값과 같아지고, 결국에 그 값이 결과 값이기 때문이다.