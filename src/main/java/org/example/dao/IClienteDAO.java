package org.example.dao;

import org.example.domain.Cliente;

public interface IClienteDAO {
    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
