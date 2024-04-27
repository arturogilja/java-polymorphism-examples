public class Main {
    public static void main(String[] args) {
        Parent obj = new ClassC();

        if (obj instanceof ClassC) {
            ClassC obj2 = (ClassC) obj;
            obj2.printBye();
            ClassA obj4 = obj2;
        } else if (obj instanceof ClassB) {
            ClassB obj3 = (ClassB) obj;
            obj3.printAdios();
        }
    }
}

class Parent {
    public void printHello() {
        System.out.println("HELLO");
    }
}

class ClassA extends Parent {

}

class ClassB extends Parent {
    public void printAdios() {
        System.out.println("ADIOS");
    }
}

class ClassC extends ClassA {
    public void printBye() {
        System.out.println("BYE!");
    }
}
