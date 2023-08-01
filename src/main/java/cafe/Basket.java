package cafe;

import cafe.dishes.Dish;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    protected Menu menu;

    public Basket(Menu menu) {
        this.menu = menu;
    }

    private List<Dish> basket = new ArrayList<>();

    public void addToBasket(int i) {
        basket.add(menu.getDishByIndex(i));
    }

    public void removeFromBasket(Dish dish) {
        basket.remove(dish);
    }

    public void printBasket() {
        System.out.println("В вашей корзине: ");
        basket.forEach(System.out::println);
    }
}
