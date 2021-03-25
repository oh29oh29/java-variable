/**
 * 해당 클래스는 변수의 스코프를 확인하기 위해 작성되었다.
 * */
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
