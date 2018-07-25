package annotation;

import java.lang.reflect.Field;

public class FruitInfoUtil {

    public static  void getFruitInfo(Class<?> tClass){

        Field field[] = tClass.getDeclaredFields();

        for (Field field1: field){
            if (field1.isAnnotationPresent(FruitName.class)){

                FruitName fruitName = (FruitName) field1.getAnnotation(FruitName.class);

                System.out.println("水果名称；" + fruitName.value());

            }else if (field1.isAnnotationPresent(FruitColor.class)){

                FruitColor fruitColor = (FruitColor)field1.getAnnotation(FruitColor.class);

                System.out.println("水果名称；" + fruitColor.fruitColor().toString());

            }else if (field1.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = (FruitProvider)field1.getAnnotation(FruitProvider.class);
                System.out.println("系统供应商：" + fruitProvider.address() +"-"+ fruitProvider.name() + "-" + fruitProvider.id());
            }
        }
    }
}
