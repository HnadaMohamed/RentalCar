package com.unnamed.carrental.servicedao;

import java.util.List;

public interface GenericDao<T> {

	T create(T type);

	T update(Long id, T type);

	List<T> getAll();

	void delete(Long id);

	T getById(Long id);
}
