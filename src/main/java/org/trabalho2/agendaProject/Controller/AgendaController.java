package org.trabalho2.agendaProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.trabalho2.agendaProject.DTO.AgendaRespostaDTO;
import org.trabalho2.agendaProject.Service.AgendaService;

import java.util.List;

@RestController
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    private static final String ENDPOINT = "/api/agendas";

    @GetMapping(ENDPOINT)
    @CrossOrigin
    public List<AgendaRespostaDTO> findAll()
    {
        return agendaService.findAll();
    }


    @GetMapping(ENDPOINT + "/{id}")
    @CrossOrigin
    public AgendaRespostaDTO findOne(@PathVariable("id") Integer id)
    {
        return agendaService.findById(id);
    }

}
