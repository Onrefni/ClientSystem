package br.com.rbf.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rbf.model.Client;

/**
 * Repository of the Clients
 * 
 * @author Rommel Fonseca
 *
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	Optional<Client> findByName(String name);
	
}
