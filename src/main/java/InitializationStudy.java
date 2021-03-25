/**
 * 해당 클래스는 변수의 초기화 방법과 호출 순서를 확인하기 위해 작성되었다.
 * */
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
