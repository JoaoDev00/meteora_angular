package br.com.meteora.api.model.usuario;

import br.com.meteora.api.model.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

<<<<<<< HEAD
public record DadosAtualizarUsuario(   
    @NotNull Long id,
    String nome,
    String dataDeNascimento,
    DadosEndereco endereco
    ) {


}

=======
public record DadosAtualizarUsuario(
        @NotNull Long id,
        String nome,
        String dataDeNascimento,
        DadosEndereco endereco) {

}
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
