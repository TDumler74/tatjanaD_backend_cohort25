package de.ait.shop.repositories;

import java.util.List;

public interface CrudRepository <T>{

  T findById(long id);

  List<T> findAll();
  void save(T model);
  void deleteById(long id);
  void update(T model);
}
