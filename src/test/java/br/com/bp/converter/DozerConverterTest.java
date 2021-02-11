package br.com.bp.converter;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import br.com.bp.converter.mock.MockClient;
import br.com.rbf.converter.DozerConverter;
import br.com.rbf.model.Client;
import br.com.rbf.vo.v1.ClientVO;

public class DozerConverterTest {
	
	MockClient inputObject;

    @Before
    public void setUp() {
        inputObject = new MockClient();
    }

    @Test
    public void parseEntityToVOTest() {
        ClientVO output = DozerConverter.parseObject(inputObject.mockEntity(), ClientVO.class);
        Assert.assertEquals(Long.valueOf(0L), output.getId());
        Assert.assertEquals("Name Test0", output.getName());
        Assert.assertEquals("Addres Test0", output.getAddress());
        Assert.assertEquals("CPF", output.getCpf());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<ClientVO> outputList = DozerConverter.parseListObjects(inputObject.mockEntityList(), ClientVO.class);
        ClientVO outputZero = outputList.get(0);
        
        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
        Assert.assertEquals("Name Test0", outputZero.getName());
        Assert.assertEquals("Addres Test0", outputZero.getAddress());
        Assert.assertEquals("CPF", outputZero.getCpf());
        
        ClientVO outputSeven = outputList.get(7);
        
        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
        Assert.assertEquals("Name Test7", outputSeven.getName());
        Assert.assertEquals("Addres Test7", outputSeven.getAddress());
        Assert.assertEquals("CPF", outputSeven.getCpf());
        
        ClientVO outputTwelve = outputList.get(12);
        
        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
        Assert.assertEquals("Name Test12", outputTwelve.getName());
        Assert.assertEquals("Addres Test12", outputTwelve.getAddress());
        Assert.assertEquals("CPF", outputTwelve.getCpf());
    }

    @Test
    public void parseVOToEntityTest() {
        Client output = DozerConverter.parseObject(inputObject.mockVO(), Client.class);
        Assert.assertEquals(Long.valueOf(0L), output.getId());
        Assert.assertEquals("Name Test0", output.getName());
        Assert.assertEquals("Addres Test0", output.getAddress());
        Assert.assertEquals("CPF", output.getCpf());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Client> outputList = DozerConverter.parseListObjects(inputObject.mockVOList(), Client.class);
        Client outputZero = outputList.get(0);
        
        Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
        Assert.assertEquals("Name Test0", outputZero.getName());
        Assert.assertEquals("Addres Test0", outputZero.getAddress());
        Assert.assertEquals("Male", outputZero.getCpf());
        
        Client outputSeven = outputList.get(7);
        
        Assert.assertEquals(Long.valueOf(7L), outputSeven.getId());
        Assert.assertEquals("Name Test7", outputSeven.getName());
        Assert.assertEquals("Addres Test7", outputSeven.getAddress());
        Assert.assertEquals("CPF", outputSeven.getCpf());
        
        Client outputTwelve = outputList.get(12);
        
        Assert.assertEquals(Long.valueOf(12L), outputTwelve.getId());
        Assert.assertEquals("Name Test12", outputTwelve.getName());
        Assert.assertEquals("Addres Test12", outputTwelve.getAddress());
        Assert.assertEquals("CPF", outputTwelve.getCpf());
    }
}
