
package pastaApi.entities;

import java.util.UUID;


public class Carro {
    private UUID id;
    private String nome;
    private String categoria;
    private String cor;
    private int ano;
    private Double preco;

    public Carro(String nome, String categoria, String cor, int ano, Double preco) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.categoria = categoria;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public Double getPreco() {
        return preco;
    }
    
    
    
    
}
