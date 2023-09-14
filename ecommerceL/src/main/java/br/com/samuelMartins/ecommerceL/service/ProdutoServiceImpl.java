package br.com.samuelMartins.ecommerceL.service;

import br.com.samuelMartins.ecommerceL.dao.ProdutoDAO;
import br.com.samuelMartins.ecommerceL.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProdutoServiceImpl implements IProdutoService {

    @Autowired
    private ProdutoDAO dao;

    @Override
    public ArrayList<Produto> recuperarTodos() {
        return (ArrayList<Produto>)dao.findAll();
    }

    @Override
    public Produto recuperarPeloID(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Produto cadastrarNovo(Produto novo) {
        return dao.save(novo);
    }
}
