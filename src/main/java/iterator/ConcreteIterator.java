package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcreteIterator implements Iterator {
    private Object array;
    private int index;

    public ConcreteIterator(ArrayList<Object> array){
        this.array = array;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
