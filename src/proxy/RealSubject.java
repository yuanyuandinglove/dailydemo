package proxy;

public class RealSubject implements  Subject {
    @Override
    public void rent() {
        System.out.println("want to rent home");
    }

    @Override
    public void hello(String str) {
       System.out.println("hello:" + str);
    }
}
