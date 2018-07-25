package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private  Object subJect;

    public  DynamicProxy(Object subJect){
        this.subJect = subJect;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before ");
        System.out.println("Method:" + method);
        method.invoke(subJect,args);
        System.out.println("after rent house");
        return null;
    }
}
