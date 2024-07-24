package PublicAccess;

import com.company.Main;

public class TestPublic {

    public static void main(String[] args) {

        PublicClass ps = new PublicClass();
        ps.publicMethod(Integer.parseInt("21"));
    }

}
