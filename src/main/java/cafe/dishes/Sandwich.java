package cafe.dishes;

public class Sandwich extends Dish {
    DishType dishType = DishType.SANDWICH;

    public Sandwich(String name, int weight, int price) {
        super(name, weight, price);
    }

    @Override
    public DishType getDishType() {
        return dishType;
    }

}