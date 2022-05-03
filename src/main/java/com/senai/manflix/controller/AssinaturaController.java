package com.senai.manflix.controller;

import com.senai.manflix.model.Assinatura;
import com.senai.manflix.repository.AssinaturaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@Controller
public class AssinaturaController {

    AssinaturaRepository assinaturaRepository;

    AssinaturaController(AssinaturaRepository assinaturaRepository){
        this.assinaturaRepository = assinaturaRepository;
    }

    @GetMapping("/assinatura")
    public List<Assinatura> getAll(){
        return assinaturaRepository.findAll();
    }

    @GetMapping("/assinatura/{id}")
    public Optional<Assinatura> getOne(@PathVariable(name = "id") Long id){
        return assinaturaRepository.findById(id);
    }

    @PostMapping("/assinatura")
    public Assinatura insertUser(@RequestBody Assinatura assinatura){
        assinaturaRepository.save(assinatura);
        return assinatura;
    }

    @PutMapping("/assinatura")
    public Assinatura updateUser(@RequestBody Assinatura assinatura){
        assinaturaRepository.save(assinatura);
        return assinatura;
    }

    @DeleteMapping("/assinatura/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id){
        assinaturaRepository.deleteById(id);
        return "Deletado com Sucesso!";
    }
}
