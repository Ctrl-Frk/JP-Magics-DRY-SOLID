package cafe;

import cafe.dishes.Dish;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> menu = new ArrayList<>();

    public Dish getDishByIndex(int i) {
        return menu.get(i - 1);
    }

    public Menu addToMenu(Dish dish) {
        menu.add(dish);
        return this;
    }

    public void printMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }
        System.out.println("Для добавления в корзину введите номер блюда \n" +
                "Для возврата на предыдущее меню введите 0");

    }
}
