package br.com.samuelMartins.ecommerceL.service;

import br.com.samuelMartins.ecommerceL.dao.DepartamentoDAO;
import br.com.samuelMartins.ecommerceL.model.Deparatamento;

import java.util.ArrayList;

public interface IDepartamentoService {
    public Deparatamento criarNovo(Deparatamento novo);
    public Deparatamento atualizarDados(Deparatamento dados);
    public ArrayList<Deparatamento> buscarTodos();
    public Deparatamento buscarPeloId(Integer id);
    public void excluirDepartamento(Integer id);
}
