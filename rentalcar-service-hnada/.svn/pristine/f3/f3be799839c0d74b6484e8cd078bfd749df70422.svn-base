package com.unnamed.carrental.transformer;

import com.unnamed.carrental.dto.ClientDTO;

import com.unnamed.carrental.entity.Client;
import com.unnamed.carrental.transformer.impl.TransformerImpl;

public class ClientTransformer extends TransformerImpl<Client,ClientDTO> {

	@Override
	public Client toEntity(ClientDTO dto) {
		
		Client client = new Client();
		client.setAdress(dto.getAdress());
		client.setBirthday(dto.getBirthday());
		client.setFirstName(dto.getFirstName());
		client.setIdClient(dto.getIdClient());
		client.setLastName(dto.getLastName());
		client.setPhone(dto.getPhone());
		client.setSignUpDay(dto.getSignUpDay());
		return client;
	}

	@Override
	public ClientDTO toDTO(Client entity) {
		
		ClientDTO client = new ClientDTO();
		client.setAdress(entity.getAdress());
		client.setBirthday(entity.getBirthday());
		client.setFirstName(entity.getFirstName());
		client.setIdClient(entity.getIdClient());
		client.setLastName(entity.getLastName());
		client.setPhone(entity.getPhone());
		client.setSignUpDay(entity.getSignUpDay());
		return client;
	}


}
