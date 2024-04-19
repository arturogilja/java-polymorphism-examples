public class InterfaceExample {
    public static void main(String[] args) {
        Printable png = new PNG();
        Printable pdf = new PDF();
        Printer printer1 = new Printer(png);
        Printer printer2 = new Printer(pdf);
        printer1.execute();
        printer2.execute();
    }
}

class Printer {
    Printable printable;
    Printer(Printable printable) {
        this.printable = printable;
    }
    void execute() {
        this.printable.print();
    }
}

class PNG implements Printable {
    @Override
    public void print() {
        System.out.println("I'm A PNG");
    }
}

class PDF implements Printable {
    @Override
    public void print() {
        System.out.println("I'm a PDF");
    }
}

class GIF implements Renderable, Printable {
    @Override
    public void print() {

    }

    @Override
    public void render() {

    }
}


interface Printable {
    void print();
}

interface Renderable {
    void render();
}