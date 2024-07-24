package ProtectedAcess;

public class TestProtected extends ProtectedClass {

    public static void main(String[] args) {
        TestProtected TP = new TestProtected();
//        ProtectedClass PC = new ProtectedClass();

        TP.protectedMethod();

    }

}
