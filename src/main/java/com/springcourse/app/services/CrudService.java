package com.springcourse.app.services;

public interface CrudService <T,E>{
    T findById(E id);
    T create(T entityDto);
    T updateByPut(T entityDto, E id);
    T updateByPatch(T entityDto, E id);
    void delete(E id);
}
