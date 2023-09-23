package io.github.joaopugliesi.anagramas.service;

import org.springframework.stereotype.Service;

@Service
public class AnagramaService {

    public boolean anagramas(String primeiraPalavra, String segundaPalavra) {
        // Remove espaços em branco e converte para letras minúsculas
        primeiraPalavra = primeiraPalavra.replaceAll("\\s", "").toLowerCase();
        segundaPalavra = segundaPalavra.replaceAll("\\s", "").toLowerCase();

        // Verifica se as palavras têm o mesmo tamanho
        if (primeiraPalavra.length() != segundaPalavra.length()) {
            return false;
        }

        // Cria um array para contar a frequência de cada caractere nas duas palavras
        int[] contadorCaractere = new int[26];

        // Conta a frequência de cada caractere na primeira palavra
        for (char c : primeiraPalavra.toCharArray()) {
            contadorCaractere[c - 'a']++;
        }

        // Decrementa a frequência de cada caractere na segunda palavra
        for (char c : segundaPalavra.toCharArray()) {
            contadorCaractere[c - 'a']--;
        }

        // Se todos os elementos do array charCount forem zero, as palavras são anagramas
        for (int contador : contadorCaractere) {
            if (contador != 0) {
                return false;
            }
        }

        return true;
    }
}
