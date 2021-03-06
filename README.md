# Java Variable

변수란, 자바 애플리케이션이 실행되는 동안 값을 저장할 수 있는 메모리상의 공간이다.  
variable 은 "vary" 와 "able" 의 합성어로 값은 변할 수 있다는 것을 의미한다.  
- 변수에 저장된 값은 애플리케이션 런타임 중에 변경할 수 있다.
- 변수는 메모리상의 위치에 주어진 이름일 뿐이며, 해당 변수에 대한 모든 연산은 해당 메모리 위치에 영향을 미친다.
- 모든 변수들은 사용하기 전에 선언되어 있어야 한다.

## 데이터 타입

변수에 저장할 수 있는 데이터 유형이다.  

자바는 두 가지 유형의 데이터 타입이 존재한다.

### Primitive Type

|타입|설명|기본값|크기|값의 범위|
|----|----|-----|----|--------|
|boolean|true or false 값을 나타낸다.|false|VM 에 따라 다르다.|true, false|
|char|유니코드 문자|\u0000|16 bits|\u0000(0) to \uffff(65535)|
|byte|2의 보수인 정수|0|8 bits|-128 to 127|
|short|2의 보수인 정수|0|16 bits|-32,768 to 32,767|
|int|2의 보수인 정수|0|32 bits|-2,147,483,648 to 2,147,483,647|
|long|2의 보수인 정수|0|64 bits|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|float|IEEE 754 부동소수점|0.0|32 bits||
|double|IEEE 754 부동소수점|0.0|64 bits||

#### Primitive Type 이 저장되는 영역은 어디일까?

JVM 메모리 안의 스택에 값이 저장된다.

#### 왜 char 형은 2바이트를 차지할까?

C 나 C++ 같은 언어에서는 오직 ASCII 코드 문자만을 사용하여 1바이트로 충분히 표현이 가능하다.    
반면에 자바에서는 ASCII 코드 기반이 아닌 유니코드 기반이어서 1바이트로는 안되기 때문에 2바이트를 차지한다.  
유니코드는 세계 각 국의 언어를 통일된 방법으로 표현할 수 있게 제안된 국제적인 코드 규약이다.

### Non-Primitive Type or Reference Type

Primitive Type 을 제외한 나머지가 여기에 속한다.  
예를 들면, Class, Interface, Enumeration, Array 등등이 있다.

#### Reference Type 이 저장되는 영역은 어디일까?

참조형의 실제 값(인스턴스)은 JVM 메모리 힙 영역에 저장되며 해당 주소를 스택에 저장한다.  

#### Reference Type 의 shallow copy 와 deep copy 에 대하여

참조형은 주소값을 저장하기 때문에 두 종류의 복사 개념이 존재한다.  
shallow copy(얕은 복사)는 주소값을 복사하는 것으로 복사한 변수도 동일한 주소를 가리키기 때문에 어느 한쪽에서 값을 수정하면 나머지 한 쪽에서도 수정된 값을 가리키게 된다.  
deep copy(깊은 복사)는 값이 동일한 인스턴스를 힙 영역에 복사하고 그 주소를 스택 영역에 저장하는 것으로 완전히 다른 변수가 되기 때문에 서로에게 영향을 주지 않는다.  

## Literal

리터럴은 실제로 저장되는 데이터 그 자체를 의미한다.  
타입마다 표현할 수 있는 방법도 다양하다.

```java
int binaryInt = 0b10;
int octalInt = 010;
int decimalInt = 10;
int hexadecimalInt = 0x10;
System.out.println("int 2진수 리터럴: " + binaryInt);
System.out.println("int 8진수 리터럴: " + octalInt);
System.out.println("int 10진수 리터럴: " + decimalInt);
System.out.println("int 16진수 리터럴: " + hexadecimalInt);
```
![int 리터럴](images/IMG_literal_01.png)

```java
long longLiteral = 10L;
System.out.println("long 리터럴: " + longLiteral);
```
![long 리터럴](images/IMG_literal_02.png)

```java
float floatLiteral = 1.23f;
System.out.println("float 리터럴: " + floatLiteral);
```
![float 리터럴](images/IMG_literal_03.png)

