package edai.tema1;

import java.util.*;

public class CollectionFactory<T extends Comparable<T>> {

    public Collection<T> createAscSortedCollection() {

        return new TreeSet<>();
    }

    public Collection<T> createDescSortedCollection() {
        return new TreeSet<>(Collections.reverseOrder());
    }

    public Collection<T> createUnsortedCollection() {
        return new ArrayList<>();
    }

    public Collection<T> createSortedList(Comparator<T> comparator) {
        return new ArrayList<>();
    }

}
