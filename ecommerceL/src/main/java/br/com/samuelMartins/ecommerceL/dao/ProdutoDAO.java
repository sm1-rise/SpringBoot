package br.com.samuelMartins.ecommerceL.dao;
import br.com.samuelMartins.ecommerceL.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

}
