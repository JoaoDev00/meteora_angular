package br.com.meteora.api.model.endereco;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoModel {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

<<<<<<< HEAD
    public void atualizarEndereco(DadosEndereco dados){
        if (dados.logradouro() !=null) {
            this.logradouro = dados.logradouro();            
=======
    public void atualizarEndereco(DadosEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
        }
        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null) {
            this.cep = dados.cep();
        }
        if (dados.uf() != null) {
            this.uf = dados.uf();
        }
        if (dados.cidade() != null) {
            this.cidade = dados.cidade();
        }
        if (dados.numero() != null) {
<<<<<<< HEAD
            this.numero =  dados.numero();
        }
    }
=======
            this.numero = dados.numero();
        }
        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        }
    }

>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
    public EnderecoModel(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
<<<<<<< HEAD
   }
}
 
=======
    }

}
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
