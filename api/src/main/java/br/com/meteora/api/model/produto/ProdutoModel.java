package br.com.meteora.api.model.produto;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "produtos")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProdutoModel {

<<<<<<< HEAD

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
    private String nome;
    private String tamanho;
    private String modelo;
    private String descricao;
    private double preco;
    private String cor;

<<<<<<< HEAD
    public void atualizarPreco(DadosAtualizarProduto dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.tamanho()!= null) {
            this.tamanho = dados.tamanho();
        }
        if (dados.modelo() != null) {
            this.modelo = dados.modelo();
        }

    }

    @Enumerated(EnumType.STRING)
    private Fabricante fabricante;


=======
    @Enumerated(EnumType.STRING)
    private Fabricante fabricante;

>>>>>>> 9ffea21ec7b754a487ebb95235397e8c65dadba3
    public ProdutoModel(DadosCadastroProduto dados) {
        this.nome = dados.nome();
        this.tamanho = dados.tamanho();
        this.modelo = dados.modelo();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.cor = dados.cor();
        this.fabricante = dados.fabricante();
    }

}
