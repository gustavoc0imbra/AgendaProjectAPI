package org.trabalho2.agendaProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabalho2.agendaProject.DTO.AgendaRespostaDTO;
import org.trabalho2.agendaProject.Model.Agenda;
import org.trabalho2.agendaProject.Repository.AgendaRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {
    @Autowired
    private AgendaRepository agendaRepository;

    public List<AgendaRespostaDTO> findAll()
    {
        List<Agenda> agendas = agendaRepository.findAll();
        List<AgendaRespostaDTO> agendasDTO = new ArrayList<>();

        for (Agenda agenda: agendas) {
            agendasDTO.add(new AgendaRespostaDTO(agenda));
        }

        return agendasDTO;
    }

    public AgendaRespostaDTO findById(Integer id)
    {
        return new AgendaRespostaDTO(agendaRepository.findById(id).get());
    }

}
