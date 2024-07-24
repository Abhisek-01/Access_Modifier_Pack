package PrivateAccess;

public class PrivateClass {

    private  String name = "Abhisek";
    private void privateMethod(){
        System.out.println("Hey, "+name+" How is your day.");
    }

    public void privateMethodUsePublic(){
        privateMethod();
    }
}
