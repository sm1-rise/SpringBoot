package br.com.samuelMartins.ecommerceL.service;

import br.com.samuelMartins.ecommerceL.dao.DepartamentoDAO;
import br.com.samuelMartins.ecommerceL.model.Deparatamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

    @Autowired
    private DepartamentoDAO dao;
    @Override
    public Deparatamento criarNovo(Deparatamento novo) {
        if(novo.getNome() != null){
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public Deparatamento atualizarDados(Deparatamento dados) {
        if(dados.getId() != null && dados.getNome() != null) {
            return dao.save(dados);
        }
        return null;
    }

    @Override
    public ArrayList<Deparatamento> buscarTodos() {
        return (ArrayList<Deparatamento>) dao.findAll();
    }

    @Override
    public Deparatamento buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void excluirDepartamento(Integer id) {
    dao.deleteById(id);
    }
}
