package org.trabalho2.agendaProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabalho2.agendaProject.DTO.ServicoRespostaDTO;
import org.trabalho2.agendaProject.Model.Servico;
import org.trabalho2.agendaProject.Repository.ServicoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public List<ServicoRespostaDTO> findAll()
    {
        List<Servico> servicos = servicoRepository.findAll();
        List<ServicoRespostaDTO> servicosDTO = new ArrayList<>();

        for (Servico servico: servicos) {
            servicosDTO.add(new ServicoRespostaDTO(servico));
        }

        return servicosDTO;
    }

    public ServicoRespostaDTO encontrarServicoPorId(Integer id) {
        return new ServicoRespostaDTO(servicoRepository.findById(id).get()) ;
    }
}