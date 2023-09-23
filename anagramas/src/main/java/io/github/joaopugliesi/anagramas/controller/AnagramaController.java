package io.github.joaopugliesi.anagramas.controller;

import io.github.joaopugliesi.anagramas.service.AnagramaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnagramaController {

    AnagramaService service;
    public AnagramaController(AnagramaService service) {
        this.service = service;
    }

    @GetMapping("/checkAnagram")
    public String checarAnagrama(@RequestParam("Palavra 1") String primeiraPalavra, @RequestParam("Palavra 2") String segundaPalavra) {

        boolean resultado = service.anagramas(primeiraPalavra, segundaPalavra);

        if (resultado) {
            return "As palavras são anagramas.";
        } else {
            return "As palavras não são anagramas.";
        }
    }
}