```java
double doubleLiteral = 1.23;
double doubleLiteral2 = 1.23d;
double doubleLiteral3 = 123e-2d;
System.out.println("double 리터럴 1: " + doubleLiteral);
System.out.println("double 리터럴 2: " + doubleLiteral2);
System.out.println("double 리터럴 3: " + doubleLiteral3);
```
![double 리터럴](images/IMG_literal_04.png)

```java
char charLiteral = 'A';
char charLiteral2 = '가';
char charLiteral3 = '\u1234';
System.out.println("char 리터럴 1: " + charLiteral);
System.out.println("char 리터럴 2: " + charLiteral2);
System.out.println("char 리터럴 3: " + charLiteral3);
```
![char 리터럴](images/IMG_literal_05.png)

```java
boolean booleanLiteral = true;
boolean booleanLiteral2 = 0 < 1;
System.out.println("boolean 리터럴 1: " + booleanLiteral);
System.out.println("boolean 리터럴 2: " + booleanLiteral2);
```
![boolean 리터럴](images/IMG_literal_06.png)

## 변수의 초기화

![변수초기화](images/IMG_initialize_01.jpg)

#### 초기화 종류에 대하여

변수를 초기화하는 방법에는 몇 가지가 존재한다.  

1. 명시적 초기화 (explicit initialization)  
- 변수 선언과 동시에 초기화 하는 방법이다.
- 인스턴스 변수, 클래스 변수, 지역 변수 모두 사용 가능하며 가장 최우선적으로 고려되는 방법이다.

2. 초기화 블럭 (initialization block)
- 인스턴스 변수, 클래스 변수에 대하여 사용 가능하다.
- 인스턴스 초기화 블럭과 클래스 초기화 블럭으로 나뉜다.
- 인스턴스 초기화 블럭 같은 경우는 모든 생성자가 공통으로 수행해야 하는 로직이 있을 경우 사용한다.

3. 생성자 (constructor)
- 인스턴스 생성 시에 생성자 메서드 안에서 초기화 하는 방법이다.

아래 코드는 초기화 방법과 호출 순서를 확인하기 위해 작성되었다.
```java
public class InitializationStudy {

    /**
     * 명시적 초기화 (explicit initialization)
     * */
    private int explicitVariable = 0;

    private int instanceVariable;
    private static int staticVariable;

    /**
     * Static Initialization Block
     * */
    static {
        staticVariable = 10;
        System.out.println("Static Initialization Block...");
    }

    /**
     * Instance Initialization Block
     * */
    {
        instanceVariable = 20;
        System.out.println("Instance Initialization Block...");
    }

    public InitializationStudy() {
        System.out.println("Constructor...");
    }

    public static void main(String[] args) {
        new InitializationStudy();
    }
}
```

아래와 같이 클래스 초기화 블럭 -> 인스턴스 초기화 블럭 -> 생성자 순으로 호출되는 것을 확인할 수 있다.  

![변수초기화종류](images/IMG_initialize_02.png)


## 변수의 스코프와 라이프타임

변수들은 사용 가능한 범위를 가진다.  
그 범위를 변수의 스코프라고 한다.  
스코프는 globalScope 와 localScope 로 나뉜다.  

```java
public class VariableScopeStudy {

    public static void main(String[] args) {
        VariableScopeStudy vss = new VariableScopeStudy();
        vss.localBlock(30);
        System.out.println("static variable: " + VariableScopeStudy.staticVariable);
    }

    int globalVariable = 10;

    static int staticVariable = 40;

    private void localBlock(int localParameter) {
        int localVariable = 20;

        System.out.println("global variable: " + globalVariable);
        System.out.println("local variable: " + localVariable);
        System.out.println("local parameter: " + localParameter);
    }
}
```
위 코드를 실행하면 아래와 같은 결과를 얻을 수 있다.

![변수스코프](images/IMG_scope_01.png)

클래스의 속성으로 선언된 변수 glovalVariable 의 스코프는 클래스 전역이다.  
globalVariable 같은 변수는 인스턴스가 생성될 때 생성되기 때문에 인스턴스 변수라고도 한다.  

매개변수로 선언된 localParameter 는 메서드 블럭 바깥에 존재하지만 선언부에 존재하기 때문에 스코프는 해당 메서드 블럭 안이다.  
메서드 블럭 안에서 선언된 localVariable 역시 스코프는 메서드 블럭 안이다.

