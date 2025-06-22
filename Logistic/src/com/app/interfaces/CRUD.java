package com.app.interfaces;

import java.util.List;

public interface CRUD <T> {
    public void create(T obj);
    public List<T> read();
    public void update(T obj);
    public void delete(int id);
}
