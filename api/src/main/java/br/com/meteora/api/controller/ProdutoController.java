package br.com.meteora.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
import br.com.meteora.api.model.produto.*;
import jakarta.transaction.Transactional;
=======

import br.com.meteora.api.model.produto.*;
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
import jakarta.validation.Valid;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/listar")
    public List<ProdutoModel> listar() {
        return repository.findAll();
    }
<<<<<<< HEAD
        
    @PostMapping("/cadastrar")
    @Transactional
=======

    @PostMapping("/cadastrar")
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
    public void cadastrar(@RequestBody @Valid DadosCadastroProduto dados) {
        repository.save(new ProdutoModel(dados));
    }

<<<<<<< HEAD
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizarProduto dados) {
        ProdutoModel produto = repository.getReferenceById(dados.id());
        produto.atualizarPreco(dados);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
        
    }

=======
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
}
