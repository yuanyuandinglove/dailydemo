package test.load;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class A {
    public A(){
        System.out.println("A const");
    }
    static {
        System.out.println("A static");
    }

  void A(){
      System.out.println("A Normal");
  }
}
