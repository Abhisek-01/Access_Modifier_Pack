package PrivateAccess;

public class TestPrivate {
    public static void main(String[] args) {

        PrivateClass pv = new PrivateClass();

        // java: privateMethod() has private access in PrivateAccess.PrivateClass (Build Failed)
//        pv.privateMethod();

        // Build passed by private method calling by using inside the public method type
        pv.privateMethodUsePublic();

    }
}
