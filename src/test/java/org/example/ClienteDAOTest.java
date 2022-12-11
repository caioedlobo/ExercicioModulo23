package org.example;

import org.example.dao.ClienteDaoMock;
import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDao = new ClienteDaoMock();
    private Cliente cliente;

    @Before        //ele é executado antes de cada teste
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Caio");
        cliente.setCidade("VDC");
        cliente.setEnd("End");
        cliente.setEstado("BA");
        cliente.setNumero(10);
        cliente.setTel(77999999999L);
        clienteDao.salvar(cliente);
    }

    @Test
    public void pesquisarCliente(){

        Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente(){
        Boolean retorno = clienteDao.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteDao.excluir(cliente.getCpf());
        //Assert.assertTrue(retorno);
    }
}
