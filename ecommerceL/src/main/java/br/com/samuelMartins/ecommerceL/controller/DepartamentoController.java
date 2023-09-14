package br.com.samuelMartins.ecommerceL.controller;

import br.com.samuelMartins.ecommerceL.dao.DepartamentoDAO;
import br.com.samuelMartins.ecommerceL.model.Deparatamento;
import br.com.samuelMartins.ecommerceL.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DepartamentoController {
    @Autowired
   private IDepartamentoService service;

    @GetMapping("/departamentos")
    public ArrayList<Deparatamento>recuperarTodos(){
        return service.buscarTodos();
    }

    @PostMapping("/departamentos")
    public ResponseEntity<Deparatamento> incluirNovo(@RequestBody Deparatamento novo){
        Deparatamento res = service.criarNovo(novo);
        if(res != null)
            return ResponseEntity.ok(res);
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/departamentos")
    public ResponseEntity<Deparatamento>alterarDados(@RequestBody Deparatamento dados){
        Deparatamento res = service.atualizarDados(dados);
        if(dados != null)
            return ResponseEntity.ok(res);
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping ("/departamentos/{id}")
    public ResponseEntity<Deparatamento>excluirDepartamento(@PathVariable Integer id){
        service.excluirDepartamento(id);
        return ResponseEntity.ok(null);
    }


    @GetMapping("/departamentos/{id}")
    public ResponseEntity<Deparatamento> buscarPeloId(@PathVariable (name = "id") Integer id){
        Deparatamento res = service.buscarPeloId(id);
        if (res != null)
            return ResponseEntity.ok(res);
        return ResponseEntity.notFound().build();

    }
}


