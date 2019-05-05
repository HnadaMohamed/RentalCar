package com.unnamed.carrental.service.impl;

import com.unnamed.carrental.dto.ClientDTO;
import com.unnamed.carrental.entity.Client;
import com.unnamed.carrental.service.ClientService;
import com.unnamed.carrental.servicedao.impldao.GenericDaoImpl;
import com.unnamed.carrental.transformer.ClientTransformer;


public class ClientServiceImpl extends CrudServiceImpl<Client,ClientDTO> implements ClientService {

	public ClientServiceImpl() {
		
		this.dao =  new GenericDaoImpl<Client>();
		this.transformer = new ClientTransformer();
	}

	

	
}
