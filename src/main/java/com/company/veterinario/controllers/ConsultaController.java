package com.company.veterinario.controllers;

import com.company.veterinario.models.ConsultaModel;
import com.company.veterinario.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @GetMapping("/")
    @ResponseBody
    public List<ConsultaModel> getAll() {
        return consultaService.getAll();
    }

    @GetMapping("/{idConsulta}")
    public ConsultaModel getByIdConsulta(@PathVariable("idConsulta") Long idConsulta) {
        return consultaService.getByIdConsulta(idConsulta);
    }

    @PostMapping("/createConsulta")
    @ResponseBody
    public ConsultaModel post(@RequestBody ConsultaModel consultaModel) {
        return consultaService.post(consultaModel);
    }

    @PutMapping("/{idConsulta}")
    @ResponseBody
    public String put(@PathVariable("idConsulta") Long idConsulta, @RequestBody ConsultaModel consultaModel) {
        return consultaService.put(idConsulta, consultaModel);
    }

    @DeleteMapping("/{idConsulta}")
    public String del(@PathVariable("idConsulta") Long idConsulta) {
        return consultaService.del(idConsulta);
    }
}
