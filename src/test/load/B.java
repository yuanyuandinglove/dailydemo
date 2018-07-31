package test.load;

public class B extends  A {
    public B(){
        System.out.println("b const");
    }
    static {
        System.out.println("b static");
    }

    void A(){
        System.out.println("b Normal");
    }

    public  static void main(String[] args){
        new B().A();
        new B().A();
    }
}
