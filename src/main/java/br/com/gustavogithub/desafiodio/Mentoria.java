package br.com.gustavogithub.desafiodio;

import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)

public class Mentoria extends Conteudo{

    private LocalDate date;


    @Override
    public double calculateXp() {
        return XP_PADRAO + 25d;
    }
}
