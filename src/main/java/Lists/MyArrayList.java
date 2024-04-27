package Lists;

public class MyArrayList implements MyList {
    String[] elements = new String[0];

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean add(String e) {
        int newSize = size() + 1;
        String[] elements = new String[newSize];
//      // COPY ALL ELEMENTS
        for (int i = 0; i < this.elements.length; i++){
            elements[i] = this.elements[i];
        }
        elements[newSize - 1] = e;
        this.elements = elements;
        return true;
    }

    @Override
    public String get(int i) {
        return "";
    }

    @Override
    public boolean contains(String e) {
        return false;
    }

    @Override
    public boolean remove(String e) {
        return false;
    }

    @Override
    public boolean remove(int i) {
        return false;
    }

    @Override
    public int indexOf(String e) {
        return 0;
    }
}

