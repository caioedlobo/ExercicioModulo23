package org.example.dao;

import org.example.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO{
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscaPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
