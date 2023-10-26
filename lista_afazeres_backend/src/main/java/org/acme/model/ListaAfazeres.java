package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "lista_afazeres")
public class ListaAfazeres extends PanacheEntity {

    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "data", nullable = false)
    private String data;
    @Column(name = "descricao", nullable = false)
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "ListaAfazeres{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
