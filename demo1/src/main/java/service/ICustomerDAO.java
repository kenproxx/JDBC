package service;

import java.util.List;

public interface ICustomerDAO<T> {
    void insert(T t);

    List<T> selectAll();

    boolean delete(int id);

    boolean update(T t);

}
