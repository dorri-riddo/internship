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
