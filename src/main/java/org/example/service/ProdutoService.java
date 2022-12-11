package org.example.service;

import org.example.dao.IProdutoDAO;
import org.example.dao.generic.IGenericDAO;
import org.example.domain.Produto;
import org.example.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super((IGenericDAO<Produto, String>) dao);
    }

}
