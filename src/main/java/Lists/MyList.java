package Lists;

public interface MyList {
    int size();
    boolean add(String e);
    String get(int i);
    boolean contains(String e);
    boolean remove(String e);
    boolean remove(int i);
    int indexOf(String e);
}
