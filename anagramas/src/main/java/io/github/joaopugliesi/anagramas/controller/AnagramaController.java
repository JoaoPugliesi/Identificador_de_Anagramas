package io.github.joaopugliesi.anagramas.controller;

import io.github.joaopugliesi.anagramas.model.Anagrama;
import io.github.joaopugliesi.anagramas.service.AnagramaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AnagramaController {

    AnagramaService service;
    public AnagramaController(AnagramaService service) {
        this.service = service;
    }

    @PostMapping("/anagrama")
    public String checarAnagrama(@RequestBody Anagrama anagrama) {

        boolean resultado = service.anagramas(anagrama.getPalavra1(), anagrama.getPalavra2());

        if (resultado) {
            return "As palavras são anagramas.";
        } else {
            return "As palavras não são anagramas.";
        }
    }
}
