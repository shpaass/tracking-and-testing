package org.example;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;

public class GT_HashSet<E extends Parent> extends AbstractSet<E> {
    public final HashMap<Parent, Object> map = new HashMap<Parent, Object>() {{
        put(new Parent(), 1);
        put(new Parent(), 2);
        put(new Parent(), 3);
    }};

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) map.keySet()
                .iterator();
    }

    @Override
    public int size() {
        return 0;
    }
}
