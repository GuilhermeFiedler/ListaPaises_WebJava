package com.pootrabalho.paises.service;
import com.pootrabalho.paises.entity.Paises;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisesService {

    public List<Paises> listarPaises() {
        return List.of(
                new Paises("Brasil", "Brasília", "América do Sul", "/images/brazil.png"),
                new Paises("França", "Paris", "Europa", "/images/france.png"),
                new Paises("Japão", "Tóquio", "Ásia", "/images/japan.png"),
                new Paises("Estados Unidos","Washington, D.C", "América do Norte", "/images/eua.png"),
                new Paises("Austrália","Canberra", "Oceania", "/images/australia.png"),
                new Paises("Alemanha", "Berlim", "Europa", "/images/germany.png"),
                new Paises("Canadá", "Ottawa", "América do Norte", "/images/canada.png"),
                new Paises("China", "Pequim", "Ásia", "/images/china.png"),
                new Paises("Egito", "Cairo", "África", "/images/egypt.png"),
                new Paises("Argentina", "Buenos Aires", "América do Sul", "/images/argentina.png"),
                new Paises("Itália", "Roma", "Europa", "/images/italy.png"),
                new Paises("África do Sul", "Pretória", "África", "/images/southafrica.png"),
                new Paises("Rússia", "Moscou", "Europa", "/images/russia.png"),
                new Paises("Índia", "Nova Délhi", "Ásia", "/images/india.png"),
                new Paises("México", "Cidade do México", "América do Norte", "/images/mexico.png")
                );
    }
}
