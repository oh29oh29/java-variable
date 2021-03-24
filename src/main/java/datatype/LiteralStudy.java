package datatype;

/**
 * 해당 클래스는 리터럴을 사용하고 결과를 확인하기 위해 작성되었다.
 * */
public class LiteralStudy {

    public static void main(String[] args) {
        int binaryInt = 0b10;
        int octalInt = 010;
        int decimalInt = 10;
        int hexadecimalInt = 0x10;
        System.out.println("int 2진수 리터럴: " + binaryInt);
        System.out.println("int 8진수 리터럴: " + octalInt);
        System.out.println("int 10진수 리터럴: " + decimalInt);
        System.out.println("int 16진수 리터럴: " + hexadecimalInt);

        long longLiteral = 10L;
        System.out.println("long 리터럴: " + longLiteral);

        float floatLiteral = 1.23f;
        System.out.println("float 리터럴: " + floatLiteral);

        double doubleLiteral = 1.23;
        double doubleLiteral2 = 1.23d;
        double doubleLiteral3 = 123e-2d;
        System.out.println("double 리터럴 1: " + doubleLiteral);
        System.out.println("double 리터럴 2: " + doubleLiteral2);
        System.out.println("double 리터럴 3: " + doubleLiteral3);

        char charLiteral = 'A';
        char charLiteral2 = '가';
        char charLiteral3 = '\u1234';
        System.out.println("char 리터럴 1: " + charLiteral);
        System.out.println("char 리터럴 2: " + charLiteral2);
        System.out.println("char 리터럴 3: " + charLiteral3);

        boolean booleanLiteral = true;
        boolean booleanLiteral2 = 0 < 1;
        System.out.println("boolean 리터럴 1: " + booleanLiteral);
        System.out.println("boolean 리터럴 2: " + booleanLiteral2);
    }
}
