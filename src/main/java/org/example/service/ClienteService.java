package org.example.service;


import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;

public class ClienteService implements IClienteService{
    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscaPorCPF(cpf);
    }
}
