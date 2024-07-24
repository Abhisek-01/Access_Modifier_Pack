package PublicAccess;

public class PublicClass {

    public int num;
    public void publicMethod(int num){
        if(num%2==0){
            System.out.println("This number "+num+" is even");
        }else {
            System.out.println("This number " + num + " is odd");
        }
    }


}
