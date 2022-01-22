package br.com.gustavogithub.desafiodio;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public abstract class Conteudo {

   protected static final double XP_PADRAO = 10d;

   private String title;
   private String description;

   public  abstract double calculateXp();
}
