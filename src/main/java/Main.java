import cafe.Basket;
import cafe.Menu;
import cafe.dishes.*;

import java.util.Scanner;

public class Main {
    private static int input;
    private static final Scanner scn = new Scanner(System.in);
    private static Menu menu;
    private static Basket basket;

    public static void main(String[] args) {
        menu = new Menu();
        basket = new Basket(menu);

        menu.addToMenu(new Pancake("Смайл", 200, 300))
                .addToMenu(new Sandwich("Субмарина", 300, 400))
                .addToMenu(new Pie("Гигант", 900, 1600));

        System.out.println("Добро пожаловать в закусочную!");
        printStartInfo();
    }

    public static void printStartInfo() {
        System.out.println("Введите 1 - для перехода к списку блюд \n" + "Введите 2 - для перехода в корзину");

        input = scn.nextInt();

        switch (input) {
            case 1:
                menu.printMenu();
                while (true) {
                    input = scn.nextInt();
                    if (input == 0) {
                        printStartInfo();
                        break;
                    }
                    basket.addToBasket(input);

                    System.out.println("\nБлюдо `" + menu.getDishByIndex(input).getName() + "` добавлено в корзину\n" +
                            "Желаете что-то еще?\n");
                    menu.printMenu();
                }
                break;

            case 2:
                basket.printBasket();
                break;

            default:
                System.out.println("Вы ввели неверное значение");
                printStartInfo();
        }
    }
}
