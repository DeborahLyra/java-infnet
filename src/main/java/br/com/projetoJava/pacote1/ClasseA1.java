package br.com.projetoJava.pacote1;

import br.com.projetoJava.pacote2.ClasseB1;
import lombok.Getter;

@Getter
public class ClasseA1 {
    private String local;
    public void usarMetodoDeB1() {
        ClasseB1 classeB1 = new ClasseB1();
        classeB1.metodoB1();
    }
}