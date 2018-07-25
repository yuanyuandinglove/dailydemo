package reflect;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import redis.RedisClient;


import java.lang.reflect.*;

public class ReflectTest {
    public static void main(String args[]) {
        RedisClient redisClient = new RedisClient("192.168.30.99", 6379, "");
        Class clazz = redisClient.getClass();
        Class clazzone = null;
        try {
            clazzone = Class.forName("redis.RedisClient");
            System.out.println(clazz == clazzone);
            // 获得所有有属性
            Field[] filds = clazz.getDeclaredFields();
            Field.setAccessible(filds, true);
            for (int i = 0; i < filds.length; i++) {
                System.out.println(filds[i].getName() + ":" + filds[i].get(redisClient));
                if (filds[i].getName().equals("hero")) {
                    filds[i].set(redisClient, 10);
                    System.out.println(filds[i].getName() + ":" + filds[i].get(redisClient));
                }

            }
            System.err.println("==================================");

            //获取所有构造的方法
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(constructors[i].getName());
                Parameter[] parameters = constructors[i].getParameters();
                for (int j = 0; j < parameters.length; j++) {
                    System.out.println(parameters[i]);
                }
            }

            Constructor constructor = clazzone.getConstructor(String.class, int.class, String.class);//获取指定的构造方法

            RedisClient redisClient1 = (RedisClient) constructor.newInstance("192.168.30.99", 6379, "");
            System.out.println("rdisClinet1:" + redisClient1);

            System.err.println("==================================");

            //获得所有的方法
            Method method[] = clazz.getDeclaredMethods();
            for (int i = 0; i < method.length; i++) {
                System.out.println(method[i].getName());
                Type[] types = method[i].getGenericParameterTypes();
                Parameter parameter[] = method[i].getParameters();
                for (int j = 0; j < parameter.length; j++) {
                    System.out.println("参数:" + parameter[j] + "/type:" + types[j]);
                }
            }
            //获得确定的 方法
            Method methodone = clazz.getDeclaredMethod("reflectTestOne", int.class, int.class);
            methodone.setAccessible(true);
            //     methodone.invoke(redisClient,8.,5);
            methodone.invoke(redisClient1, 10, 12);
            Method method1 = clazz.getDeclaredMethod("reflectTestwo");
            method1.setAccessible(true);
            method1.invoke(redisClient1);

            Method methodtwo = clazz.getMethod("reflectFour");
            methodtwo.invoke(redisClient1);
            Method methodThree = clazz.getDeclaredMethod("reflectThree", String.class, String.class);
            methodThree.setAccessible(true);
            String s = (String) methodThree.invoke(redisClient1, "55", "6666");
            System.out.println("反射reflectThree的 result:" + s);

            Method method2 = clazz.getMethod("reflectFour");
            method2.invoke(redisClient);
            method1.invoke(redisClient);
            String s1 = (String) methodThree.invoke(redisClient, "55", "6666");
            System.out.println("反射reflectThree的 result:" + s1);

        } catch (Exception e) {

        }
    }

}
