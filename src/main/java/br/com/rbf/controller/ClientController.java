package br.com.rbf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rbf.services.ClientServices;
import br.com.rbf.vo.v1.ClientVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "ClientEndpoint")
@RestController
@RequestMapping("/api/client/v1")
public class ClientController {

	@Autowired
	private ClientServices services;

	@ApiOperation(value = "Find All clients")
	@GetMapping(produces = { "application/json", "application/xml" })
	public ResponseEntity<?> findAll() {

		List<ClientVO> listClients = services.findAll();

		return new ResponseEntity<>(listClients, HttpStatus.OK);
	}

	@ApiOperation(value = "Find a specific client by name")
	@GetMapping(value = "/findClientByName/{name}", produces = { "application/json", "application/xml" })
	public ResponseEntity<?> findPersonByName(@PathVariable("name") String name) {

		ClientVO clients = services.findByName(name);

		return new ResponseEntity<>(clients, HttpStatus.OK);
	}

	@ApiOperation(value = "Create a new Client")
	@PostMapping
	public ClientVO create(@RequestBody ClientVO client) {
		return services.create(client);
	}

	@ApiOperation(value = "Update a specific Client")
	@PutMapping
	public Object update(@RequestBody ClientVO client) {
		return services.update(client);
	}

	@ApiOperation(value = "Delete a specific Client by your ID")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		services.delete(id);
		return ResponseEntity.ok().build();
	}

}
