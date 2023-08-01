package cafe.dishes;

public class Pancake extends Dish {
    DishType dishType = DishType.PANCAKE;

    public Pancake(String name, int weight, int price) {
        super(name, weight, price);
    }

    @Override
    public DishType getDishType() {
        return dishType;
    }

}
