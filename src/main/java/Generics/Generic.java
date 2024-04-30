package Generics;

public class Generic<T> {
    public Generic(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }

    private T thing;

    public static void main(String[] args) {
        String thing = "";
        int num = 123;
        Generic<String> generic = new Generic<>("");
        Generic<Integer> gen2 = new Generic<>(num);
    }
}
