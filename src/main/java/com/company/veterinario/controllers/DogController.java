package com.company.veterinario.controllers;

import com.company.veterinario.models.DogModel;
import com.company.veterinario.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dog", produces = MediaType.APPLICATION_JSON_VALUE)
public class DogController {
    @Autowired
    private DogService dogService;

    @GetMapping("/")
    @ResponseBody
    public List<DogModel> getAll() {
        return dogService.getAll();
    }

    @GetMapping("/{cadastroDog}")
    public DogModel getByCadastro(@PathVariable("cadastroDog") Long cadastroDog) {
        return dogService.getByCadastro(cadastroDog);
    }

    @PostMapping("/cadastraDog")
    @ResponseBody
    public String post(@RequestBody DogModel dogModel) {
        return dogService.post(dogModel); // VER OQ VAI RETORNAR
    }

    @PutMapping("/upDog/{cadastroDog}")
    @ResponseBody
    public String put(@PathVariable("cadastroDog") Long cadastroDog, @RequestBody DogModel dogModel) {
        return dogService.put(cadastroDog, dogModel);
    }

    @DeleteMapping("/delete/{cadastroDog}")
    public String del(@PathVariable("cadastroDog") Long cadastroDog) {
        return dogService.del(cadastroDog);
    }
}
