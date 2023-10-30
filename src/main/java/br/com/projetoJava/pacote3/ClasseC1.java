package br.com.projetoJava.pacote3;

import br.com.projetoJava.pacote1.ClasseA1;

public class ClasseC1 {
    public void usarMetodoDeA1() {
        ClasseA1 classeA1 = new ClasseA1();
        classeA1.usarMetodoDeB1();
        classeA1.getLocal();
    }
}
