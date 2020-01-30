/**
 * 
 */
package com.client.provider.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.provider.eureka.service.FraseDoDiaService;

/**
 * @author Davi Maçana
 *
 */
@RestController
@RequestMapping("/frasedodia")
public class FraseDoDiaController {

	@Autowired
    private FraseDoDiaService fraseDoDiaService;

    @GetMapping
    public String getFraseDoDia() {
        return fraseDoDiaService.getFraseDoDia();
    }

}
