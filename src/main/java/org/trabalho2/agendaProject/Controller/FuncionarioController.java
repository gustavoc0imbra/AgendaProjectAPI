package org.trabalho2.agendaProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.trabalho2.agendaProject.DTO.FuncionarioRespostaDTO;
import org.trabalho2.agendaProject.Service.FuncionarioService;

import java.util.List;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    private static final String ENDPOINT = "/api/funcionarios";

    @GetMapping(ENDPOINT)
    public List<FuncionarioRespostaDTO> findAll() {
        return funcionarioService.findAll();
    }

    @GetMapping(ENDPOINT + "/{id}")
    public FuncionarioRespostaDTO findOne(@PathVariable("id") Integer id) {
        return funcionarioService.findById(id);
    }

}
