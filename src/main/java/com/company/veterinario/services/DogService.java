package com.company.veterinario.services;

import com.company.veterinario.models.DogModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DogService {
    private static final Map<Long, DogModel> service = new HashMap<>();

    public List<DogModel> getAll() {
        return new ArrayList<>(service.values());
    }

    public DogModel getByCadastro(Long cadastroDog) {
        return service.get(cadastroDog);
    }

    public String post(DogModel dogModel) {
        Long generateCadastro = service.keySet().size() + 1L;
        dogModel.setCadastroDog(generateCadastro);
        service.put(generateCadastro, dogModel);
        return "Cachorro cadastrado com sucesso!";
    }

    public String put(Long cadastroDog, DogModel dogModel) {
        service.put(cadastroDog, dogModel);
        return "Informações do Dog com cadastro: " + cadastroDog + " foram atualizadas com sucesso!";
    }

    public String del(Long cadastroDog) {
        service.remove(cadastroDog);
        return "Dog com o cadastro: " + cadastroDog + " deletado com sucesso!";
    }
}
