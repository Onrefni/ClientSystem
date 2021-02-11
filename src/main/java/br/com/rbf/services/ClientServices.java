package br.com.rbf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rbf.converter.DozerConverter;
import br.com.rbf.exception.ResourceNotFoundException;
import br.com.rbf.model.Client;
import br.com.rbf.repository.ClientRepository;
import br.com.rbf.vo.v1.ClientVO;

/**
 * Class Servise of the Client
 * 
 * @author Rommel Fonseca
 *
 */
@Service
public class ClientServices {

	private static final String NO_RECORDS_FOUND_FOR_THIS_NAME = "No records found for this Name";
	private static final String NO_RECORDS_FOUND_FOR_THIS_ID = "No records found for this ID";
	@Autowired
	ClientRepository repository;

	/**
	 * Saves a given entity.
	 * 
	 * @param client must not be null.
	 * @return the saved entity
	 */
	public ClientVO create(ClientVO client) {
		var entity = DozerConverter.parseObject(client, Client.class);
		var vo = DozerConverter.parseObject(repository.save(entity), ClientVO.class);
		return vo;
	}

	/**
	 * Updated a given entity.
	 * 
	 * @param client must not be null. 
	 * @return the Updated entity.
	 */
	public Object update(ClientVO client) {
		var clientEntity = DozerConverter.parseObject(repository.findById(client.getId())
				.orElseThrow(() -> new ResourceNotFoundException(NO_RECORDS_FOUND_FOR_THIS_ID)), Client.class);

		clientEntity.setName(client.getName());
		clientEntity.setCpf(client.getCpf());
		clientEntity.setAddress(client.getAddress());
		var vo = DozerConverter.parseObject(repository.save(clientEntity), ClientVO.class);
		return vo;
	}

	/**
	 * Deletes a given entity.
	 * 
	 * @param idClient
	 */
	public void delete(long idClient) {
		Client clientDelete = repository.findById(idClient)
				.orElseThrow(() -> new ResourceNotFoundException(NO_RECORDS_FOUND_FOR_THIS_ID));
		repository.delete(clientDelete);
	}

	/**
	 * @return all instances of the Client.
	 */
	public List<ClientVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), ClientVO.class);
	}

	/**
	 * @param id
	 * @return retrieves an entity by its id.
	 */
	public ClientVO findByid(Long id) {
		var entity = DozerConverter.parseObject(repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(NO_RECORDS_FOUND_FOR_THIS_ID)), ClientVO.class);
		return DozerConverter.parseObject(entity, ClientVO.class);
	}

	/**
	 * @param name
	 * @return retrieves an entity by its name.
	 */
	public ClientVO findByName(String name) {
		  var entity = DozerConverter.parseObject(repository.findByName(name)
				.orElseThrow(() -> new ResourceNotFoundException(NO_RECORDS_FOUND_FOR_THIS_NAME)), Client.class);
		 return DozerConverter.parseObject(entity, ClientVO.class);
	}

}
