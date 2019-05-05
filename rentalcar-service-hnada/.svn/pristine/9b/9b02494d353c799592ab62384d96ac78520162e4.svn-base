package com.unnamed.carrental.service.impl;

import java.util.List;
import com.unnamed.carrental.service.CrudService;
import com.unnamed.carrental.servicedao.GenericDao;
import com.unnamed.carrental.transformer.ITransformer;



public class CrudServiceImpl<T,DTO> implements CrudService<DTO> {

	GenericDao<T> dao;
	ITransformer<T,DTO> transformer;
	
	@Override
	public DTO create(DTO type) {
		dao.create(transformer.toEntity(type));
		return null;
	}
	@Override
	public DTO update(Long id, DTO type) {
		dao.update(id, transformer.toEntity(type));
		return null;
	}
	@Override
	public DTO getById(Long id) {
		return transformer.toDTO(dao.getById(id));
	}
	@Override
	public List<DTO> getAll() {
		return transformer.toDTOList(dao.getAll());
	}
	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	
}
