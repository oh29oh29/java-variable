/**
 * 해당 클래스는 변수의 형 변환(타입 캐스팅과 타입 프로모션)에 대해서 확인하기 위해 작성되었다.
 * */
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
