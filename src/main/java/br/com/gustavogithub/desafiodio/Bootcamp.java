package br.com.gustavogithub.desafiodio;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@EqualsAndHashCode()

public class Bootcamp {

    private String name;
    private  String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);

    private Set<Dev> enrolledDevs = new HashSet<>();
    private  Set<Conteudo> content = new LinkedHashSet<>();


}
