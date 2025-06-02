package CoreJava.CollectionFrameworkLookup.ListInterface;

import java.util.AbstractList;
import java.util.ArrayList;

/*
 The AbstractList class in Java is a part of the Java Collection Framework and implements the Collection interface and the AbstractCollection class. AbstractList class provides a skeletal implementation of the List interface to minimize the effort required to implement this interface backed by a Random Access data store.

 public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>


For sequential access data (such as a linked list), AbstractSequentialList should be used in preference to this class.

- To implement an unmodifiable list, for which one needs to only extend this AbstractList Class and implement the get(int) and the size() methods.
- To implement a modifiable list, for which one additionally override the set(int index, E element) method (which otherwise throws an UnsupportedOperationException).
- If the list is variable-size, for which one should override the add(int, E) and remove(int) methods.
 */

public class AbstractListClass {
    public static void main(String[] args) {
        AbstractList<Integer> ablist = new ArrayList<>();
        ablist.add(1);
        ablist.add(2);
        ablist.add(3);
        ablist.add(4);
        System.out.println(ablist);

    }

}