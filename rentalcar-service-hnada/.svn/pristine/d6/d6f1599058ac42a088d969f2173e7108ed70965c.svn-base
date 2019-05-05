package com.unnamed.carrental.transformer;

import java.util.List;

public interface ITransformer<E, DTO> {

	public E toEntity(DTO dto);

	public DTO toDTO(E entity);

	public List<E> toEntityList(List<DTO> dtoList);

	public List<DTO> toDTOList(List<E> entityList);
}
