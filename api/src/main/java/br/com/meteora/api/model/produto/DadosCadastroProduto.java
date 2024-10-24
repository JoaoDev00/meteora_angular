package br.com.meteora.api.model.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProduto(
<<<<<<< HEAD
        
=======
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3

        @NotBlank String nome,

        @NotBlank String tamanho,

        @NotBlank String modelo,

        @NotBlank String descricao,

        @NotNull double preco,

        @NotBlank String cor,

        @NotNull Fabricante fabricante

) {

}
