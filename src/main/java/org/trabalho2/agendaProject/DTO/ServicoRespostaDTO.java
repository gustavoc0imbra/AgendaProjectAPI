package org.trabalho2.agendaProject.DTO;

import org.trabalho2.agendaProject.Model.Servico;

public class ServicoRespostaDTO {
    private Integer id;
    private String nome;
    private Double valor;

    public ServicoRespostaDTO(Servico servico) {
        id = servico.getId();
        nome = servico.getNome();
        valor = servico.getValor();
    }

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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
