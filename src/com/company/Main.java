package com.company;

import DefultPackage.DefaultClass;
import PrivateAccess.PrivateClass;
import ProtectedAcess.ProtectedClass;
import PublicAccess.PublicClass;

public class Main extends ProtectedClass{

    public static void main(String[] args) {
	// write your code here

        Main main = new Main();

        DefaultClass dc = new DefaultClass();
        PrivateClass pv = new PrivateClass();
        PublicClass pb = new PublicClass();
        ProtectedClass pc = new ProtectedClass();


        dc.defultMethod();
        pv.privateMethodUsePublic();
        pb.publicMethod(11);
        main.protectedMethod();
//        pc.protectedMethod();
    }
}
