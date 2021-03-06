package br.com.rbf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rbf.model.User;

/**
 * Repository of the users
 * 
 * @author Rommel Fonseca
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUserName(String userName);

}
