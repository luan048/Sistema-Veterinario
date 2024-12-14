package com.company.veterinario.services;

import com.company.veterinario.models.ConsultaModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ConsultaService {
    public static final Map<Long, ConsultaModel> service = new HashMap<>();

    public List<ConsultaModel> getAll() {
        return new ArrayList<>(service.values());
    }

    public ConsultaModel getByIdConsulta(Long idConsulta) {
        return service.get(idConsulta);
    }

    public ConsultaModel post(ConsultaModel consultaModel) {
        Long generateId = service.keySet().size() + 1L;
        consultaModel.setIdConsulta(generateId);
        service.put(generateId, consultaModel);
        return consultaModel;
    }

    public String put(Long idConsulta, ConsultaModel consultaModel) {
        service.put(idConsulta, consultaModel);
        return "Consulta com id: " + idConsulta + " atualizada com sucesso!";
    }

    public String del(Long idConsulta) {
        service.remove(idConsulta);
        return "Consulta com id: " + idConsulta + " removida com sucesso!";
    }
}
