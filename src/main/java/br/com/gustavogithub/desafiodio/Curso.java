package br.com.gustavogithub.desafiodio;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Curso extends Conteudo {

    private int workload;

    @Override
    public double calculateXp() {
        return XP_PADRAO * workload;
    }
}
