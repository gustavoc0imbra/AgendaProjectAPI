package org.trabalho2.agendaProject.DTO;

import jakarta.persistence.ManyToOne;
import org.springframework.format.annotation.DateTimeFormat;
import org.trabalho2.agendaProject.Model.Agenda;
import org.trabalho2.agendaProject.Model.Cliente;
import org.trabalho2.agendaProject.Model.Funcionario;
import org.trabalho2.agendaProject.Model.Servico;

import java.util.Date;

public class AgendaRespostaDTO {
    private Integer id;

    private String descricao;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date data;
    private ClienteRespostaDTO cliente;
    private ServicoRespostaDTO servico;
    private boolean status;
    private FuncionarioRespostaDTO funcionario;

    public AgendaRespostaDTO (Agenda agenda) {
        id = agenda.getId();
        descricao = agenda.getDescricao();
        data = agenda.getData();
        cliente = new ClienteRespostaDTO(agenda.getCliente());
        servico = new ServicoRespostaDTO(agenda.getServico()) ;
        status = agenda.getStatus();
        funcionario = new FuncionarioRespostaDTO(agenda.getFuncionario());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ClienteRespostaDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteRespostaDTO cliente) {
        this.cliente = cliente;
    }

    public ServicoRespostaDTO getServico() {
        return servico;
    }

    public void setServico(ServicoRespostaDTO servico) {
        this.servico = servico;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public FuncionarioRespostaDTO getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioRespostaDTO funcionario) {
        this.funcionario = funcionario;
    }
}
