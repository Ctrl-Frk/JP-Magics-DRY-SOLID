package cafe.dishes;

public abstract class Dish implements IDish {
    private String name;
    private DishType dishType;
    private int weight;
    private int price;

    public Dish(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public abstract DishType getDishType();

    @Override
    public String toString() {
        return getDishType() + " " + name + "\n Вес: " + weight + " гр.\n Цена: " + price + " р.";
    }
}
