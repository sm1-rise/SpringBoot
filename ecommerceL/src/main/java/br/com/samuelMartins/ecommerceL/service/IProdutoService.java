package br.com.samuelMartins.ecommerceL.service;

import br.com.samuelMartins.ecommerceL.model.Deparatamento;
import br.com.samuelMartins.ecommerceL.model.Produto;

import java.util.ArrayList;

public interface IProdutoService {

    public ArrayList<Produto> recuperarTodos();
    public Produto recuperarPeloID(Integer id);
    public Produto cadastrarNovo(Produto novo);

}
