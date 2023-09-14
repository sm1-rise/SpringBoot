package br.com.samuelMartins.ecommerceL.model;

import javax.persistence.*;


//Significa que minha base é armazenavel

@Entity // Indica que a classe é armazenada no banco
@Table(name="departamento") //Torno explicito o nome da table
public class Deparatamento {

    @Column(name = "id") //explicito o nome da coluna
    @Id                  // indico que este atributo correspode a PK da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto impremente
    private Integer id;

    @Column(name = "nome", length = 75, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 100, nullable = true)
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
