/*
 * moja implementacja Arraylisty, tak cwiczebnie i poznawczo!
 *todo do dokonczenia
 */
package pl.biniek.kolekcje;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/**
 *
 * @author piotr
 */
public class MyArrayList<T> implements List<T> {//todo naniedziele

    Object[] elements;
    int maxSize;
    int actualSize;
    

    /**
     * constructs list of expected size
     */
    public MyArrayList(int initialCapacity) {
        elements = new Object[initialCapacity];
        actualSize = 0;
        maxSize = initialCapacity;

    }

    /**
     * constructs default size list of size 50
     */
    public MyArrayList() {

        this(50);
        maxSize = 50;

    }

    public MyArrayList(Collection<? extends T> c) {
        for (T t : c) {
            elements[actualSize++]=c;
            
        }
    }

    private void increase() {
      Object[] tmpElements=new Object[(actualSize*2)];
        for (int i = 0; i < actualSize; i++) {
            tmpElements[i]=elements[i];
        }
        elements=tmpElements;
        maxSize=actualSize*2;
            
            
        }
    

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return this.indexOf(o) > 0;

    }

    @Override
    public Iterator iterator() {
        return new MyIterator();

    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[actualSize];
        for (int i = 0; i < actualSize; i++) {
            newArray[i] = elements[i];

        }
        return newArray;
    }

    @Override

    public <T> T[] toArray(T[] a) {

        return (T[]) Arrays.copyOf(elements, size(), a.getClass());

    }

    @Override
    public boolean add(T e) {
        if (actualSize == maxSize) {
            increase();
        }

        elements[actualSize++] = e;
        return true;

    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        for (int i = 0; i < actualSize; i++) {
            elements[i]=null;
            
        }
        actualSize=0;
        
    }

    @Override
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T remove(int index) {
        T tmp = (T) elements[index];
        for (int i = index; i < actualSize-1; i++) {
            elements[i]=elements[i+1];
            
        }
        return tmp;
    }

    @Override
    public int indexOf(Object o) {
       
        for (int i = 0; i < actualSize;i ++) {
            if(Objects.equals(elements[i], o)) return i;
            
            
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
          
        for (int i =( actualSize-1); i >=0;i --) {
            if(Objects.equals(elements[i], o)) return i;
            
            
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class MyIterator<E> implements Iterator {

        int index = 0;

        public MyIterator() {

        }

        @Override
        public boolean hasNext() {
            return index != size();
        }

        @Override
        public Object next() {
            return get(++index);
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
