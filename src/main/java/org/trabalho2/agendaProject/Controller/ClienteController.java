package org.trabalho2.agendaProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.trabalho2.agendaProject.DTO.ClienteRespostaDTO;
import org.trabalho2.agendaProject.Service.ClienteService;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    private static final String ENDPOINT = "/api/clientes";

    @GetMapping(ENDPOINT)
    @CrossOrigin
    public List<ClienteRespostaDTO> findAll()
    {
        return clienteService.findAll();
    }

    @GetMapping(ENDPOINT + "/{id}")
    @CrossOrigin
    public ClienteRespostaDTO findOne(@PathVariable("id") Integer id)
    {
        return clienteService.findById(id);
    }

}