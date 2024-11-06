package org.trabalho2.agendaProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.trabalho2.agendaProject.DTO.ServicoRespostaDTO;
import org.trabalho2.agendaProject.Service.ServicoService;

import java.util.List;

@RestController
public class ServicoController {
    
    @Autowired
    private ServicoService servicoService;

    private static final String ENDPOINT = "/api/servicos";

    @GetMapping(ENDPOINT)
    @CrossOrigin
    public List<ServicoRespostaDTO> findAll()
    {
        return servicoService.findAll();
    }

    @GetMapping(ENDPOINT + "/{id}")
    @CrossOrigin
    public ServicoRespostaDTO findOne(@PathVariable("id") Integer id)
    {
        return servicoService.encontrarServicoPorId(id);
    }
}
