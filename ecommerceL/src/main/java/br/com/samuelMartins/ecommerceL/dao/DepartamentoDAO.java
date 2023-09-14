package br.com.samuelMartins.ecommerceL.dao;

import br.com.samuelMartins.ecommerceL.model.Deparatamento;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event;

public interface DepartamentoDAO extends CrudRepository<Deparatamento, Integer> {

}
