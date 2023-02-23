package edai.tema1;

import java.util.Iterator;

public class ReadonlyArrays {
    public static <T> IReadonlyList<T> asReadonlyList(T... array) {
        return new IReadonlyList<T>() {
            @Override
            public int size() {
                return array.length;
            }

            @Override
            public boolean empty() {
                return array.length == 0;
            }

            @Override
            public T get(int index) {
                if (index < 0 || index >= array.length) {
                    throw new IndexOutOfBoundsException();
                }
                return array[index];
            }

            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int index = 0;

                    @Override
                    public boolean hasNext() {
                        return index < array.length;
                    }

                    @Override
                    public T next() {
                        if (!hasNext()) {
                            throw new IndexOutOfBoundsException();
                        }
                        return array[index++];
                    }
                };
            }
        };
    }
}

