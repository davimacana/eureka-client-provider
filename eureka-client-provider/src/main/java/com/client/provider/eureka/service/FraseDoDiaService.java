/**
 * 
 */
package com.client.provider.eureka.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

/**
 * @author Davi Maçana
 *
 */
@Service
public class FraseDoDiaService {

    private List<String> frases = Arrays.asList(
    		"O importante não é vencer todos os dias, mas lutar sempre.", 
    		"Desistir é para os fracos, então nem tente.", 
    		"Em briga de saci qualquer chute é uma voadora.",
    		"Quem cedo madruga passa o dia com sono.");

    public String getFraseDoDia() {
        Random random = new Random();
        int randomIndex = random.nextInt(frases.size());
        return frases.get(randomIndex);
    }

}