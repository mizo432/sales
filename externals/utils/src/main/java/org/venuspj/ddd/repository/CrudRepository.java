package org.venuspj.ddd.repository;

public interface CrudRepository<E> {

    void store(E entity);

}
