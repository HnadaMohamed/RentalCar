package com.unnamed.carrental.service;

import java.util.List;

public interface CrudService<T> {

	T create (T type); 
	
	T update(Long id, T type);
	
	T getById(Long id);
	
	List<T> getAll();
	
	void delete(Long id);
}
