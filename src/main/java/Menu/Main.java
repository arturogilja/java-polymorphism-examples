package Menu;

public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu();
        Controller controller1 = new Controller1();
        Controller controller2 = new Controller2();
        mainMenu.addMenuItem(1, new MenuItem("FIRST OPTION", controller1));
        mainMenu.addMenuItem(2, new MenuItem("SECOND OPTION", controller2));

        mainMenu.display();
    }
}

class Controller1 implements Controller {
    @Override
    public void execute() {
        Menu subMenu = new Menu();
        Controller controller1 = () -> firstOption(); // Lambda expression
        Controller controller2 = this::secondOption; // Method reference
        controller2.execute();
        subMenu.addMenuItem(1, new MenuItem("FIRST SUB OPTION", controller1));
        subMenu.addMenuItem(2, new MenuItem("SECOND SUB OPTION", controller2));

        subMenu.display();
    }

    public void secondOption() {
        System.out.println("SECOND OPTION OF SUBMENU");
    }

    public void firstOption() {
        System.out.println("FIRST OPTION OF SUBMENU");
    }
}

class Controller2 implements Controller {
    @Override
    public void execute() {
        System.out.println("SECOND OPTION OF MENU");
    }
}
