package br.com.rbf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.rbf.model.User;
import br.com.rbf.repository.UserRepository;

/**
 * Class Service of {@link User}
 * 
 * @author Rommel Fonseca
 *
 */
@Service
public class UserServices implements UserDetailsService {

	@Autowired
	UserRepository repository;

	public UserServices(UserRepository repository) {
		this.repository = repository;
	}


	/**
	 * Retrieve details of {@link User} by her name
	 * 
	 * @param userName must not be null. 
	 * @return User Information.
	 * @throws UsernameNotFoundException When not found {@link User} by her name
	 */
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		var user = repository.findByUserName(userName);
		if (user != null) {
			return user;
		} else {
			throw new UsernameNotFoundException("Username " + userName + " not found");
		}

	}
}
