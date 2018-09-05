package test.load;

public class B extends  A {
    public B(){
        System.out.println("b const");
    }
    static {
        System.out.println("b static");
    }

    void B(){
        System.out.println("b Normal");
    }

    public  static void main(String[] args){
     //   new B().A();
      //  new B().A();

        A a = new B();
        a.A();
        ((B) a).B();
        B b =(B) new A();
        b.A();



    }
}
