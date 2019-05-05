package car.rental.services.impl;

import java.util.List;

import car.rental.database.StaticDatabase;

import car.rental.services.CrudService;

public class CrudServiceImpl<T> implements CrudService<T> {

	StaticDatabase<T> DB = new StaticDatabase<T>();

	public T create(T t) {
		DB.GetList().add(t);
		return t;
	}

	public T update(Long id, T t) {
		DB.GetList().set(id.intValue(), t);
		return null;
	}

	public List<T> getAll() {
		return DB.GetList();
	}

	public T getById(Long id) {
		return DB.GetList().get(id.intValue());
	}

	public void delete(Long id) {
		DB.GetList().remove(id.intValue());

	}

}
