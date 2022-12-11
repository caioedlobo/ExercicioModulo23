package org.example;

import org.example.dao.ClienteDaoMock;
import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;
import org.example.service.ClienteService;
import org.example.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {



    private IClienteDAO dao = new ClienteDaoMock();
    private IClienteService clienteService = new ClienteService(dao);
    //public ClienteTest(){     //outra forma de instanciar
        //clienteService = new ClienteService();
    //}

    @Before        //ele é executado antes de cada teste
    public void init(){

    }

    @Test
    public void pesquisarCliente(){
        Cliente cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Caio");
        cliente.setCidade("VDC");
        cliente.setEnd("End");
        cliente.setEstado("BA");
        cliente.setNumero(10);
        cliente.setTel(77999999999L);

        clienteService.salvar(cliente);

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
}
