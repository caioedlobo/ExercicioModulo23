package org.example.dao;

import org.example.dao.generic.GenericDAO;
import org.example.domain.Venda;
import org.example.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public Boolean cadastrar(Venda entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void alterar(Venda entity) throws TipoChaveNaoEncontradaException, TipoChaveNaoEncontradaException {

    }

    @Override
    public Venda consultar(String valor) {
        return null;
    }

    @Override
    public Collection<Venda> buscarTodos() {
        return null;
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Venda.Status.CONCLUIDA);
        super.alterar(venda);
    }



}
