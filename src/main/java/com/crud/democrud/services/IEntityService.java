package com.crud.democrud.services;

import java.util.List;

public interface IEntityService <T> {

    T findById(Long id);
    List<T> findAll();
    void save (T entity);
    void delete(Long id);

}
