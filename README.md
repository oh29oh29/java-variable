# Java Variable

변수란, 자바 애플리케이션이 실행되는 동안 값을 저장할 수 있는 메모리상의 공간이다.  
variable 은 "vary" 와 "able" 의 합성어로 값은 변할 수 있다는 것을 의미한다.  
- 변수에 저장된 값은 애플리케이션 런타임 중에 변경할 수 있다.
- 변수는 메모리상의 위치에 주어진 이름일 뿐이며, 해당 변수에 대한 모든 연산은 해당 메모리 위치에 영향을 미친다.
- 모든 변수들은 사용하기 전에 선언되어 있어야 한다.

## 변수의 초기화

![변수초기화](images/IMG_variable_01.jpg)

## 데이터 타입

변수에 저장할 수 있는 데이터 유형이다.  

자바는 두 가지 유형의 데이터 타입이 존재한다.

### Primitive Type

|타입|설명|기본값|크기|값의 범위|
|----|----|-----|----|--------|
|boolean|true or false 값을 나타낸다.|false|VM 에 따라 다르다.|true, false|
|byte|2의 보수인 정수|0|8 bits|-128 to 127|
|char|유니코드 문자|\u0000|16 bits|\u0000(0) to \uffff(65535)|
|short|2의 보수인 정수|0|16 bits|-32,768 to 32,767|
|int|2의 보수인 정수|0|32 bits|-2,147,483,648 to 2,147,483,647|
|long|2의 보수인 정수|0|64 bits|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|float|IEEE 754 부동소수점|0.0|32 bits||
|double|IEEE 754 부동소수점|0.0|64 bits||

#### 왜 char 형은 2바이트를 차지할까?

C 나 C++ 같은 언어에서는 오직 ASCII 코드 문자만을 사용하여 1바이트로 충분히 표현이 가능하다.    
반면에 자바에서는 ASCII 코드 기반이 아닌 유니코드 기반이어서 1바이트로는 안되기 때문에 2바이트를 차지한다.  
유니코드는 세계 각 국의 언어를 통일된 방법으로 표현할 수 있게 제안된 국제적인 코드 규약이다.

### Non-Primitive Type or Reference Type

참조형은 변수의 값을 메모리에 직접 저장하지 않고 메모리 주소를 포함한다.  
String, Object, Array 등등이 여기에 해당한다.  




<hr>

#### References

> 웹 문서
> - [geeksforgeeks | Variables in Java](https://www.geeksforgeeks.org/variables-in-java/)
> - [geeksforgeeks | Data types in Java](https://www.geeksforgeeks.org/data-types-in-java/)