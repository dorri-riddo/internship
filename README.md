# internship
2018.07.01~2018.12.31 

6개월간 수료하였던 인턴 과정에서 작업하였던 과제

## 문제 
### 1번
다음을 출력할 수 있는 클래스를 작성한다.
 
클래스의 이름은 ToStringWith 이다.  
클래스는 member로 x, y를 갖는다.
클래스의 생성자는 ToStringWith(x, y) 이다.

아래의 main 문을 실행하였을 때,

    public static void main(String[] args) { 
        System.out.println(new ToStringWith(42, 86));
    }
 
출력으로 다음과 같은 결과가 나와야 한다.

ToStringWith[42,86]

<hr>

### 2번

Shape라는 최상위 부모클래스를 작성하고, 자식 클래스로 사각형과 삼각형,원을 클래스로 구현한다. 
객체 지향의 설계 개념에 맞게 각 도형의 넓이를 구하는 메서드를 구현해 본다.

<hr>

### 3번

자신의 클래스로 인스턴스화 되어 사용중인 객체의 갯수를 추적할 수 있는 클래스를 구현하라.

<hr>

### 4번

배열을 사용하여 스택을 구현한다.
스택의 주요 메서드는 push, pop, top, isEmpty, isFull 이다.
스택의 원소는 Object 이다.
구현 후, 아래의 명령을 실행한다.

push(“One”)

push(“Tow”)

push(new Integer(1))

pop()

push(new Double(5.0))

push(“three”)

pop()

pop()


각 실행마다 스택의 상태를 출럭하여여 한다.

<hr>

### 5번

2/3*5 게산식을 소수점까지 정확이 계산하는 프로그램을 작성한다.
2/3*5 문장을 준용하여 합니다.

<hr>

### 6번
0.1씩 계속 더하는 프로그램을 작성하고 결과를 출력한다.

0.1

0.1+0.1

0.1+0.1+0.1

...

(20번까지)

결과가 우리가 알고 있는 결과와 일치하는지 검토해 보고, 다를 경우 왜 다른지를 알아본다.

<hr>

### 7번

double을 인수로 받아서 특정 자리수까지  반올림할 수 있는 함수를 만들어라.

<hr>

### 8번
3차원 배열을 구현하는 클래스를 작성한다. 내부 필드는 일차원 배열로 구현한다.

생성자: 생성자(int a, int b, int c); // a, b, c 는 3차원 배열의 각 차원수

메서드: put(int a, int b, int c, int value);

	 get(int a, int b, int c);

내부 필드(일차원배열)을 3차원 배열 사용하듯이.

<hr>

### 9번

시스템에서 제공하는 ArrayList와 동일하게 동작하는 MyArrayList 클래스를 작성하라.

<hr>

### 10번

문자열을 입력 받아 date 형으로 변환하는 프로그램을 작성한다.
이 때, 입력 받는 문자열의 형태는 yyyy mm dd 의 형태이다.

두 개의 날짜를 입력 받아 비교한 후 아래와 같이 출력하는 프로그램을 작성한다.

출력:
2000-01-01 is after 1999-12-31

<hr>

### 11번


년도와 월을 입력받아 아래 처럼 달력을 출력하는 프로그램을 작성한다.

2000년 6월

일 월 화 수 목 금 토

             1  2  3

 4  5  6  7  8  9 10

11 12 13 14 15 16 17

18 19 20 21 22 23 24

25 26 27 28 29 30 

<hr>

### 12번

city. state로 구성된 문자열 데이터를 읽어 city, state를 구분하여 출력하는 프로그램을 작성하라.
String 의 split 메서드를 쓰지 말고 동일하게 동작하는 메서드를 작성하라.

입력:

Seattle, WA 

Natchez, MS 

Las Vegas, NV 

Palo Alto, CA 

NYC, NY

<hr>

### 13번

13)

아래의 문장이 있다.

입력)

It's a nice

day, isn't it, Mr. Mxyzzptllxy?

I think we should

go for a walk.


위 문장을 포맷팅하여 다음처럼 출력하도록 한다. (칼럼의 길이는 72이다.)

It's a nice day, isn't it, Mr. Mxyzzptllxy? I think we should go for a

walk.

<hr>
