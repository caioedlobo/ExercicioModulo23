package org.example.service;


import org.example.dao.IClienteDAO;
import org.example.dao.generic.IGenericDAO;
import org.example.domain.Cliente;
import org.example.exceptions.TipoChaveNaoEncontradaException;
import org.example.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super((IGenericDAO<Cliente, Long>) clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
