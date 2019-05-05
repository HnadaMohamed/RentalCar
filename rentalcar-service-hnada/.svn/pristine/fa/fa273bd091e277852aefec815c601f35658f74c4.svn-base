package com.unnamed.carrental.transformer.impl;

import java.util.ArrayList;
import java.util.List;

import com.unnamed.carrental.transformer.ITransformer;

public abstract class TransformerImpl<E,DTO> implements ITransformer<E,DTO>{

	@Override
	public abstract E toEntity(DTO dto);
	
	@Override
	public abstract DTO toDTO(E entity);
	
	@Override
	public List<E> toEntityList(List<DTO> dtoList) {

		List<E> entityList = new ArrayList<E>();
		for (DTO dto : dtoList) {
			entityList.add(toEntity(dto));
		}
		return entityList;
	}
	@Override
	public List<DTO> toDTOList(List<E> entityList) {

		List<DTO> dtoList = new ArrayList<DTO>();
		for (E entity : entityList) {
			dtoList.add(toDTO(entity));
		}
		return dtoList;
	}

}
