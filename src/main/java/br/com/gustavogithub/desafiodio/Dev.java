package br.com.gustavogithub.desafiodio;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Data
@EqualsAndHashCode()

public class Dev {
    private String name;
    private Set<Conteudo> subscribedContent = new LinkedHashSet<>();
    private Set<Conteudo> finishedContent = new LinkedHashSet<>();

    public void BootcampRegister(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContent());
        bootcamp.getEnrolledDevs().add(this);
    }
    public void toProgress(){
        Optional<Conteudo> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }

    }
    public double calculateTotalXp(){
        return this.finishedContent.stream().mapToDouble(Conteudo::calculateXp).sum();
    }


}
