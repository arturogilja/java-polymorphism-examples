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
        System.out.println("FIRST OPTION OF MENU");
    }
}

class Controller2 implements Controller {
    @Override
    public void execute() {
        System.out.println("SECOND OPTION OF MENU");
    }
}
