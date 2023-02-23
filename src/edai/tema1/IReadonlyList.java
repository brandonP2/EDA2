package edai.tema1;

public interface IReadonlyList<T> extends Iterable<T> {
    int size();
    boolean empty();
    T get(int index);
}
