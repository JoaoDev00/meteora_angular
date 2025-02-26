package br.com.meteora.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.meteora.api.model.usuario.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/listar")
    public List<UsuarioModel> listar() {
        return repository.findAll();
    }

    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroUsuario dados) {
        repository.save(new UsuarioModel(dados));
    }

    @PutMapping
    @Transactional
<<<<<<< HEAD
    public void atualizar(@RequestBody DadosAtualizarUsuario dados){
        // UsuarioModel usuario = repository.findById(dados.getId()).orElseThrow();
        UsuarioModel usuario = repository.getReferenceById(dados.id());
        usuario.atualizarInformacoes(dados);
    }
    @Transactional
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id ){
        repository.deleteById(id);
    }

=======
    public void atualizar(@RequestBody DadosAtualizarUsuario dados) {
        UsuarioModel usuario = repository.getReferenceById(dados.id());
        usuario.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
}
