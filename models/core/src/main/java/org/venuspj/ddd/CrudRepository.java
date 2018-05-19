package org.venuspj.ddd;

public interface CrudRepository<E> {

    void store(E entity);

}
