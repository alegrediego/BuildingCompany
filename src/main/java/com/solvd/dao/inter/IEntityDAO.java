package com.solvd.dao.inter;

public interface IEntityDAO <T>{
    public void save (T t);
    public T getById(long id);
}