main() 메서드 안에서 인스턴스 변수인 globalVariable 은 사용할 수 없다.  
main() 메서드는 static 메서드이 때문에 static 변수만 사용할 수 있다.  
static 으로 선언된 변수(staticVariable)는 클래스가 처음 로딩될 때 JVM 메모리에 한 번만 저장되고 생성된 모든 인스턴스에서 공유한다.  
static 변수는 클래스 변수라고도 한다.  
클래스 변수는 클래스명.변수명 형태로 사용하는것을 권장한다.  

스택 영역에 생성된 변수의 라이프타임은 블럭에 의해 결정된다.  
블럭 내에서 선언된 변수는 블럭이 종료될 때 스택 영역에서 제거된다.  

인스턴스 변수: 해당 인스턴스가 생성되고 GC 에 의해 제거되기 전까지 남아있는다.  
클래스 변수: 프로그램이 시작될 때 생성되고 종료될 때까지 남아있는다.  
지역 변수: 해당 변수가 선언된 블럭이 시작되고 종료될 때까지 남아있는다.  

## 형 변환

#### 타입 캐스팅과 타입 프로모션에 대하여

타입 캐스팅이란, 자신의 표현 범위를 모두 포함하지 못한 타입으로의 변환을 의미한다.  
예를 들면, 실수형에서 정수형으로의 형 변환 또는 같은 정수형이더라도 큰 범위의 정수형에서 작은 범위의 정수형으로의 형 변환 같은 경우라고 할 수 있다.  
원본 데이터의 손실이 발생할 수 있는 형 변환이다.  

타입 프로모션이란, 자신의 표현 범위를 모두 포함하는 타입으로의 변환을 의미한다.  
예를 들면, 정수형에서 실수형으로의 형 변환 또는 같은 정수형이더라도 작은 범위의 정수형에서 큰 범위의 정수형으로의 형 변환 같은 경우라고 할 수 있다.  
원본 데이터의 손실이 발생하지 않는 형 변환이다.

아래는 타입 캐스팅과 타입 프로모션에 대하여 확인해보기 위해 작성하였다.
```java
public class TypeConversionStudy {

    public static void main(String[] args) {
        int intVariable = 1_000_000;
        long longVariable = intVariable;
        float floatVariable = intVariable;
        double doubleVariable = intVariable;
        System.out.println("타입 프로모션 longVariable: " + longVariable);
        System.out.println("타입 프로모션 floatVariable: " + floatVariable);
        System.out.println("타입 프로모션 doubleVariable: " + doubleVariable);

        short shorVariable = (short) intVariable;
        byte byteVariable = (byte) intVariable;
        System.out.println("타입 캐스팅 shortVariable: " + shorVariable);
        System.out.println("타입 캐스팅 byteVariable: " + byteVariable);
    }
}
```

![형변환](images/IMG_type_conversion_01.png)

코드에서 알 수 있듯이 타입 캐스팅같은 경우 변환하고자 하는 타입에 대하여 명시해줘야 한다.

## 배열

배열은 동일한 데이터 타입을 정해진 개수 만큼 저장하는 참조형 변수이다.     
배열의 크기는 long 이 아닌 int 또는 short 값으로 지정해야한다.  

```java
public class ArrayStudy {

    public static void main(String[] args) {
        int[] intArray = new int[Integer.MAX_VALUE + 1];
    }
}
```

만약 int 형 범위 밖의 값으로 초기 크기를 지정한다면 런타임 시 아래와 같은 오류가 발생한다.  

![array크기](images/IMG_array_01.png)

배열의 부모클래스는 Object 클래스이다.  
또한 모든 배열은 인터페이스 Cloneable 및 java.io.Serializable 을 구현한다.  

#### 1차원 배열

1차원 배열 선언의 일반적인 방식은 다음과 같다.  
```java
public class ArrayStudy {
    int intArray[];  // type variable_name[]
    int[] intArray2; // type[] variable_name
}
```

배열은 new 연산자와 함께 크기를 명시해서 생성했을 때 힙 메모리 영역에 저장된다.
```java
public class ArrayStudy {

    public static void main(String[] args) {
        int intArray[];            // declaring array
        intArray = new int[6];    // allocating memory to array
    }
}
```

![1차원 array 메모리](images/IMG_array_03.jpg)

