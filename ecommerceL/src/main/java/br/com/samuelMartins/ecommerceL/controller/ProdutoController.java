package br.com.samuelMartins.ecommerceL.controller;

import br.com.samuelMartins.ecommerceL.model.Produto;
import br.com.samuelMartins.ecommerceL.service.IProdutoService;
import br.com.samuelMartins.ecommerceL.service.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProdutoController {
    @Autowired
    private IProdutoService service;

    @GetMapping("/produtos")
    public ArrayList<Produto>recuperarTodos(){
        return service.recuperarTodos();
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<Produto>recuperarPeloID(@PathVariable (name = "id")Integer id){
        Produto res = service.recuperarPeloID(id);
        if (res != null)
            return ResponseEntity.ok(res);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/produtos")
    public ResponseEntity<Produto>cadastrarNovo(@RequestBody Produto novo){
        Produto res = service.cadastrarNovo(novo);
        if (novo != null)
            return ResponseEntity.ok(res);
        return ResponseEntity.badRequest().build();
    }

}
