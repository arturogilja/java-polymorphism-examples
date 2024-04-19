public class AnimalExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal lion = new Lion();
        Animal cat = new Cat();

//        Animal animal = new Animal(); <--- NOT POSSIBLE
//        animal.talk();

        dog.talk();
        lion.talk();
        cat.talk();
    }
}

abstract class Animal {
    void kill() {
        System.out.println("I'm Killing");
    }
    abstract void talk();
}

class Dog extends Animal {
    @Override
    void talk() {
        System.out.println("WOF!");
    }
}

class Lion extends Animal {
    @Override
    void talk() {
        System.out.println("GRRRR!");
    }
}

class Cat extends Animal {
    @Override
    void talk() {
        System.out.println("MEOW");
    }
}
