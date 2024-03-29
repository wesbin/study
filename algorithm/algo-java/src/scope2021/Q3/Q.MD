**상품 배치 추천**

최근 버킷플레이스에서는 '오늘의집' 마이페이지에 사용자의 공간 정보를 올리면 각
공간에 대한 상품 추천 기능을 만들고자 한다.

이 기능을 구현하기 위해 먼저 공간에 상품을 놓을 수 있는 경우의 수를 구하고자
한다. 다음 내용을 참고하여 실험용 프로그램을 만들어보자.

- 입력되는 공간 정보는 한 변의 길이가 1 이상인 정사각형 모양을 제한한다.
- 공간의 가로, 세로가 각각 1인 정사각형 모양의 최소 공간 여러 개로 구성된다.
- 상품은 항상 정사각형 크기만큼 딱 1개만 배치되며, 상품을 놓을 수 있는 공간 공간
  정보에서 검게 칠해진 부분으로 제한된다.
  
위 내용을 참고하여 입력된 공간에 상품을 배치할 수 있는 경우의 수를 모두 구해보자.

예를 들어 아래와 같이 한 변의 길이가 4인 공간 정보가 주어졌다고 가정하자.

```
1110
1110
0110
0000
```

공간의 최상단 왼쪽 칸을 (0,0), 최하단 오른쪽 칸을 (3,3)이라 표현했을 때, 상품을
놓을 수 있는 경우의 수는 다음과 같이 총 11가지이다.

- 1*1 크기의 상품을 놓는 경우: (0,0) / (0,1) / (0,2) / (1,0) / (1,1) /
  (1,2) / (2,1) / (2,2)
- 2*2 크기의 상품을 놓는 경우: (0,0)(0,1)(1,0)(1,1) / (0,1)(0,2)(1,1)(1,2)
  / (1,1)(1,2)(2,1)(2,2)

---

**입력**

첫 번째 줄에 공간의 한 변 길이를 의미하는 자연수 N이 주어진다.(3 <= N <= 50)

두 번째 줄부터 총 N줄의 공간 정보가 주어진다. 배치가 가능한 공간이 1로 표기된다.

```
4
1110
1110
0110
0000
```

---

**출력**

```
total:: #num#
size[1]: #num#
size[2]: #num#
size[3]: #num#
...
```
