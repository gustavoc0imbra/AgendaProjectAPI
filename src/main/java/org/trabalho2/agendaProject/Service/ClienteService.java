package org.trabalho2.agendaProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabalho2.agendaProject.DTO.ClienteRespostaDTO;
import org.trabalho2.agendaProject.Model.Cliente;
import org.trabalho2.agendaProject.Repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteRespostaDTO> findAll() {
        List<Cliente> clientes = clienteRepository.findAll();
        List<ClienteRespostaDTO> clientesDTO = new ArrayList<>();

        for (Cliente cliente: clientes) {
            clientesDTO.add(new ClienteRespostaDTO(cliente));
        }

        return clientesDTO;
    }

    public ClienteRespostaDTO findById(Integer id) {
        return new ClienteRespostaDTO(clienteRepository.findById(id).get());
    }
}
