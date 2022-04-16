package com.lutalic;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

public interface Dao<D, E extends Entry<D>> extends Closeable {

    E get(D key) throws IOException;

    void upsert(E entry);

    void flush() throws IOException;

    void compact() throws IOException;

    default Iterator<E> get(D from, D to) throws IOException {
        return null;
    }

    default Iterator<E> all() throws IOException {
        return get(null, null);
    }

    @Override
    default void close() throws IOException {
        flush();
    }
}
