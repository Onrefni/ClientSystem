package br.com.rbf.vo.v1;

import java.io.Serializable;

/**
 * Class Value Object of the Client
 * 
 * @author Rommel Fonseca
 *
 */
public class ClientVO  implements Serializable {

	private static final long serialVersionUID = -4607296263271108972L;
	
	private Long id;
	private String name;
	private String cpf;
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
