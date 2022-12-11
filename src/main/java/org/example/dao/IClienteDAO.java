package org.example.dao;

import org.example.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);

    Cliente buscaPorCPF(Long cpf);
}
