# [Part3] 두 배열 합치기

[문제 링크](https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%ED%85%8C%EB%8C%80%EB%B9%84)

---

### 성능 요약

> 메모리: 33 MB
>
> 시간: 355ms

---

### 구분

- 투 포인터

---

### 문제 설명
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.


---

<h5>입출력 예</h5>
- 예시 입력 
```java
3
1 3 5
5
2 3 6 7 9
```
-  예시 출력 1
```java
1 2 3 3 5 6 7 9
```


### 문제 접근 및 해결
- 정렬 알고리즘을 사용하면 가장 빠른 시간 복잡도는 퀵정렬 평균 O(nlogN)
- 투 포인트를 사용하면 시간 복잡도는 O(N)

```java
while (p1 < input1 && p2 < input2) {
    if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
    else answer.add(arr2[p2++]);
}
while (p1 < input1) answer.add(arr1[p1++]);

while (p2 < input2) answer.add(arr2[p2++]);
```
- 2개의 포인트를 이동하면서 answer에 넣는다. 이후 input1, input2의 남은 값을 추가적으로 넣는다.
---

> 출처: https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%ED%85%8C%EB%8C%80%EB%B9%84 