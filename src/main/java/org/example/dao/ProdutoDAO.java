package org.example.dao;

import org.example.dao.generic.GenericDAO;
import org.example.domain.Produto;
import org.example.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setDescricao(entity.getDescricao());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setValor(entity.getValor());
    }

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException, TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(String valor) {
        return null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
