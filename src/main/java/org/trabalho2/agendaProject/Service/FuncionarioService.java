package org.trabalho2.agendaProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabalho2.agendaProject.DTO.FuncionarioRespostaDTO;
import org.trabalho2.agendaProject.Model.Funcionario;
import org.trabalho2.agendaProject.Repository.FuncionarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioRespostaDTO> findAll() {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        List<FuncionarioRespostaDTO> funcionarioRespostaDTOS = new ArrayList<>();

        for (Funcionario funcionario: funcionarios) {
            funcionarioRespostaDTOS.add(new FuncionarioRespostaDTO(funcionario));
        }

        return funcionarioRespostaDTOS;
    }

    public FuncionarioRespostaDTO findById(Integer id) {
        return new FuncionarioRespostaDTO(funcionarioRepository.findById(id).get());
    }
}