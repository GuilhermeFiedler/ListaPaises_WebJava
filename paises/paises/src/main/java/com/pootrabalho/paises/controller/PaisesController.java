package com.pootrabalho.paises.controller;

import com.pootrabalho.paises.entity.Paises;
import com.pootrabalho.paises.service.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.List;
import java.text.Collator;
import java.util.Locale;

@Controller
public class PaisesController {

    @Autowired
    private PaisesService paisesService;

    @GetMapping("/paises")
    public String mostrarPaises(
            @RequestParam(required = false) String ordem,
            @RequestParam(required = false) String continente,
            Model model) {

        List<Paises> paises = paisesService.listarPaises();


        if (continente != null && !continente.isEmpty()) {
            paises = paises.stream()
                    .filter(p -> p.getContinente().equalsIgnoreCase(continente))
                    .toList();
        }

        Collator collator = Collator.getInstance(new Locale("pt", "BR"));
        collator.setStrength(Collator.PRIMARY);


        if ("nome".equals(ordem)) {
            paises = paises.stream()
                    .sorted(Comparator.comparing(Paises::getNome, collator))
                    .toList();
        } else if ("capital".equals(ordem)) {
            paises = paises.stream()
                    .sorted(Comparator.comparing(Paises::getCapital, collator))
                    .toList();
        } else if ("continente".equals(ordem)) {
            paises = paises.stream()
                    .sorted(Comparator.comparing(Paises::getContinente, collator))
                    .toList();
        }

        model.addAttribute("paises", paises);
        return "paises";
    }


}

