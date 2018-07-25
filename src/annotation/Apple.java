package annotation;

public class Apple {

    @FruitName(value = "apple")
    public  String  fruitName;

    @FruitColor(fruitColor = FruitColor.Color.BLUE)
    public  String fruitColor;

    @FruitProvider(id = 1,name = "百货公司",address = "湖北省武汉市")
    public String fruitProvider;

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public String getFruitProvider() {
        return fruitProvider;
    }

    public void setFruitProvider(String fruitProvider) {
        this.fruitProvider = fruitProvider;
    }
}
