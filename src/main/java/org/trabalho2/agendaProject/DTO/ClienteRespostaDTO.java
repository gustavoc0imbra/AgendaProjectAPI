package org.trabalho2.agendaProject.DTO;

import org.trabalho2.agendaProject.Model.Cliente;

public class ClienteRespostaDTO {
    private Integer id;
    private String nome;
    private String telefone;
    private String email;

    public ClienteRespostaDTO(Cliente cliente) {
        id = cliente.getId();
        nome = cliente.getNome();
        telefone = cliente.getTelefone();
        email = cliente.getEmail();
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
