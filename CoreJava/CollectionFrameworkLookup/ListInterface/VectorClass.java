package CoreJava.CollectionFrameworkLookup.ListInterface;

import java.util.Vector;


/*
 * The Vector class in Java implements a growable array of objects. Vectors were legacy classes, but now it is fully compatible with collections. 
 * It comes under java.util package and implement the List interface.

Key Features of Vector:
        It expands as elements are added.
        Vector class is synchronized in nature means it is thread-safe by default.
        Like an ArrayList, it maintains insertion order.
        It allows duplicates and nulls.
        It implements List, RandomAccess, Cloneable, and Serializable.

Vector Class Declaration:
public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
 * 
 */

public class VectorClass 
{
    public static void main(String[] args) 
    {
        Vector<Integer> vec = new Vector<>();
        vec.addElement(1);
        vec.addElement(2);
        vec.addElement(4);
        vec.addElement(18);
        System.out.println(vec);
        vec.remove(0);
        vec.set(1,133);

        System.out.println(vec);

        //Shallow copy
        Vector<Integer>copyVec = new Vector<>();
        copyVec = vec;
        System.out.println(copyVec==vec);

        //Deep copy 
        Vector<Integer>deepcopyvec = new Vector<>();
        deepcopyvec.addAll(copyVec);
        System.out.println(deepcopyvec==copyVec);



        
    
    }
    
}
