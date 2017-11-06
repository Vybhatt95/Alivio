package com.ex.alivio.services;

public interface Services<T> {
    T findOne(T t);
    T insert(T t);
    T delete(T t);
    T update(T t);
}
