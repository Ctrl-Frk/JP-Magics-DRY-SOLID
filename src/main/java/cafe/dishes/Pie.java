package cafe.dishes;

public class Pie extends Dish {
    DishType dishType = DishType.PIE;

    public Pie(String name, int weight, int price) {
        super(name, weight, price);
    }

    @Override
    public DishType getDishType() {
        return dishType;
    }

}
