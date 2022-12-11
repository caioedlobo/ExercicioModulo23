package org.example.service;

import org.example.domain.Cliente;

public interface IClienteService {

    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);
}
