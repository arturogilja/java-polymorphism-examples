package Menu;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private HashMap<Integer, MenuItem> menuItems;

    Menu() {
        menuItems = new HashMap<>();
    }

    void display() {
        System.out.println("MENU: ");
        for (Integer key : menuItems.keySet()) {
            MenuItem menuItem = menuItems.get(key);
            System.out.println(key + " - " + menuItem.getText());
        }
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();

        MenuItem menuItem = menuItems.get(option);
        menuItem.getController().execute();

    }

    void addMenuItem(int key, MenuItem menuItem) {
        menuItems.put(key, menuItem);
    }
}
