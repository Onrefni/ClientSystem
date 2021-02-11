package br.com.bp.converter.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.rbf.model.Client;
import br.com.rbf.vo.v1.ClientVO;

public class MockClient {
	
	public Client mockEntity() {
    	return mockEntity(0);
    }
    
    public ClientVO mockVO() {
    	return mockVO(0);
    }
    
    public List<Client> mockEntityList() {
        List<Client> Clients = new ArrayList<Client>();
        for (int i = 0; i < 14; i++) {
            Clients.add(mockEntity(i));
        }
        return Clients;
    }

    public List<ClientVO> mockVOList() {
        List<ClientVO> Clients = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            Clients.add(mockVO(i));
        }
        return Clients;
    }
    
    private Client mockEntity(Integer number) {
    	Client Client = new Client();
    	Client.setAddress("Addres Test" + number);
        Client.setName("Name Test" + number);
        Client.setId(number.longValue());
        Client.setCpf("CPF Test" + number);
        return Client;
    }

    private ClientVO mockVO(Integer number) {
    	ClientVO Client = new ClientVO();
    	Client.setAddress("Addres Test" + number);
        Client.setName("Name Test" + number);
        Client.setId(number.longValue());
        Client.setCpf("CPF Test" + number);
        return Client;
    }

}