배열의 인덱스는 0부터 시작해서 전체 배열의 크기 - 1 로 끝난다.  
만약, 배열의 크기를 벗어난 인덱스로 접근하게 될 경우 어떻게 될까?
아래와 같이 런타임 시, ArrayIndexOutOfBoundsException 이 발생하는 것을 확인할 수 있다.

![array크기](images/IMG_array_02.png)

#### 다차원 배열

배열에는 1차원 외에 다차원으로도 생성할 수 있다.  
배열의 배열로 각각의 엘리먼트는 또 다른 배열의 주소를 참조하고 있다.  

다차원 배열의 선언은 다음과 같다.  
```java
public class ArrayStudy {
    int intArray[][] = new int[10][20];             // 2D array or matrix
    int intArray2[][] = { {1, 2, 3}, {4, 5, 6} };   // declaring and initializing 2D array    
    
    long longArray[][][] = new long[10][20][30];    // 3D array
}
```

![다차원 array 메모](images/IMG_array_04.jpg)

#### 배열의 clone

1차원 배열인 경우 clone() 메서드를 사용하면 deep copy 가 수행된다.

```java
int[] oneArray = new int[]{1, 2, 3};
int[] cloneOneArray = oneArray.clone();
System.out.println("oneArray reference: " + oneArray);
System.out.println("cloneOneArray reference: " + cloneOneArray);
System.out.println("oneArray == cloneOneArray: " + (oneArray == cloneOneArray));
```

![1차원 배열 clone](images/IMG_array_05.png)

다차원 배열인 경우에는 clone() 메서드를 사용하면 shallow copy 가 수행된다.  
즉, 복사된 각각의 상위 배열은 동일한 하위 배열을 참조한다. 

```java
int[][] multiArray = new int[][]{ {1, 2}, {3, 4} };
int [][] cloneMultiArray = multiArray.clone();
System.out.println("multiArray reference: " + multiArray);
System.out.println("cloneMultiArray reference: " + cloneMultiArray);
System.out.println("multiArray == cloneMultiArray: " + (multiArray == cloneMultiArray));
System.out.println("multiArray[0] reference: " + multiArray[0]);
System.out.println("cloneMultiArray[0] reference: " + cloneMultiArray[0]);
System.out.println("multiArray[0] == cloneMultiArray[0]: " + (multiArray[0] == cloneMultiArray[0]));
```

![차원 배열 clone](images/IMG_array_06.png)

## 타입추론, Var

var 키워드는 자바 10 에서 처음 소개되었다.  
타입추론은 주변 컨텍스트를 기반으로 변수의 데이터 타입을 자동으로 감지하는 var 키워드에서 사용된다.  

```java
public class VarStudy {

    public static void main(String[] args) {
        var intVariable = 10;
        var doubleVariable = 1.1;
        var charVariable = 'A';
        var stringVariable = "variable";
        var booleanVariable = true;

        System.out.println("intVariable: " + intVariable);
        System.out.println("doubleVariable: " + doubleVariable);
        System.out.println("charVariable: " + charVariable);
        System.out.println("stringVariable: " + stringVariable);
        System.out.println("booleanVariable: " + booleanVariable);
    }
}
```

![var](images/IMG_var_01.png)

지역 변수 선언에서 사용할 있으며 명시적 초기화와 함께 사용해야 한다.  
인스턴스 변수나 전역 변수에서는 사용할 수 없으며 제네릭 타입에서도 사용할 수 없다.  
또한, 메서드의 매개변수와 리턴으로도 사용할 수 없다.

<hr>

#### References

> 웹 문서
> - [geeksforgeeks | Variables in Java](https://www.geeksforgeeks.org/variables-in-java/)
> - [geeksforgeeks | Data types in Java](https://www.geeksforgeeks.org/data-types-in-java/)
> - [geeksforgeeks | Arrays in Java](https://www.geeksforgeeks.org/arrays-in-java/)
> - [geeksforgeeks | var keyword in Java](https://www.geeksforgeeks.org/var-keyword-in-java/)
> - [자바 데이터 타입, 변수 그리고 배열](https://blog.naver.com/hsm622/222144931396)
> - [프로그래머스 | 변수의 scope와 static](https://programmers.co.kr/learn/courses/5/lessons/231)